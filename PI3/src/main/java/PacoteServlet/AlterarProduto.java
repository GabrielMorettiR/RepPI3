/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteServlet;

import Entidades.Produto;
import PacotePrincipal.ProdutoDAO;
import PacoteUtils.Utils;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gabriel
 */
public class AlterarProduto extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Produto p = ProdutoDAO.getProduto(id);
        request.setAttribute("produto", p);
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/alterarProduto.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String nome = request.getParameter("nome");
        String desc = request.getParameter("desc");
        int categ = Integer.parseInt(request.getParameter("categoria"));
        int qtd = Integer.parseInt(request.getParameter("qtd"));
        Double preco = Double.parseDouble(request.getParameter("preco"));
        Produto produto = ProdutoDAO.getProduto(id);
        produto.setNome(nome);
        produto.setDescricao(desc);
        produto.setCategoria(categ);
        produto.setQuantidade(qtd);
        produto.setPreco(preco);
        
        try {
            ProdutoDAO.updateProduto(produto);
            Utils.Sucesso(response);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AlterarClientes.class.getName()).log(Level.SEVERE, null, ex);
            Utils.Erro(ex, request, response);
        }
    }

}

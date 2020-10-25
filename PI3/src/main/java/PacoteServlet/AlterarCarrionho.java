/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteServlet;

import Entidades.Carrinho;
import PacotePrincipal.CarrinhoDAO;
import PacoteUtils.Utils;
import java.io.IOException;
import java.io.PrintWriter;
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
 * @author ivanyuratakano
 */
public class AlterarCarrionho extends HttpServlet {

   
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idVenda = Integer.parseInt(request.getParameter("idvenda"));
        Carrinho carrinho = CarrinhoDAO.getCarrinho(idVenda);
        request.setAttribute("carrinho", carrinho);
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/alterarCarrinho.jsp");
        rd.forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int idVenda = Integer.parseInt(request.getParameter("idvenda"));
        int idProduto = Integer.parseInt(request.getParameter("idproduto"));
        String descricao = request.getParameter("descricaoproduto");
        int quantidade = Integer.parseInt(request.getParameter("quantidade"));
        Double valorUnitario = Double.parseDouble(request.getParameter("valorunitario"));
        Double subtotal= Double.parseDouble(request.getParameter("subtotal"));
        Double totalVenda= Double.parseDouble(request.getParameter("total"));
        
        Carrinho carrinho = CarrinhoDAO.getCarrinho(idVenda);
        carrinho.setIdProduto(idProduto);
        carrinho.setDescricaoProduto(descricao);
        carrinho.setQuantidade(quantidade);
        carrinho.setValorUnitario(valorUnitario);
        carrinho.setSubTotal(subtotal);
        carrinho.setValorTotal(totalVenda);
        
        try {
            CarrinhoDAO.updateCarrinho(carrinho);
            Utils.Sucesso(response);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AlterarClientes.class.getName()).log(Level.SEVERE, null, ex);
            Utils.Erro(ex, request, response);
        }
      
    }

  
}

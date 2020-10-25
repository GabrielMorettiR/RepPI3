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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ivanyuratakano
 */
public class CadastrarCarrinho extends HttpServlet {

   
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idVenda = Integer.parseInt(request.getParameter("idvenda"));
        int idProduto = Integer.parseInt(request.getParameter("idproduto"));
        String descricao = request.getParameter("descricaoproduto");  
        int quantidade = Integer.parseInt(request.getParameter("quantidade"));          
        double valorUnitario = Double.parseDouble(request.getParameter("valorunitario"));
        double subtotal = Double.parseDouble(request.getParameter("subtotal"));
        double valorTotal = Double.parseDouble(request.getParameter("total"));
        
        Carrinho p = new Carrinho(idVenda, idProduto, descricao, quantidade, valorUnitario, subtotal, valorTotal);
        try {
            CarrinhoDAO.addCarrinho(p);
            Utils.Sucesso(response);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CadastrarClientes.class.getName()).log(Level.SEVERE, null, ex);
            Utils.Erro(ex, request, response);
        }
    }    

}

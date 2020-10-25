/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteServlet;

import Entidades.Venda;
import PacotePrincipal.VendaDAO;
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
public class CadastrarVendas extends HttpServlet {

   
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    int idVenda = Integer.parseInt(request.getParameter("idvenda"));
    String cpfStr = request.getParameter("cpf");
    Long cpf = Long.parseLong(cpfStr);        
    double valorTotal = Double.parseDouble(request.getParameter("total"));

    Venda p = new Venda(idVenda, cpf, valorTotal);
    try {
        VendaDAO.addVenda(p);
        Utils.Sucesso(response);
    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(CadastrarClientes.class.getName()).log(Level.SEVERE, null, ex);
        Utils.Erro(ex, request, response);
    }
    }    

}

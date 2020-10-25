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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ivanyuratakano
 */
public class AlterarVendas extends HttpServlet {

  

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idVenda = Integer.parseInt(request.getParameter("idvenda"));
        Venda venda = VendaDAO.getVenda(idVenda);
        request.setAttribute("venda", venda);
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/alterarVenda.jsp");
        rd.forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idVenda = Integer.parseInt(request.getParameter("idvenda"));
        long cpf = Long.parseLong(request.getParameter("cpf"));
        Double totalVenda= Double.parseDouble(request.getParameter("total"));
        
        Venda venda = VendaDAO.getVenda(idVenda);
        venda.setCpf(cpf);
        venda.setTotalVenda(totalVenda);
        
        try {
            VendaDAO.updateVenda(venda);
            Utils.Sucesso(response);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AlterarClientes.class.getName()).log(Level.SEVERE, null, ex);
            Utils.Erro(ex, request, response);
        }
    }

}

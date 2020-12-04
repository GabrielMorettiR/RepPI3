/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gabriel
 */
public class SalvaCarrinho extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int idproduto = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("id", idproduto);

        RequestDispatcher rd = getServletContext()
                .getRequestDispatcher("/Protegido/Vendedor/carrinho.jsp");
        rd.forward(request, response);
    }
}

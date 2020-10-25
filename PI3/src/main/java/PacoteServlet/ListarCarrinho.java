/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteServlet;

import Entidades.Carrinho;
import PacotePrincipal.CarrinhoDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ivanyuratakano
 */
public class ListarCarrinho extends HttpServlet {

  
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         List<Carrinho> listaCarrinho = CarrinhoDAO.getCarrinho();
        request.setAttribute("listaCarrinho", listaCarrinho);
        
        RequestDispatcher requestDispatcher = getServletContext()
                .getRequestDispatcher("/listaCarrinho.jsp");
        requestDispatcher.forward(request, response);
    }

   
}

package PacoteServlet;

import Entidades.Venda;
import PacotePrincipal.VendaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gabriel
 */
public class Relatorio extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Venda> listaVendas = VendaDAO.getVendas();
        request.setAttribute("listaVendas", listaVendas);
        
        RequestDispatcher rd = getServletContext()
                .getRequestDispatcher("/listaVendas.jsp");
        rd.forward(request, response);
    }

}

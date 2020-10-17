package PacoteServlet;

import Entidades.Cliente;
import Entidades.Produto;
import PacotePrincipal.ClienteDAO;
import PacotePrincipal.ProdutoDAO;
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
 * @author Bruno
 */
public class ListarProdutos extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Produto> listaProdutos = ProdutoDAO.getProdutos();
        request.setAttribute("listaProdutos", listaProdutos);
        
        RequestDispatcher requestDispatcher = getServletContext()
                .getRequestDispatcher("/listaProdutos.jsp");
        requestDispatcher.forward(request, response);
    }
}

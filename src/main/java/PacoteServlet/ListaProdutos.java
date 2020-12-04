package PacoteServlet;

import Entidades.Produto;
import PacotePrincipal.ProdutoDAO;
import java.io.IOException;
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
public class ListaProdutos extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Produto> listaProdutos = ProdutoDAO.getProdutos();
        request.setAttribute("listaProdutos", listaProdutos);
        
        RequestDispatcher requestDispatcher = getServletContext()
                .getRequestDispatcher("/Protegido/Listagem/listaProdutos.jsp");
        requestDispatcher.forward(request, response);
    }
}

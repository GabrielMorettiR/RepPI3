package PacoteServlet;

import Entidades.Cliente;
import Entidades.Relatorio;
import PacotePrincipal.ClienteDAO;
import PacotePrincipal.RelatorioDAO;
import java.io.IOException;
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
public class ListarRelatorio extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Relatorio> listaVendas = RelatorioDAO.getVendas();
        request.setAttribute("listaVendas", listaVendas);

        List<Cliente> listaClientes = ClienteDAO.getClientes();
        request.setAttribute("listaClientes", listaClientes);

        RequestDispatcher rd = getServletContext()
                .getRequestDispatcher("/listaVendas.jsp");
        rd.forward(request, response);
    }
}

package PacoteServlet;

import Entidades.Categoria;
import Entidades.Cliente;
import Entidades.Filial;
import Entidades.Relatorio;
import PacotePrincipal.CategoriaDAO;
import PacotePrincipal.ClienteDAO;
import PacotePrincipal.FilialDAO;
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
public class ListaRelatorio extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Relatorio> listaVendas = RelatorioDAO.getVendas();
        request.setAttribute("listaVendas", listaVendas);
        
        List<Filial> listaFilial = FilialDAO.getFilial();
        request.setAttribute("listaFilial", listaFilial);

        List<Cliente> listaClientes = ClienteDAO.getClientes();
        request.setAttribute("listaClientes", listaClientes);
        
        List<Categoria> listaCategoria = CategoriaDAO.getCategoria();
        request.setAttribute("listaCategoria", listaCategoria);

        RequestDispatcher rd = getServletContext()
                .getRequestDispatcher("/Protegido/Listagem/listaVendas.jsp");
        rd.forward(request, response);
    }
    
    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long cpf = Long.parseLong(request.getParameter("SelCliente"));
        int categoria = Integer.parseInt(request.getParameter("SelCateg"));
        int filial = Integer.parseInt(request.getParameter("SelFili"));
        
//        Relatorio r = new Relatorio(cpf, categoria, filial);
        RelatorioDAO.getVendas(cpf, categoria, filial);
    }
}

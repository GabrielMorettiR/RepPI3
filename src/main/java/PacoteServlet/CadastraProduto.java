package PacoteServlet;

import Entidades.Categoria;
import Entidades.Produto;
import PacotePrincipal.CategoriaDAO;
import PacotePrincipal.ProdutoDAO;
import Utils.Utils;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Bruno
 */
public class CadastraProduto extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Categoria> listaCategoria = CategoriaDAO.getCategoria();
        request.setAttribute("listaCategoria", listaCategoria);
        
        RequestDispatcher requestDispatcher = getServletContext()
                .getRequestDispatcher("/Protegido/Admin/cadastrarProdutos.jsp");
        requestDispatcher.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = 1;
        String nome = request.getParameter("nome");
        String desc = request.getParameter("desc");
        int categoria = Integer.parseInt(request.getParameter("categoria"));
        int quantidade = Integer.parseInt(request.getParameter("qtd"));
        double preco = Double.parseDouble(request.getParameter("preco"));
        
        Produto p = new Produto(id, nome, desc, categoria, quantidade, preco);
        try {
            ProdutoDAO.addProduto(p);
            Utils.Sucesso(response);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CadastraProduto.class.getName()).log(Level.SEVERE, null, ex);
            Utils.Erro(ex, request, response);
        }
    }

}

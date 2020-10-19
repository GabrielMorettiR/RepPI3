package PacoteServlet;

import Entidades.Produto;
import PacotePrincipal.ProdutoDAO;
import PacoteUtils.Utils;
import java.io.IOException;
import java.io.PrintWriter;
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
public class CadastrarProduto extends HttpServlet {
    
    
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
            Logger.getLogger(CadastrarClientes.class.getName()).log(Level.SEVERE, null, ex);
            Utils.Erro(ex, request, response);
        }
    }

}

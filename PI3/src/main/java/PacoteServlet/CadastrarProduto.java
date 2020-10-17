package PacoteServlet;

import Entidades.Cliente;
import Entidades.Produto;
import PacotePrincipal.ClienteDAO;
import PacotePrincipal.ProdutoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        String nome = request.getParameter("nome");
        String categoria = request.getParameter("categoria");
        String quant = request.getParameter("quantidade");
        String preçoStr = request.getParameter("preço");
        int quantidade = Integer.parseInt(quant);
        double preço = Double.parseDouble(preçoStr);
        
        Produto p = new Produto(nome, categoria, quantidade, preço);
        try {
            ProdutoDAO.addProduto(p);
            response.sendRedirect("sucesso.jsp");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CadastrarProduto.class.getName()).log(Level.SEVERE, null, ex);
            response.sendRedirect("erro.jsp");
        }
    }

}

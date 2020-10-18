package PacoteServlet;

import Entidades.Cliente;
import PacotePrincipal.ClienteDAO;
import PacoteUtils.Utils;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gabriel
 */
public class CadastrarClientes extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String email = request.getParameter("Email");
        String cpfStr = request.getParameter("cpf");
        String telefone = request.getParameter("telefone");
        String endereco = request.getParameter("endereco");
        Long cpf = Long.parseLong(cpfStr);

        Cliente cliente = new Cliente(nome, email, cpf, telefone, endereco);
        try {
            ClienteDAO.addCliente(cliente);
            Utils.Sucesso(response);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CadastrarClientes.class.getName()).log(Level.SEVERE, null, ex);
            Utils.Erro(ex, request, response);

        }
    }
}

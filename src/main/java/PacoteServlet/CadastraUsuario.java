package PacoteServlet;

import Entidades.Usuario;
import PacotePrincipal.UsuarioDAO;
import Utils.Utils;
import java.io.IOException;
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
public class CadastraUsuario extends HttpServlet {

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        RequestDispatcher requestDispatcher = getServletContext()
                .getRequestDispatcher("/Protegido/Gerente/cadastrarUsuario.jsp");
        requestDispatcher.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        int perfil = Integer.parseInt(request.getParameter("perfil"));
        int filial = Integer.parseInt(request.getParameter("filial"));
        Usuario u = new Usuario();
                u.setNome(nome);
                u.setIdperfil(perfil);
                u.setLogin(login);
                u.setSenha(u.codificarSenha(senha));
                u.setFilial(filial);
                
       try {
           UsuarioDAO.createUsuario(u);
       } catch (ClassNotFoundException | SQLException ex) {
           Logger.getLogger(CadastraUsuario.class.getName()).log(Level.SEVERE, null, ex);
       }
            Utils.Sucesso(response);
        

    }
}

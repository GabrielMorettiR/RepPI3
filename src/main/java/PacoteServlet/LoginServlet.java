package PacoteServlet;

import Entidades.Usuario;
import PacotePrincipal.UsuarioDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Bruno
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        
        Usuario usuario = UsuarioDAO.getUsuario(login);
        if (usuario != null && usuario.validarSenha(senha)) {
            HttpSession sessao = request.getSession();
            sessao.setAttribute("usuario", usuario);
            response.sendRedirect(request.getContextPath() + "/Protegido/index.jsp");
        } else {
            response.sendRedirect(request.getContextPath() + "/login.jsp?erro=1");
            
        }
    }

}

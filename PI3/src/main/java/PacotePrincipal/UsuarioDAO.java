package PacotePrincipal;

import Entidades.Cliente;
import Entidades.Usuario;
import PacoteServlet.ServletBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bruno
 */
public class UsuarioDAO {
    
    public static Usuario getUsuario(String login, String senha) {
        Usuario usuario = null;
        try {
            Connection con = ConexaoBD.getConexao();
            String query = "select * from usuario where login=? and senha=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, login);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String nome = rs.getString("nome");
                String perfil = rs.getString("perfil");
                usuario = new Usuario();
                usuario.setNome(nome);
                usuario.setPerfil(perfil);
                usuario.setLogin(login);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ServletBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuario;
    }
}

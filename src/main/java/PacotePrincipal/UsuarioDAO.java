package PacotePrincipal;

import Entidades.Usuario;
import PacoteServlet.ServletDB;
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
    
    public static Usuario getUsuario(String login) {
        Usuario usuario = null;
        try {
            Connection con = ConexaoBD.getConexao();
            String query = "select u.NOME,u.login,u.SENHA,u.PERFIL,u.IDFILIAL, p.NOME as perf"
                    + " from usuario u join perfil p on u.PERFIL = p.ID where u.login=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, login);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String nome = rs.getString("nome");
                int perfil = rs.getInt("perfil");
                String senha = rs.getString("senha");
                String perf = rs.getString("perf");
                int filial = rs.getInt("idfilial");
                usuario = new Usuario();
                usuario.setNome(nome);
                usuario.setIdperfil(perfil);
                usuario.setLogin(login);
                usuario.setSenha(senha);
                usuario.setFilial(filial);
                usuario.setPerfil(perf);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ServletDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuario;
    }
    
    public static void createUsuario(Usuario u) throws ClassNotFoundException, SQLException{
        Connection con = ConexaoBD.getConexao();
        String query = "insert into usuario(nome, login, senha, perfil, idfilial) values (?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, u.getNome());
        ps.setString(2, u.getLogin());
        ps.setString(3, u.getSenha());
        ps.setInt(4, u.getIdperfil());
        ps.setInt(5, u.getFilial());
        ps.execute();
    }
}

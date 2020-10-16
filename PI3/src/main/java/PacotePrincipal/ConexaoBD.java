package PacotePrincipal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bruno
 */
public class ConexaoBD {
    
    static {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static Connection getConexao() throws ClassNotFoundException, SQLException{
        String url = "jdbc:derby://localhost:1527/NerdolasDB";
        String user = "adm";
        String password = "123";
        return DriverManager.getConnection(url, user, password);
    }
    
}

package PacotePrincipal;

import Entidades.Cliente;
import PacoteServlet.ServletBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClienteDAO {
    
    public static List<Cliente> getClientes() {
        List<Cliente> listaClientes = new ArrayList();
        try {
            Connection con = ConexaoBD.getConexao();
            String query = "select * from cliente";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                Long cpf = rs.getLong("cpf");
                String tel = rs.getString("telefone");
                String end = rs.getString("endereco");
                listaClientes.add(new Cliente(nome, email, cpf, tel, end));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServletBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaClientes;
    }
    
    public static void addCliente(Cliente cliente) throws ClassNotFoundException, SQLException{
        Connection con = ConexaoBD.getConexao();
        String query = "insert into cliente(nome, cpf, telefone, endereco, email) values (?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, cliente.getNome());
        ps.setLong(2, cliente.getCpf());
        ps.setString(3, cliente.getTelefone());
        ps.setString(4, cliente.getEndereco());
        ps.setString(5, cliente.getEmail());
        ps.execute();
    }

}

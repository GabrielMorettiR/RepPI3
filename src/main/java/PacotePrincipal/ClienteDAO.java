package PacotePrincipal;

import Entidades.Cliente;
import PacoteServlet.ServletDB;
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
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ServletDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaClientes;
    }

    public static void addCliente(Cliente cliente) throws ClassNotFoundException, SQLException {
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

    public static void updateCliente(Cliente cliente) throws ClassNotFoundException, SQLException {
        Connection con = ConexaoBD.getConexao();
        String query = "update cliente set nome=?,email=?,telefone=?,endereco=? where cpf=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, cliente.getNome());
        ps.setString(2, cliente.getEmail());
        ps.setString(3, cliente.getTelefone());
        ps.setString(4, cliente.getEndereco());
        ps.setLong(5, cliente.getCpf());
        ps.execute();
    }
    
    public static void deleteCliente(Long cpf) throws ClassNotFoundException, SQLException {
        Connection con = ConexaoBD.getConexao();
        String query = "delete from cliente where cpf=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setLong(1, cpf);
        ps.execute();
    }

    public static Cliente getCliente(long cpf) {
        Cliente cliente = null;
        try {
            Connection con = ConexaoBD.getConexao();
            String query = "select * from cliente where cpf=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setLong(1, cpf);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");
                String endereco = rs.getString("endereco");
                cliente = new Cliente(nome, email, cpf, telefone, endereco);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServletDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }
}

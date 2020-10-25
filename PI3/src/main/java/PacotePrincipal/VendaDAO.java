/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacotePrincipal;

import Entidades.Cliente;
import Entidades.Venda;
import PacoteServlet.ServletBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ivanyuratakano
 */
public class VendaDAO {
     public static List<Venda> getVenda() {  //RETRIEVE
        List<Venda> listaVenda = new ArrayList();
        try {
            Connection con = ConexaoBD.getConexao();
            String query = "select * from venda";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                int idVenda = rs.getInt("idvenda");
                Long cpf = rs.getLong("cpf");                               
                double totalVenda = rs.getDouble("total");
                
                listaVenda.add(new Venda(idVenda, cpf, totalVenda));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ServletBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaVenda;
    }
     
     public static void addVenda(Venda venda) throws ClassNotFoundException, SQLException {
        Connection con = ConexaoBD.getConexao();
        String query = "insert into venda(idvenda, cpf, total) values (?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, venda.getIdVenda());
        ps.setLong(2, venda.getCpf());
        ps.setDouble(3, venda.getTotalVenda());        
        ps.execute();
    }
      public static void updateVenda(Venda venda) throws ClassNotFoundException, SQLException {
        Connection con = ConexaoBD.getConexao();
        String query = "update venda set cpf=?,total=?, where idvenda=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setLong(1, venda.getCpf());
        ps.setDouble(2, venda.getTotalVenda());        
        ps.setInt(3, venda.getIdVenda());
        ps.execute();
    }
      public static void deleteVenda(int idVenda) throws ClassNotFoundException, SQLException {
        Connection con = ConexaoBD.getConexao();
        String query = "delete from venda where = idvenda = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, idVenda);
        ps.execute();
    }
      public static Venda getVenda(int idVenda) {
        Venda venda = null;
        try {
            Connection con = ConexaoBD.getConexao();
            String query = "select * from venda where idvenda=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setLong(1, idVenda);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                long cpf = rs.getLong("cpf");
                double total = rs.getDouble("total");                
                venda = new Venda(idVenda, cpf, total);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServletBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return venda;
    }
}

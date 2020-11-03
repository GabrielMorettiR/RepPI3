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
     public static List<Venda> getVendas() {  //RETRIEVE
        List<Venda> listaVenda = new ArrayList();
        try {
            Connection con = ConexaoBD.getConexao();
            String query = "select * from venda";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idVenda = rs.getInt("idvenda");
                int idproduto = rs.getInt("id");
                long cpf = rs.getLong("cpf");
                int quantidade = rs.getInt("quantidade");
                double preco = rs.getDouble("preco");
                int filial = rs.getInt("idfilial");
                
                listaVenda.add(new Venda(idproduto, cpf, quantidade, preco, filial));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ServletBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaVenda;
    }
     
     public static void addVenda(Venda venda) throws ClassNotFoundException, SQLException {
        Connection con = ConexaoBD.getConexao();
        String query = "insert into venda (id, cpf, quantidade, preco, idfilial) values (?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, venda.getIdproduto());
        ps.setLong(2, venda.getCpf());
        ps.setInt(3, venda.getQuantidade());
        ps.setDouble(4, venda.getPreco());
        ps.setInt(5, venda.getFilial());
        ps.execute();
    }
      public static void deleteVenda(int idVenda) throws ClassNotFoundException, SQLException {
        Connection con = ConexaoBD.getConexao();
        String query = "delete from venda where idvenda = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, idVenda);
        ps.execute();
    }
      public static Venda getVenda(String condition) {
        Venda venda = null;
        try {
            Connection con = ConexaoBD.getConexao();
            String query = "select * from venda where" + condition;
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int idVenda = rs.getInt("idvenda");
                int idproduto = rs.getInt("id");
                long cpf = rs.getLong("cpf");
                int quantidade = rs.getInt("quantidade");
                double preco = rs.getDouble("preco");
                int filial = rs.getInt("idfilial");
                venda = new Venda(idproduto, cpf, quantidade, preco, filial);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ServletBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return venda;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacotePrincipal;

import Entidades.Carrinho;
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
public class CarrinhoDAO {
     public static List<Carrinho> getCarrinho() {  //RETRIEVE
        List<Carrinho> listaCarrinho = new ArrayList();
        try {
            Connection con = ConexaoBD.getConexao();
            String query = "select * from carrinho";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                int idVenda = rs.getInt("idvenda");
                int idProduto = rs.getInt("idproduto");
                String descricaoProduto = rs.getString("descricaoproduto");
                int quantidade = rs.getInt("quqntidade");
                double valorUnitario = rs.getDouble("valorunitario");
                double subTotal = rs.getDouble("subtotal");
                double valorTotal = rs.getDouble("valorTotal");
                
                listaCarrinho.add(new Carrinho(idVenda, idProduto,descricaoProduto, quantidade, valorUnitario, subTotal, valorTotal));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ServletBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaCarrinho;
    }
     
     public static void addCarrinho(Carrinho carrinho) throws ClassNotFoundException, SQLException {
        Connection con = ConexaoBD.getConexao();
        String query = "insert into carrinho(idvenda, idproduto, descricaoproduto, quantidade, valorunitario,subtotal, total) values (?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, carrinho.getIdVenda());
        ps.setInt(2, carrinho.getIdProduto());
        ps.setInt(3, carrinho.getQuantidade());
        ps.setString(4, carrinho.getDescricaoProduto());
        ps.setDouble(5, carrinho.getValorUnitario());    
        ps.setDouble(6, carrinho.getSubTotal());       
        ps.setDouble(7, carrinho.getValorTotal());       
        ps.execute();
    }
      public static void updateCarrinho(Carrinho carrinho) throws ClassNotFoundException, SQLException {
        Connection con = ConexaoBD.getConexao();
        String query = "update carrinho set idproduto=?,quantidade=?,valorunitario=?,subtotal=?,total=? where idvenda=?";
        PreparedStatement ps = con.prepareStatement(query);        
        ps.setInt(1, carrinho.getIdProduto());
        ps.setInt(2, carrinho.getQuantidade());
        ps.setString(3, carrinho.getDescricaoProduto());
        ps.setDouble(4, carrinho.getValorUnitario());    
        ps.setDouble(5, carrinho.getSubTotal());       
        ps.setDouble(6, carrinho.getValorTotal());
        ps.setInt(7, carrinho.getIdVenda());
        ps.execute();
    }
      public static void deleteCarrinho (int idVenda) throws ClassNotFoundException, SQLException {
        Connection con = ConexaoBD.getConexao();
        String query = "delete from carrinho where = idvenda = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, idVenda);
        ps.execute();
    }
      public static Carrinho getCarrinho(int idVenda) {
        Carrinho carrinho = null;
        try {
            Connection con = ConexaoBD.getConexao();
            String query = "select * from carrinho where idvenda=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setLong(1, idVenda);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {                
                int idProduto = rs.getInt("idproduto");
                String descricaoProduto = rs.getString("descricaoproduto");
                int quantidade = rs.getInt("quqntidade");
                double valorUnitario = rs.getDouble("valorunitario");
                double subTotal = rs.getDouble("subtotal");
                double valorTotal = rs.getDouble("valorTotal");               
                carrinho = new Carrinho(idVenda, idProduto, descricaoProduto, quantidade, valorUnitario, subTotal, valorTotal);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServletBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return carrinho;
    }
}

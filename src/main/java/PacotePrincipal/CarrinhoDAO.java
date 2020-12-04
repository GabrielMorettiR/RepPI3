/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacotePrincipal;

import Entidades.Carrinho;
import Entidades.Relatorio;
import Entidades.Venda;
import PacoteServlet.ServletDB;
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
 * @author Gabriel
 */
public class CarrinhoDAO {

    public static List<Carrinho> getCarrinho() {  //RETRIEVE
        List<Carrinho> listCarrinho = new ArrayList();
        try {
            Connection con = ConexaoBD.getConexao();
            String query = "";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                listCarrinho.add(new Carrinho(1,1,1,"",""));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ServletDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listCarrinho;
    }
    
    public static void addProduto(int id, int qtd, double preco) throws ClassNotFoundException, SQLException {
        Connection con = ConexaoBD.getConexao();
        String query = "insert into carrinho (idproduto, quantidade, preco) values (?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.setInt(2, qtd);
        ps.setDouble(3, preco);
        ps.execute();
    }
}

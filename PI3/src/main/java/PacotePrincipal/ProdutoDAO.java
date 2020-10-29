package PacotePrincipal;

import Entidades.Produto;
import PacoteServlet.ServletBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServlet;
/**
 *
 * @author Bruno
 */
public class ProdutoDAO extends HttpServlet {

    public static List<Produto> getProdutos() {  //RETRIEVE
        List<Produto> listaProdutos = new ArrayList();
        try {
            Connection con = ConexaoBD.getConexao();
            String query = "select * from produto";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String desc = rs.getString("descricao");
                int categoria = rs.getInt("idcategoria");
                int quantidade = rs.getInt("quantidade");
                double preco = rs.getDouble("preco");
                listaProdutos.add(new Produto(id, nome, desc, categoria, quantidade, preco));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ServletBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaProdutos;
    }

    public static Produto getProduto(int id) {
        Produto p = null;
        Connection con;
        try {
            con = ConexaoBD.getConexao();
            String query = "select * from produto where id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String nome = rs.getString("nome");
                String desc = rs.getString("descricao");
                int categ = Integer.parseInt(rs.getString("idcategoria"));
                int qtd = Integer.parseInt(rs.getString("quantidade"));
                double preco = Double.parseDouble(rs.getString("preco"));
                p = new Produto(id, nome, desc, categ, qtd, preco);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }

    public static void addProduto(Produto p) throws ClassNotFoundException, SQLException {  //CREATE
        Connection con = ConexaoBD.getConexao();
        String query = "insert into produto(nome, descricao, idcategoria, quantidade, preco) values (?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, p.getNome());
        ps.setString(2, p.getDescricao());
        ps.setInt(3, p.getCategoria());
        ps.setInt(4, p.getQuantidade());
        ps.setDouble(5, p.getPreco());
        ps.execute();
    }

    public static void updateProduto(Produto p) throws ClassNotFoundException, SQLException {
        Connection con = ConexaoBD.getConexao();
        String query = "update produto set nome=?,descricao=?,idcategoria=?,quantidade=?,preco=? where id=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, p.getNome());
        ps.setString(2, p.getDescricao());
        ps.setInt(3, p.getCategoria());
        ps.setInt(4, p.getQuantidade());
        ps.setDouble(5, p.getPreco());
        ps.setInt(6, p.getId());
        ps.execute();
    }
    
    public static void deleteProduto(int id) throws ClassNotFoundException, SQLException {
        Connection con = ConexaoBD.getConexao();
        String query = "delete from produto where id=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setLong(1, id);
        ps.execute();
    }
    
    public static int count() {  //RETRIEVE
        int count = 0;
        try {
            Connection con = ConexaoBD.getConexao();
            String query = "select count(*) from produto";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                count = rs.getInt("1");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ServletBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
}

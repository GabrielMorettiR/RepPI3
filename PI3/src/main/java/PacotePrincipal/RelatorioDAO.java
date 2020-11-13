package PacotePrincipal;

import Entidades.Relatorio;
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
 * @author Gabriel
 */
public class RelatorioDAO {

    public static List<Relatorio> getVendas() {  //RETRIEVE
        List<Relatorio> listaVendas = new ArrayList();
        try {
            Connection con = ConexaoBD.getConexao();
            String query = "select v.IDVENDA, v.ID, p.NOME, v.QUANTIDADE, cli.NOME as cli, cli.CPF, p.PRECO, f.IDFILIAL, f.NOME as filial, c.TITULO, c.ID from venda v\n"
                    + " join produto p on v.ID = p.ID\n"
                    + " join categoria c on p.IDCATEGORIA = c.ID\n"
                    + " join cliente cli on v.CPF = cli.CPF\n"
                    + " join filial f on v.IDFILIAL = f.IDFILIAL";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idVenda = rs.getInt("IDVENDA");
                int idProduto = rs.getInt("ID");
                String nomeProduto = rs.getString("NOME");
                int quantidade = rs.getInt("QUANTIDADE");
                String nomeCliente = rs.getString("cli");
                long cpf = rs.getLong("CPF");
                double preco = rs.getDouble("PRECO");
                int filial = rs.getInt("IDFILIAL");
                String nomeFilial = rs.getString("filial");
                String categoria = rs.getString("TITULO");
                int idCategoria = rs.getInt("ID");
                listaVendas.add(new Relatorio(idVenda, idProduto, nomeProduto, cpf, nomeCliente, quantidade, preco, filial, nomeFilial, idCategoria, categoria));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ServletBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaVendas;
    }

    public static List<Relatorio> getVendasCPF(String cpfCli) {
        List<Relatorio> listaVendas = new ArrayList();
        try {
            Connection con = ConexaoBD.getConexao();
            String query = "select v.IDVENDA, v.ID, p.NOME, v.QUANTIDADE, cli.NOME as cli, cli.CPF, p.PRECO, f.IDFILIAL, f.NOME as filial, c.TITULO, c.ID from venda on v.cpf = " + cpfCli + "\n"
                    + " join produto p on v.ID = p.ID\n"
                    + " join categoria c on p.IDCATEGORIA = c.ID\n"
                    + " join cliente cli on v.CPF = cli.CPF\n"
                    + " join filial f on v.IDFILIAL = f.IDFILIAL";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            long cpf = Long.parseLong(cpfCli);
            while (rs.next()) {
                int idVenda = rs.getInt("IDVENDA");
                int idProduto = rs.getInt("ID");
                String nomeProduto = rs.getString("NOME");
                int quantidade = rs.getInt("QUANTIDADE");
                String nomeCliente = rs.getString("cli");
                
                double preco = rs.getDouble("PRECO");
                int filial = rs.getInt("IDFILIAL");
                String nomeFilial = rs.getString("filial");
                String categoria = rs.getString("TITULO");
                int idCategoria = rs.getInt("ID");
//                listaVendas.add(new Relatorio());
                listaVendas.add(new Relatorio(idVenda, idProduto, nomeProduto, cpf, nomeCliente, quantidade, preco, filial, nomeFilial, idCategoria, categoria));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ServletBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaVendas;
    }
    
    public static List<Relatorio> getVendasCat(String categoria){
        List<Relatorio> listaVendas = new ArrayList();
        try {
            Connection con = ConexaoBD.getConexao();
            String query = "select v.IDVENDA, v.ID, p.NOME, v.QUANTIDADE, cli.NOME as cli, cli.CPF, p.PRECO, f.IDFILIAL, f.NOME as filial, c.TITULO, c.ID from venda on v.categoria = " + categoria + "\n"
                    + " join produto p on v.ID = p.ID\n"
                    + " join categoria c on p.IDCATEGORIA = c.ID\n"
                    + " join cliente cli on v.CPF = cli.CPF\n"
                    + " join filial f on v.IDFILIAL = f.IDFILIAL";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            String categoriaSTR = categoria;
            while (rs.next()) {
                int idVenda = rs.getInt("IDVENDA");
                int idProduto = rs.getInt("ID");
                String nomeProduto = rs.getString("NOME");
                int quantidade = rs.getInt("QUANTIDADE");
                String nomeCliente = rs.getString("cli");
                long cpf = rs.getLong("CPF");
                double preco = rs.getDouble("PRECO");
                int filial = rs.getInt("IDFILIAL");
                String nomeFilial = rs.getString("filial");

                int idCategoria = rs.getInt("ID");
//                listaVendas.add(new Relatorio());
                listaVendas.add(new Relatorio(idVenda, idProduto, nomeProduto, cpf, nomeCliente, quantidade, preco, filial, nomeFilial, idCategoria, categoriaSTR));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ServletBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaVendas;
    }

    public static List<Relatorio> getVendasFili(String filial){
        List<Relatorio> listaVendas = new ArrayList();
        try {
            Connection con = ConexaoBD.getConexao();
            String query = "select v.IDVENDA, v.ID, p.NOME, v.QUANTIDADE, cli.NOME as cli, cli.CPF, p.PRECO, f.IDFILIAL, f.NOME as filial, c.TITULO, c.ID from venda on v.filial = " + filial + "\n"
                    + " join produto p on v.ID = p.ID\n"
                    + " join categoria c on p.IDCATEGORIA = c.ID\n"
                    + " join cliente cli on v.CPF = cli.CPF\n"
                    + " join filial f on v.IDFILIAL = f.IDFILIAL";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            int filialInt = Integer.parseInt(filial);
            while (rs.next()) {
                int idVenda = rs.getInt("IDVENDA");
                int idProduto = rs.getInt("ID");
                String nomeProduto = rs.getString("NOME");
                int quantidade = rs.getInt("QUANTIDADE");
                String nomeCliente = rs.getString("cli");
                long cpf = rs.getLong("CPF");
                double preco = rs.getDouble("PRECO");

                String nomeFilial = rs.getString("filial");
                String categoria = rs.getString("TITULO");
                int idCategoria = rs.getInt("ID");
//                listaVendas.add(new Relatorio());
                listaVendas.add(new Relatorio(idVenda, idProduto, nomeProduto, cpf, nomeCliente, quantidade, preco, filialInt, nomeFilial, idCategoria, categoria));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ServletBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaVendas;
    }
}

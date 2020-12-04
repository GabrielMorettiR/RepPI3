package PacoteServlet;

import Entidades.Cliente;
import Entidades.Filial;
import Entidades.Produto;
import Entidades.Venda;
import PacotePrincipal.CarrinhoDAO;
import PacotePrincipal.ClienteDAO;
import PacotePrincipal.FilialDAO;
import PacotePrincipal.ProdutoDAO;
import PacotePrincipal.VendaDAO;
import Utils.Utils;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ivanyuratakano
 */
public class CadastrarVendas extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Cliente> listaClientes = ClienteDAO.getClientes();
        request.setAttribute("listaClientes", listaClientes);

        List<Produto> listaProdutos = ProdutoDAO.getProdutos();
        request.setAttribute("listaProdutos", listaProdutos);

        List<Filial> listaFiliais = FilialDAO.getFilial();
        request.setAttribute("listaFiliais", listaFiliais);

        RequestDispatcher rd = getServletContext()
                .getRequestDispatcher("/Protegido/Vendedor/venda.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int idproduto = Integer.parseInt(request.getParameter("idproduto"));
        Long cpf = Long.parseLong(request.getParameter("cpf"));
        int quantidade = Integer.parseInt(request.getParameter("quantidade"));
        int filial = Integer.parseInt(request.getParameter("filial"));
        Venda p = new Venda(idproduto, cpf, quantidade, filial);
        boolean b = false;
        try {
            b = ProdutoDAO.vendeProduto(idproduto, quantidade);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CadastrarVendas.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
//            CarrinhoDAO.addProduto(idproduto, quantidade, preco);
            if (b) {
                VendaDAO.addVenda(p);
                Utils.Sucesso(response);
            }
            else{
            Utils.Qtd(response);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CadastrarVendas.class.getName()).log(Level.SEVERE, null, ex);
            Utils.Erro(ex, request, response);
        }
    }
}


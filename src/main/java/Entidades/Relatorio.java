package Entidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Relatorio {
    private int idVenda;
    private int idproduto;
    private String nomeProduto;
    private long cpf;
    private String nomeCliente;
    private int quantidade;
    private double preco;
    private int idFilial;
    private String filial;
    private int idCategoria;
    private String categoria;

    public Relatorio(int idVenda, int idProduto, String nomeProduto, long cpf, String nomeCliente, int quantidade, double preco, int idFilial, String nomeFilial, int idCategoria, String categoria) {
        this.idVenda = idVenda;
        this.idproduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.cpf = cpf;
        this.nomeCliente = nomeCliente;
        this.quantidade = quantidade;
        this.preco = preco;
        this.idFilial = idFilial;
        this.filial = nomeFilial;
        this.idCategoria = idCategoria;
        this.categoria = categoria;
    }

    public Relatorio() {
    }

    public Relatorio (long cpf, String categoria, String filial){
        this.cpf = cpf;
        this.categoria = categoria;
        this.filial = filial;
    }
    
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }    
}

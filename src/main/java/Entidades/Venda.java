package Entidades;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ivanyuratakano
 */
@Getter
@Setter

public class Venda {
    private int idVenda;
    private int idproduto;
    private long cpf;
    private int quantidade;
    private double preco;
    private int filial;
    
    public Venda(int idproduto, long cpf, int quantidade, double preco, int filial) {
        this.idproduto = idproduto;
        this.cpf = cpf;
        this.quantidade = quantidade;
        this.preco = preco;
        this.filial = filial;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}

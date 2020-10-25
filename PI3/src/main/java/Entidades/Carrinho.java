/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ivanyuratakano
 */

@Getter
@Setter

public class Carrinho {
    private int idVenda;    
    private int idProduto;
    private String descricaoProduto;
    private int quantidade;
    private double valorUnitario;
    private double subTotal;
    private double valorTotal;

    public Carrinho(int idVenda, int idProduto,String descricaoProduto, int quantidade, double valorUnitario, double subTotal, double valorTotal) {
        this.idVenda = idVenda;
        this.idProduto = idProduto;
        this.descricaoProduto = descricaoProduto;
        this.quantidade = quantidade;        
        this.valorUnitario = valorUnitario;
        this.subTotal = subTotal;
        this.valorTotal = valorTotal;
    }


    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}

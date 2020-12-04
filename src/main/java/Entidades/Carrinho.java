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
 * @author Gabriel
 */
@Getter
@Setter

public class Carrinho {
    private int idproduto;
    private int quantidade;
    private double preco;
    private String nomeProd;
    private String categoria;

    public Carrinho(int idproduto, int quantidade, double preco, String nomeProd, String categoria) {
        this.idproduto = idproduto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.nomeProd = nomeProd;
        this.categoria = categoria;
    }
    
    
    
}

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


public class Venda {
    private int idVenda;   
    
    private long cpf;
    private double totalVenda;

    public Venda(int idVenda, long cpf, double totalVenda) {
        this.idVenda = idVenda;
        
        this.cpf = cpf;        
        this.totalVenda = totalVenda;
    }


    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}

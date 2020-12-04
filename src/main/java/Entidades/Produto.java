package Entidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private int categoria;
    private int quantidade;
    private double preco;

    public Produto(int id, String nome, String descricao, int categoria, int quantidade, double preço) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.preco = preço;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }    
}

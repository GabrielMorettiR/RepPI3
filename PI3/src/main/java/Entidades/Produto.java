package Entidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Produto {
    private String nome;
    private String categoria;
    private int quantidade;
    private double preço;

    public Produto(String nome, String categoria, int quantidade, double preço) {
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.preço = preço;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s <br/> Categoria: %s <br/> Quantidade: %d <br/> Preço: %.2f <hr/>", nome, categoria, quantidade, preço);
    }
    
    
    
}

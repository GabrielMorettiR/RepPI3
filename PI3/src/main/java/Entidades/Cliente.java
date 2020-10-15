package Entidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter 
public class Cliente {
    private String nome;
    private String email;
    private Long cpf;

    public Cliente(String nome, String email, Long cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s <br/> Email: %s <br/> CPF: %d <hr/>", nome, email, cpf);
    }

    
    
    
}

package Entidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter 
public class Cliente {
    private String nome;
    private String email;
    private Long cpf;
    private String telefone;
    private String endereco;

    public Cliente(String nome, String email, Long cpf, String tel, String end) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = tel;
        this.endereco = end;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s <br/> Email: %s <br/> CPF: %d <br/> Telefone: %s <br/> Endereço: %s <hr/>", nome, email, cpf, telefone, endereco);
    }

    
    
    
}

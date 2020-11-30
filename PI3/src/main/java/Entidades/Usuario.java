package Entidades;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Bruno
 */
@Getter
@Setter

public class Usuario {
    
    private String nome;
    private String login;
    private String senha;
    private String perfil;
    
    public boolean isAdmin(){
        return this.perfil.equalsIgnoreCase("admin");
    }
    
    public boolean isGerente(){
        return this.perfil.equalsIgnoreCase("gerente");
    }
}

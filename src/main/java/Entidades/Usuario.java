package Entidades;

import at.favre.lib.crypto.bcrypt.BCrypt;
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
    private int idperfil;
    private int filial;

    public Usuario() {
    }
    
    public Usuario(String nome, String login, int perfil) {
        this.nome = nome;
        this.login = login;
        this.idperfil = perfil;
    }
    
    public Usuario(String nome, String login, String senha, int perfil, int filial) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.idperfil = perfil;
        this.filial = filial;
    }
    
    public String codificarSenha(String senha){   
        return BCrypt.withDefaults().hashToString(13, senha.toCharArray());
    }
    
    public boolean validarSenha(String senha){   
        BCrypt.Result response = BCrypt.verifyer().verify(senha.toCharArray(),this.senha);
        return response.verified;
    }
    
    public boolean isAdmin(){
        if(this.idperfil == 1){
            return true;
        }
        return false;
    }
    
    public boolean isGerente(){
        if(this.idperfil == 2){
            return true;
        }
        return false;
    }
    
    public boolean isVendedor(){
        if(this.idperfil == 3){
            return true;
        }
        return false;
    }
}

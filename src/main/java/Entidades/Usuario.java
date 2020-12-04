package Entidades;

//import at.favre.lib.crypto.bcrypt.BCrypt;
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
    private int filial;

    public Usuario() {
    }
    
    public Usuario(String nome, String login, String perfil) {
        this.nome = nome;
        this.login = login;
        this.perfil = perfil;
    }
    
    public Usuario(String nome, String login, String senha, String perfil, int filial) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
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
        return this.perfil.equalsIgnoreCase("admin");
    }
    
    public boolean isGerente(){
        return this.perfil.equalsIgnoreCase("gerente");
    }
}

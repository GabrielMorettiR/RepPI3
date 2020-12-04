package Entidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Categoria {
    private int id;
    private String titulo;

    public Categoria(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}

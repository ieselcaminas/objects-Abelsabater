package herencia.proyectonetwork;

import java.util.ArrayList;

public abstract class Publicaciones {
private String titulo;
private String usuario;
private int megusta;

public Publicaciones(String titulo, String usuario) {
    ;
    this.titulo = titulo;
    this.usuario = usuario;
    this.megusta = 0;
}

public int getMegusta() {
    return megusta;
}

public void setMegusta() {
    this.megusta++;
}

public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public String getUsuario() {
    return usuario;
}

public void setUsuario(String usuario) {
    this.usuario = usuario;
}

public String toString() {
    return "Autor" + getUsuario() + "Noticia seleccionada:" + getTitulo();
}
}

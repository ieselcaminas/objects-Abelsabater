package herencia.proyectonetwork;

import java.util.Date;

public abstract class Publicacion {
private String titulo;
private Usuario usuario;
private int megusta;
private Date fecha;

public Publicacion(String titulo, Usuario usuario) {

    this.titulo = titulo;
    this.usuario = usuario;
    this.megusta = 0;
    this.fecha= new Date();
}

public Date getFecha() {
    return fecha;
}

public void setFecha(Date fecha) {
    this.fecha = fecha;
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

public Usuario getUsuario() {
    return usuario;
}

public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
}

public String toString() {
    return "Autor" + getUsuario() + "Noticia seleccionada:" + getTitulo()+" fecha publicado" +getFecha();
}
}

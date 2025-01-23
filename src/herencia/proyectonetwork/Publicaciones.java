package herencia.proyectonetwork;

import java.util.ArrayList;

public abstract class Publicaciones {
private String titulo;
private String usuario;
private ArrayList comentarios;
private int megusta;
public Publicaciones(String titulo, String usuario, int megusta, ArrayList<String>comentarios) { ;
    this.titulo = titulo;
    this.usuario = usuario;
    this.megusta=megusta;
    this.comentarios=comentarios;
}
public ArrayList getComentarios() {
    return comentarios;
}
public void setComentarios(ArrayList comentarios) {
    this.comentarios = comentarios;
}
public int getMegusta() {
    return megusta;
}
public void setMegusta(int megusta) {
    this.megusta = megusta;
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
public String toString(){
    return "Autor"+getUsuario()+"Noticia seleccionada:"+ getTitulo();
}
}

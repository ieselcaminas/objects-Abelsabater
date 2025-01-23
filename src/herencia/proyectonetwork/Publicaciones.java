package herencia.proyectonetwork;

import java.util.ArrayList;

public abstract class Publicaciones {
private String ID;
private String titulo;
private String usuario;
private ArrayList<String>noticias;
private String autor;

public Publicaciones(String ID, String titulo, String usuario,ArrayList<String> noticias) {
    this.ID = ID;
    this.titulo = titulo;
    this.usuario = usuario;
    this.noticias = noticias;
}

public String getID() {
    return ID;
}

public void setID(String ID) {
    this.ID = ID;
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

public ArrayList<String> getNoticias() {
    return noticias;
}

public void setNoticias(ArrayList<String> noticias) {
    this.noticias = noticias;
}
public String toString(){
    return "Autor"+getUsuario()+"Noticia seleccionada:"+ getTitulo();
}
}

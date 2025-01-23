package herencia.proyectonetwork;

import java.util.ArrayList;

public abstract class Publicaciones {
private String ID;
private String titulo;
private String usuario;
private String mensage;
private ArrayList<String>noticias;

public Publicaciones(String ID, String titulo, String usuario, String mensage,ArrayList<String> noticias) {
    this.ID = ID;
    this.titulo = titulo;
    this.usuario = usuario;
    this.noticias = noticias;
    this.mensage=mensage;
}

public String getMensage() {
    return mensage;
}

public void setMensage(String mensage) {
    this.mensage = mensage;
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
}

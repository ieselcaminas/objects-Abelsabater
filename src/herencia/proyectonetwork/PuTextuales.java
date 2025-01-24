package herencia.proyectonetwork;

import java.util.ArrayList;
public class PuTextuales extends Publicaciones {
private String mensage;
private String ID;
PuTextuales(String ID, String titulo, String usuario, String mensage){
    super(titulo,usuario);
    this.ID=ID;
    this.mensage=mensage;
}

public String getID() {
    return ID;
}

public void setID(String ID) {
    this.ID = ID;
}

public String getMensage() {
    return mensage;
}

public void setMensage(String mensage) {
    this.mensage = mensage;
}

public String mensage(){
    return "Noticias ultima hora "+getMensage();
}
@Override
public String toString(){
return getFecha()+"Autor: "+getUsuario()+", noticia seleccionada --> "+ getTitulo()+": "+getMensage() +"  likes: "+getMegusta();
}

}

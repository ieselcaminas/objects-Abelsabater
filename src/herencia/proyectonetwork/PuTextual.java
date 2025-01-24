package herencia.proyectonetwork;
public class PuTextual extends Publicaciones {
private String mensage;
private String ID;
PuTextual(String ID, String titulo, Usuario usuario, String mensage){
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
return getFecha()+" Autor: "+getUsuario()+", noticia seleccionada --> "+ getTitulo()+": "+getMensage() +"  likes: "+getMegusta();
}

}

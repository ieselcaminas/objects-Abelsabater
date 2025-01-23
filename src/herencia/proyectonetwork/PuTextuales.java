package herencia.proyectonetwork;

import java.util.ArrayList;
public class PuTextuales extends Publicaciones {
private String mensage;
PuTextuales(String ID, String titulo, String usuario, String mensage){
    super(ID,titulo,usuario);
    this.mensage=mensage;
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
return "Autor"+getUsuario()+"Noticia seleccionada -->"+ getTitulo()+":"+getMensage();
}

}

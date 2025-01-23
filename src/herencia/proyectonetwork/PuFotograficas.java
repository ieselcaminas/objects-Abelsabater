package herencia.proyectonetwork;

import java.util.ArrayList;

public class PuFotograficas extends Publicaciones{
private String imagenpng;
PuFotograficas(String titulo, String usuario,String imagenpng){
    super(titulo,usuario);
    this.imagenpng=imagenpng;
}
public String getImagenpng() {
    return imagenpng;
}
public void setImagenpng(String imagenpng) {
    this.imagenpng = imagenpng;
}
@Override
public String toString(){
    return "Autor: "+getUsuario()+", noticia seleccionada --> "+getUsuario()+": "+getImagenpng() +"  likes: "+getMegusta();
}
}

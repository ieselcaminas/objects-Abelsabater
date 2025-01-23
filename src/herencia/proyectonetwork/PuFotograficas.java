package herencia.proyectonetwork;

import java.util.ArrayList;

public class PuFotograficas extends Publicaciones{
private String imagenpng;
PuFotograficas(String ID, String titulo, String usuario, ArrayList<String> noticias,String imagenpng){
    super(ID,titulo,usuario,noticias);
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
    return "Autor"+getUsuario()+"Noticia seleccionada:"+getImagenpng();
}
}

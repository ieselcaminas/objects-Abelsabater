package herencia.proyectonetwork;
public class PuFotograficas extends Publicaciones{
private String imagenpng;
PuFotograficas(String titulo, Usuario usuario,String imagenpng){
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
    return getFecha()+" Autor: "+getUsuario()+", noticia seleccionada --> "+getTitulo()+": "+getImagenpng() +"  likes: "+getMegusta();
}
}

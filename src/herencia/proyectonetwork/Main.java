package herencia.proyectonetwork;
import java.util.ArrayList;
import java.util.List;
public class Main {
public static void main(String[] args) {
    List<Publicacion> publicaciones=new ArrayList<>();
    Usuario usuario=new Usuario("Pedro","pedrito0957",22);
PuTextual puTextuales=new PuTextual("2094057M","ferfrfr",usuario,"gscdvdghcdgy");
publicaciones.add(puTextuales);
    usuario=new Usuario("Ana","anita34234",39);
PuFotografica puFotograficas=new PuFotografica("sdsdo",usuario,"imagen.png");
    publicaciones.add(puFotograficas);
    publicacionesde("Ana",publicaciones);
}
private static void publicacionesde(String nombre, List<Publicacion> publicaciones){
    publicaciones.stream()
            .filter(p->p.getUsuario().getNombre().contains(nombre))
            .forEach(System.out::println);
}
}
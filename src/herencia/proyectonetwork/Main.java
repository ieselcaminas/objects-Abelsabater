package herencia.proyectonetwork;

import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args) {
    List<Publicaciones> publicacionesList=new ArrayList<>();
PuTextuales puTextuales=new PuTextuales("2094057M","ferfrfr","Juan Martinez de la Cruz","gscdvdghcdgy");
publicacionesList.add(puTextuales);
PuFotograficas puFotograficas=new PuFotograficas("sdsdo","Juan Martinez de la Cruz","imagen.png");
    publicacionesList.add(puFotograficas);

    publicacionesde("Juan Martinez de la Cruz",publicacionesList);

}
private static void publicacionesde( String nombre, List<Publicaciones> publicaciones){
    publicaciones.stream()
            .filter(p->p.getUsuario().contains(nombre))
            .forEach(System.out::println);

}
}

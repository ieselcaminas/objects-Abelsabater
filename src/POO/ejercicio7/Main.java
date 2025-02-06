package POO.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args) {
    List<Editorial>editorials=new ArrayList<>();
    List<Tema>temas=new ArrayList<>();
    Tema terror=new Tema(1,"Terror");
    Tema historia=new Tema(2,"Historia");
    temas.add(terror);
    temas.add(historia);
    Editorial edebe=new Editorial(1,"Edebe");
    editorials.add(edebe);
    Editorial hols=new Editorial(2,"Hols");
    editorials.add(hols);
        Autor ximoPuig=new Autor(1,"XimoPuig");
        LLibre lLibre=new LLibre("Los 3 cerditos",1,hols,terror);
        lLibre.add(ximoPuig);
        ximoPuig.add(lLibre);
        terror.add(lLibre);
        hols.add(lLibre);

}
}
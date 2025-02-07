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
        Autor ximoPuig=new Autor(1,"Ximo Puig");
        LLibre cerdos=new LLibre("Los 3 cerditos",1,hols,terror);
        cerdos.add(ximoPuig);
        ximoPuig.add(cerdos);
        terror.add(cerdos);
        hols.add(cerdos);
            Lector lector1=new Lector("20970899M","Abel");
                Exemplar excer=new Exemplar(1,"Exemplar1",cerdos,lector1);
                lector1.add(excer);
            cerdos.add(excer);


    System.out.println(ximoPuig);
    System.out.println("\t"+cerdos);
    System.out.println("\t\t"+cerdos.getTema());
    System.out.println("\t\t"+cerdos.getEditorial());
    System.out.println("\t\t"+cerdos.getExemplars());
    System.out.println("\t\t\t"+excer.getLector());
    System.out.println("\t\t\t"+lector1.getExemplars().get(0)+"-->"+lector1.getExemplars().get(0).getlLibre());
}
}
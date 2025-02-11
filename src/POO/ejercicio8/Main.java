package POO.ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Subasta>subastas=new ArrayList<>();
        Subasta subasta=new Subasta(1);


        Lote lote1=new Lote(1);

        Articulo articulo1=new Articulo("Patin",12);

        lote1.adda(articulo1);
        Articulo articulo2=new Articulo("Bicicleta",79);
        lote1.adda(articulo2);

        Puja puja1=new Puja(101,1,lote1);
        lote1.addp(puja1);
        Puja puja2=new Puja(110,1,lote1);
        lote1.addp(puja2);

        subasta.addL(lote1);
        subastas.add(subasta);
    }
}
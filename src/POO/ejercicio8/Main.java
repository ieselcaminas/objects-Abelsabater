package POO.ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Subasta>subastas=new ArrayList<>();
        Subasta subasta=new Subasta(1);


        Lote lote=new Lote(1);

        Articulo articulo1=new Articulo("Patin",12);

        lote.adda(articulo1);
        Articulo articulo2=new Articulo("Bicicleta",79);
        lote.adda(articulo2);

        subasta.addL(lote);
        subastas.add(subasta);
    }
}

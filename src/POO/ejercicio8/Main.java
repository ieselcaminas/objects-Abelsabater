package POO.ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CasaSubasta casaSubasta=new CasaSubasta(1,"casasub");

        Subasta subasta=new Subasta(1);
        Pujador pujador1=new Pujador("Abel","20970899M");

        Pujador pujador2=new Pujador("Javier","76236578M");

        Lote lote1=new Lote(1);

        Articulo articulo1=new Articulo("Patin",12);

        lote1.adda(articulo1);
        Articulo articulo2=new Articulo("Bicicleta",79);
        lote1.adda(articulo2);

        Puja puja1=new Puja(101,1,lote1,pujador1);
        lote1.addp(puja1);
        pujador1.addp(puja1);
        Puja puja2=new Puja(110,2,lote1,pujador2);
        lote1.addp(puja2);
        pujador2.addp(puja2);
        subasta.addL(lote1);
        casaSubasta.adds(subasta);

        System.out.println(casaSubasta.getSubastas().get(0).Stringvictoria());
    }
}
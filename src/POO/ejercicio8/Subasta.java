package POO.ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Subasta {
    private int cod;
    private List<Lote>lotes;

    public Subasta(int cod) {
        this.cod = cod;
        this.lotes=new ArrayList<>();
    }

    public int getCod() {
        return cod;
    }

    public List<Lote> getLotes() {
        return lotes;
    }

    public void addL(Lote lote){
        this.lotes.add(lote);
    }

    public Pujador haganado(){
        double puj=0;
        Pujador ganador = null;
        for (Lote lot:lotes){
            for (Puja puja:lot.getPujas()){
                if(puja.getCantidad()>puj){
                    puj=puja.getCantidad();
                    ganador=puja.getPujador();
                }
            }
        }
        return ganador;
    }

    public String Stringvictoria(){
        return "Ha ganado "+haganado();
    }
}

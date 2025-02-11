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
}

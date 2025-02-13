package POO.Maquinaexpendedora;

import java.util.ArrayList;
import java.util.List;

public class Cajon {
    private int cod;
    private List<MonedaoBillete>monedaoBilletes;

    public Cajon(int cod) {
        this.cod = cod;
        this.monedaoBilletes=new ArrayList<>();
    }
    public void addm(MonedaoBillete monedaoBillete){
        this.monedaoBilletes.add(monedaoBillete);
    }

    public int getCod() {
        return cod;
    }
}

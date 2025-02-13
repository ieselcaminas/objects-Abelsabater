package POO.Maquinaexpendedora;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Maquina>parking=new ArrayList<>();
        Cajon cajon=new Cajon(1);
        Maquina maquina=new Maquina(1,cajon);
        parking.add(maquina);

        MonedaoBillete monedaoBillete=new MonedaoBillete(2);
        cajon.addm(monedaoBillete);
        monedaoBillete=new MonedaoBillete(5);
        cajon.addm(monedaoBillete);

    }
}

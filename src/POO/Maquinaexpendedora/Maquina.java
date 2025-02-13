package POO.Maquinaexpendedora;

public class Maquina {
    private int cod;
    private Cajon cajon;

    public Maquina(int cod, Cajon cajon) {
        this.cod = cod;
        this.cajon=cajon;
    }

    public int getCod() {
        return cod;
    }

    public Cajon getCajon() {
        return cajon;
    }

    public void setCajon(Cajon cajon) {
        this.cajon = cajon;
    }
}

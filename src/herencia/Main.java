package herencia;

public class Main {
public static void main(String[] args) {
    Perro perro=new Perro("Lucas");
    perro.comunicarse();
    perro.traerzapato();
    Gato gato=new Gato("Maria");
    gato.comunicarse();
    gato.morder();
    Tiburon tiburon=new Tiburon("Ferran Torres");
    tiburon.comunicarse();
    tiburon.moverse();
    PezPayaso pezPayaso=new PezPayaso("Pez Payaso");
    pezPayaso.comunicarse();
    gato.respirar();
    tiburon.respirar();
}
}
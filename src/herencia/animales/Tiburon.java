package herencia.animales;

public class Tiburon extends Pez{
Tiburon(String nombre){
    super(nombre);
}
@Override
public void comunicarse() {
    System.out.println("Arqueo el cuerpo para comunicarme");
}
}
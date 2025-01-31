package herencia.animales;

public class Perro extends Mamifero{
Perro(String nombre){
    super(nombre);
}
@Override
public void comunicarse(){
    System.out.println("guau");
}
public void traerzapato(){
    System.out.println("Toma tu zapato");
}
}

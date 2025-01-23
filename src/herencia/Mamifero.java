package herencia;

public abstract class Mamifero extends Animal{
Mamifero(String nombre){
    super(nombre);
}
public void mamar(){
    System.out.println("Cuando soy pequeño mamo");
}
}

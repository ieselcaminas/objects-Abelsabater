package herencia.animales;

public abstract class Pez extends Animal{
Pez(String nombre){
    super(nombre);
}
@Override
public void moverse(){
    System.out.println("Uso aletas para moverme");
}
@Override
public void respirar(){
    System.out.println("Respiro por las branqueas");
}
}

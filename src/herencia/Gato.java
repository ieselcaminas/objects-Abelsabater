package herencia;

public class Gato extends Mamifero {
Gato(String nombre){
    super(nombre);
}
@Override
public void comunicarse(){
    System.out.println("miau");
}
public void morder(){
    System.out.println("Te voy a morder");
}
}

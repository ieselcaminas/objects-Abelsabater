package herencia;

public class PezPayaso extends Pez{
PezPayaso(String nombre){
    super(nombre);
}
@Override
public void comunicarse(){
    System.out.println("Me comunico mediante burbujas");
}
}
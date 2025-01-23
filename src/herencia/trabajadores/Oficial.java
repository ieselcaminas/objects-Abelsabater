package herencia.trabajadores;

public class Oficial extends Operario{
Oficial(String nombre, double salario){
    super(nombre,salario);
}
@Override
public String puesto(){
    return "Me llamo"+getNombre()+" y soy oficial";
}
}

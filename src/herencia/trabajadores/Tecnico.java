package herencia.trabajadores;

public class Tecnico  extends  Operario{
Tecnico(String nombre, double salario){
    super(nombre,salario);
}
@Override
public String puesto(){
    return "Me llamo"+getNombre()+" y soy tecnico";
}
}

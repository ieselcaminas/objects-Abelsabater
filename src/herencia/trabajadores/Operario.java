package herencia.trabajadores;

public class Operario extends Empleados {
public Operario(String nombre,double salario) {
    super(nombre,salario);
}
public String puesto(){
    return "Me llamo"+getNombre()+" y soy operario";
}
}
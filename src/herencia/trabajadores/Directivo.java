package herencia.trabajadores;

public class Directivo extends Empleados{
Directivo(String nombre, double salario){
    super(nombre,salario);
}
public String puesto(){
 return "Me llamo"+getNombre()+" y soy directivo";
}

}

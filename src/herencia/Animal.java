package herencia;

public abstract class  Animal{
private String nombre;
public Animal(String nombre){
    this.nombre = nombre;
}
public String getNombre(){
    return nombre;
}
public void setNombre(String nombre){
    this.nombre = nombre;
}
public void comunicarse(){
    System.out.println("Mi nombre es " + nombre);
}
public void respirar(){
    System.out.println("Respiro aire por los pulmones");
}
public void moverse(){
    System.out.println("Me muevo a 4 patas");
}
public String toString(){
    return "Animal: " + nombre;
}
}

package POO.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
private String DNI;
private String nombrecompleto;
private List<Prestec>prestecs;

public Cliente(String DNI, String nombrecompleto) {
    this.DNI = DNI;
    this.nombrecompleto = nombrecompleto;
    this.prestecs=new ArrayList<>();
}
public void addprestecs(Prestec prestec){
    prestecs.add(prestec);
}
public String getDNI() {
    return DNI;
}

public String getNombrecompleto() {
    return nombrecompleto;
}

public void setNombrecompleto(String nombrecompleto) {
    this.nombrecompleto = nombrecompleto;
}
@Override
public String toString(){
    return this.nombrecompleto+"-->"+this.DNI;
}
}

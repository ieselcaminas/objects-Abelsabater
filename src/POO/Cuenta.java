package POO;

public class Cuenta {
private String titular;
private double cantidad;

public Cuenta(String titular) {
    this.titular = titular;
    this.cantidad=0;
}

public Cuenta(double cantidad, String titular) {
    this.cantidad = cantidad;
    this.titular = titular;
}
public String getTitular() {
    return titular;
}
public double getCantidad() {
    return cantidad;
}

public void setCantidad(double cantidad) {
    this.cantidad = cantidad;
}
public double ingresarcantidad(double cant){
    if(cant<0){
        return this.cantidad;
    }else{
        return cant+this.cantidad;
    }
}
public double quitarcantidad(double cant){
    if(cant<0 || cant>this.cantidad){
        return this.cantidad;
    }else{
        return this.cantidad-cant;
    }
}
public String toString(){
    return "Eres "+this.titular+" tienes actualmente "+this.cantidad+"€";
}
}

package POO.ejercicio3;

public class MainCuenta {
public static void main(String[] args) {
    Cuenta cuenta=new Cuenta("Eurelio");
    cuenta.ingresarcantidad(35.67);
    cuenta.quitarcantidad(15);
    System.out.println(cuenta);
}
}

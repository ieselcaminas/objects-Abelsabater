package POO;

public class MainCuenta {
public static void main(String[] args) {
    Cuenta cuenta=new Cuenta("Eurelio");
    cuenta.setCantidad(cuenta.ingresarcantidad(35.67));
    cuenta.setCantidad(cuenta.quitarcantidad(15));
    System.out.println(cuenta);
}
}

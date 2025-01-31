package POO.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class MainBanco {
public static void main(String[] args) {
    List<Banco> bancos=new ArrayList<>();
    Banco banco=new Banco(235,"Santander");
        Sucursal b1=new Sucursal(23,banco,"España");
        banco.addsucursal(b1);
        b1=new Sucursal(12,banco,"Castellon");
         banco.addsucursal(b1);

    for (int i = 0; i < banco.getSucursales().size(); i++) {
        System.out.println(banco.getSucursales().get(i).getLocalizacion());
    }
    System.out.println();
    Banco banco2=new Banco(654,"Caixa Rural");
        b1=new Sucursal(23,banco,"Gibraltar");
        banco2.addsucursal(b1);
        b1=new Sucursal(12,banco,"Madrid");
        banco2.addsucursal(b1);
    for (int i = 0; i < banco2.getSucursales().size(); i++) {
        System.out.println(banco2.getSucursales().get(i).getLocalizacion());
    }

}
}

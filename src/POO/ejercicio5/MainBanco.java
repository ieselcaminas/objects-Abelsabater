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
       Cliente cliente=new Cliente("20970899M","Abel Sabater");
       Prestec prestec=new Prestec(12,cliente,100,b1);
       cliente.addprestecs(prestec);
       b1.addprestecs(prestec);
       prestec=new Prestec(14,cliente,50,b1);
       cliente.addprestecs(prestec);
       b1.addprestecs(prestec);
    CompteCorrent compteCorrent=new CompteCorrent(1,"Abelsaba06","dzQe9300",b1);
       Domiciliacio domiciliacio=new Domiciliacio(1,"Bodega 13",compteCorrent);
    compteCorrent.addcliente(cliente);
    compteCorrent.adddomiciliacio(domiciliacio);
     domiciliacio=new Domiciliacio(1,"Parc Ribalta 6",compteCorrent);
    compteCorrent.adddomiciliacio(domiciliacio);
    cliente.addcomptecorrent(compteCorrent);
    bancos.add(banco);




    Banco banco2=new Banco(654,"Caixa Rural");
        b1=new Sucursal(23,banco,"Gibraltar");
        banco2.addsucursal(b1);
        b1=new Sucursal(12,banco,"Madrid");
        banco2.addsucursal(b1);
    Cliente cliente2=new Cliente("257656789M","Hector Salamanca");
    Prestec prestec2=new Prestec(12,cliente2,100000,b1);
    cliente2.addprestecs(prestec2);
    b1.addprestecs(prestec2);
    prestec2=new Prestec(14,cliente2,5000000,b1);
    cliente2.addprestecs(prestec2);
    b1.addprestecs(prestec2);
     compteCorrent=new CompteCorrent(1,"HS2013","dzQe9300",b1);
     domiciliacio=new Domiciliacio(1,"vddfb 13",compteCorrent);
    compteCorrent.addcliente(cliente2);
    compteCorrent.adddomiciliacio(domiciliacio);
    domiciliacio=new Domiciliacio(1,"fgbn fg 6",compteCorrent);
    compteCorrent.adddomiciliacio(domiciliacio);
    cliente2.addcomptecorrent(compteCorrent);
    bancos.add(banco2);
    for (Banco b:bancos){
        for (Sucursal s:b.getSucursales()){
            System.out.println(s);
            for (Prestec p: s.getPrestecs()){
                System.out.println(p);
            }
            for (CompteCorrent c: cliente.getCompteCorrents()){
                System.out.println(c);
                for (Domiciliacio d: c.getDomiciliacions()){
                    System.out.println(d);
                }
            }
        }
    }

}
}
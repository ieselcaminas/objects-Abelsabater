package POO.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
private int n_suc;
private String localizacion;
private Banco banco;
private List<Prestec> prestecs;

public Sucursal(int n_suc, Banco banco, String localizacion) {
    this.n_suc = n_suc;
    this.banco = banco;
    this.localizacion = localizacion;
    this.prestecs=new ArrayList<>();
}
public void addprestecs(Prestec prestec){
    prestecs.add(prestec);
}
public String getLocalizacion() {
    return localizacion;
}

public void setLocalizacion(String localizacion) {
    this.localizacion = localizacion;
}

public List<Prestec> getPrestecs() {
    return prestecs;
}

public int getN_suc() {
    return n_suc;
}

public Banco getBanco() {
    return banco;
}
@Override
public String toString(){
    return this.n_suc+"-->"+this.localizacion+"-->"+this.banco;
}
}

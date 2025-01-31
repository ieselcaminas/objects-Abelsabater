package POO.ejercicio5;

public class Sucursal {
private int n_suc;
private String localizacion;
private Banco banco;

public Sucursal(int n_suc, Banco banco, String localizacion) {
    this.n_suc = n_suc;
    this.banco = banco;
    this.localizacion = localizacion;
}

public String getLocalizacion() {
    return localizacion;
}

public void setLocalizacion(String localizacion) {
    this.localizacion = localizacion;
}

public int getN_suc() {
    return n_suc;
}

public Banco getBanco() {
    return banco;
}
@Override
public String toString(){
    return this.n_suc+"-->"+this.localizacion;
}
}

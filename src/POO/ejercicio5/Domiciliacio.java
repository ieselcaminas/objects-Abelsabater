package POO.ejercicio5;

public class Domiciliacio {
private int num_d;
private String calle;
private CompteCorrent compteCorrent;

public Domiciliacio(int num_d, String calle, CompteCorrent compteCorrent) {
    this.num_d = num_d;
    this.calle = calle;
    this.compteCorrent = compteCorrent;
}

public String getCalle() {
    return calle;
}

public void setCalle(String calle) {
    this.calle = calle;
}

public CompteCorrent getCompteCorrent() {
    return compteCorrent;
}

public int getNum_d() {
    return num_d;
}
@Override
public String toString(){
    return this.calle;
}
}

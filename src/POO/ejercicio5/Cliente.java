package POO.ejercicio5;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
private String DNI;
private String nombrecompleto;
private List<Prestec>prestecs;
private List<CompteCorrent>compteCorrents;
public Cliente(String DNI, String nombrecompleto) {
    this.DNI = DNI;
    this.nombrecompleto = nombrecompleto;
    this.prestecs=new ArrayList<>();
    this.compteCorrents=new ArrayList<>();
}
public List<CompteCorrent> getCompteCorrents() {
    return compteCorrents;
}
public void addcomptecorrent(CompteCorrent compteCorrent) {
    this.compteCorrents.add(compteCorrent);
}
public void addprestecs(Prestec prestec){
    prestecs.add(prestec);
}
public String getDNI() {
    return DNI;
}
public List<Prestec> getPrestecs() {
    return prestecs;
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
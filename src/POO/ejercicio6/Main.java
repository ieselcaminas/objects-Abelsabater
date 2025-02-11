package POO.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args) {
    List<Facultad>facultades=new ArrayList<>();
    Facultad cientifica=new Facultad("Ciencias",1);
    facultades.add(cientifica);
    List<AreaConeixement> areasConeixements=new ArrayList<>();
    AreaConeixement areacientifica=new AreaConeixement("Area Ciencia",1);
    areasConeixements.add(areacientifica);
        Departament informatica=new Departament(1,"Informatica",areacientifica);
        areacientifica.add(informatica);
            Professor juan=new Professor("Juan",1,informatica);
             informatica.add(juan);
                Catedra catedra=new Catedra("Ciencia",1,cientifica,informatica);
                juan.add(catedra);
                catedra.add(juan);
             informatica.add(catedra);
        Departament medicina=new Departament(2,"Medicina",areacientifica);
        areacientifica.add(medicina);


    Facultad letras=new Facultad("Letras",1);
    facultades.add(letras);
    AreaConeixement arealletra=new AreaConeixement("Area Lletres",2);
    areasConeixements.add(arealletra);
        Departament latin=new Departament(1,"Latin",arealletra);
        areacientifica.add(latin);
}
}

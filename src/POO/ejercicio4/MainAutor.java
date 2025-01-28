package POO.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class MainAutor {
public static void main(String[] args) {
    List<Tema> temas=new ArrayList<>();
    Tema tema=new Tema("Drama");
    temas.add(tema);
    tema=new Tema("Fantasía épica");
    temas.add(tema);
    Autor autor=new Autor("Pablo","4 de enero de 1988");
    Libro libro=new Libro("Pocoyo",autor,8,temas);
    System.out.println(autor+" ---------> "+libro);
    temas=new ArrayList<>();
    tema=new Tema("Terror");
    temas.add(tema);
    tema=new Tema("Suspense");
    temas.add(tema);
    autor=new Autor("Manel","5 de marzo de 1969");
    libro=new Libro("Los tres cerditos",autor,9,temas);
    System.out.println(autor+" ---------> "+libro);
}
}
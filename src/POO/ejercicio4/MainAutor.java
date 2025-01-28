package POO.ejercicio4;

public class MainAutor {
public static void main(String[] args) {

    Autor autor=new Autor("Pablo","4 de enero de 1988");
    Libro libro=new Libro("fsdf",autor,8);
    Tema tema=new Tema("Drama");
    libro.addtemas(tema);
    tema=new Tema("Fantasía épica");
    libro.addtemas(tema);
    System.out.println(autor+" ---------> "+libro);

    autor=new Autor("Manel","5 de marzo de 1969");
    libro=new Libro("sdf",autor,9);
    tema=new Tema("Terror");
    libro.addtemas(tema);
    tema=new Tema("Suspense");
    libro.addtemas(tema);
    System.out.println(autor+" ---------> "+libro);
}
}
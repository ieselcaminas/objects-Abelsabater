package POO.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Libro {
private String titulo;
private Autor autor;
private int paginas;
private List<Tema>temas;

public Libro(String titulo, Autor autor, int paginas) {
    this.titulo = titulo;
    this.autor = autor;
    this.paginas = paginas;
    this.temas = new ArrayList<>();
}

public String getTitulo() {
    return titulo;
}

public Autor getAutor() {
    return autor;
}

public int getPaginas() {
    return paginas;
}

public List<Tema> getTemas() {
    return temas;
}
public String toString(){
    return getTitulo()+" escrito por "+getAutor().getNombre()+" tiene "+getPaginas()+" paginas y trata "+getTemas();
}
public void addtemas(Tema tema){
    this.temas.add(tema);
}
}

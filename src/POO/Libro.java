package POO;

import java.util.List;

public class Libro {
private String titulo;
private Autor autor;
private int paginas;
private List<Tema> temas;

public Libro(String titulo, Autor autor, int paginas, List<Tema> temas) {
    this.titulo = titulo;
    this.autor = autor;
    this.paginas = paginas;
    this.temas = temas;
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
}

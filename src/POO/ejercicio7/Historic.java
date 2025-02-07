package POO.ejercicio7;

public class Historic {
    private Exemplar exemplar;
    private Autor autor;
    private String datei;
    private String datef;

    public Historic(Exemplar exemplars, Autor autors) {
        this.exemplar = exemplars;
        this.autor = autors;
        this.datei= "";
        this.datef= "";
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    public Autor getAutors() {
        return autor;
    }

    public void setAutors(Autor autors) {
        this.autor = autors;
    }

    public String getDatei() {
        return datei;
    }

    public String getDatef() {
        return datef;
    }
}

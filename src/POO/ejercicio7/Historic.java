package POO.ejercicio7;
import java.util.List;

public class Historic {
    private List<Exemplar>exemplars;
    private List<Autor>autors;
    private String datei;
    private String datef;

    public Historic(List<Exemplar> exemplars, List<Autor> autors) {
        this.exemplars = exemplars;
        this.autors = autors;
        this.datei= "";
        this.datef= "";
    }

    public List<Exemplar> getExemplars() {
        return exemplars;
    }

    public void setExemplars(List<Exemplar> exemplars) {
        this.exemplars = exemplars;
    }

    public List<Autor> getAutors() {
        return autors;
    }

    public void setAutors(List<Autor> autors) {
        this.autors = autors;
    }

    public String getDatei() {
        return datei;
    }

    public String getDatef() {
        return datef;
    }
}

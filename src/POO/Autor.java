package POO;

import java.time.LocalDate;

public class Autor {
private String nombre;
private LocalDate fecha;

public Autor(String nombre, LocalDate fecha) {
    this.nombre = nombre;
    this.fecha = fecha;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getNombre() {
    return nombre;
}

public LocalDate getFecha() {
    return fecha;
}
}

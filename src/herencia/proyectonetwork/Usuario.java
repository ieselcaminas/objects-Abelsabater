package herencia.proyectonetwork;
public class Usuario {
private String nombre;
private String nick;
private int anoscotizados;
public Usuario(String nombre,String nick, int anoscotizados) {
    this.nombre = nombre;
    this.nick = nick;
    this.anoscotizados = anoscotizados;
}
public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getNick() {
    return nick;
}

public void setNick(String nick) {
    this.nick = nick;
}

public int getAnoscotizados() {
    return anoscotizados;
}

public void setAnoscotizados(int anoscotizados) {
    this.anoscotizados = anoscotizados;
}
@Override
public String toString(){
    return getNombre()+" su usuario es: "+getNick()+" lleva cotizando "+getAnoscotizados()+" años";
}
}

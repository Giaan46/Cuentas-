package sentencias;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {
    String nombre;
    String dnie;
    String correoElectronico;

    public Persona(String nombre, String dnie, String correoElectronico) {
        this.nombre = nombre;
        this.dnie = dnie;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDnie() {
        return dnie;
    }

    public void setDnie(String dnie) {
        this.dnie = dnie;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public boolean NombreValido(){
        Pattern pattern = Pattern.compile("[^a-zA-ZñÑáéíóúÁÉÍÓÚüÜ\\s]");
        Matcher matcher = pattern.matcher(nombre);
        return !matcher.find();
    }
    public boolean CorreoValido(){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(correoElectronico);
        return matcher.matches();
    }
    public boolean DniValido(){
        Pattern pattern = Pattern.compile("^[0-9]{8}[A-Za-z]|[XYZ]\\d{7}[A-Za-z]$");
        Matcher matcher = pattern.matcher(dnie);
        return matcher.matches();
    }
    public String toString(){
        return " nombre " + nombre + " dni/nie " + dnie + " correo electronico " + correoElectronico;
    }
}

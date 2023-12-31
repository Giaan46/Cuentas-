package sentencias;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Persona> cuentas = new ArrayList<>();
        cuentas.add(new Persona("gianluca","1237500h","gianlucamaida996@gmail.com"));
        cuentas.add(new Persona("vitorio","123232g","vitorio.maida@gmail.com"));
        cuentas.add(new Persona("mimi","1234567h","mimiCervanArg@gmail.com"));
        cuentas.add(new Persona("michi","234565h","michi@gmail.com"));
        cuentas.add(new Persona("gianlu","123","CorreoFalso.com"));
        for (Persona persona : cuentas){
            if(!persona.NombreValido()){
                System.out.println("El nombre de " + persona.getNombre() + " es incorrecto.");
            }
            if(!persona.CorreoValido()){
                System.out.println("El correo electronico de " + persona.getNombre() + " es incorrecto.");

            }
            if (!persona.DniValido()){
                System.out.println("El Dni/Nie de " + persona.getNombre() + " es incorrecto." );
            }
        }
    }
}

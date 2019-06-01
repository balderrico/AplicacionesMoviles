import java.io.Serializable;

public class Persona implements Serializable {

    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    int edad;

    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, int edad){
        this.nombre=nombre;
        this.apellidoPaterno=apellidoPaterno;
        this.apellidoMaterno=apellidoMaterno;
        this.edad=edad;
    }
}

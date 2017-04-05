import java.io.Serializable;
public class Alumno implements Serializable {
    private int clave;
    private String nombre;
    private Laptop portatil;


    public Alumno(int clave, String nombre, Laptop portatil) {
        this.clave = clave;
        this.nombre = nombre;
        this.portatil = portatil;

    }

    public String dimeNombre() {
        return nombre;
    }

    public String dimeClave() {
        return clave;

    }
    public String dimePortatil()
    {
        return portatil;
    }
}

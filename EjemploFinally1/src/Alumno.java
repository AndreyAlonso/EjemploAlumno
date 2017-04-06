import javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec;

/**
 * Created by Alumnos on 06/04/2017.
 */
public class Alumno {
    private int clave;
    private String nombre;
    public Alumno(int clave, String nombre)
    {
        if(clave < 0)
        {
            throw new MiExcepcion("Clave inválida");
        }
        if(nombre == null || nombre == "")
        {
            throw new MiExcepcion("Nombre invalido");
        }
        this.clave = clave;
        this.nombre = nombre;

    }
}

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by Andrey on 04/04/2017.
 */
public class EjemploArchivos {

    //Este metodo propraga la excepcion hacia quien lo llame
    public  static void leeArchivo(String nombre) throws IOException, FileNotFoundException
    {
        File archivo = null;
        Scanner entrada = null;

        archivo = new File(nombre);
        entrada = new Scanner(archivo);
        while(entrada.hasNextLine()){
                String linea = entrada.nextLine();
                System.out.println("Linea : " + linea);
        }
        entrada.close();

    }
    //Este metodo atrapa la excepcion

    public static void escribeArchivo(String nombre)
    {
        FileWriter archivo = null;
        try{
            archivo = new FileWriter(nombre);
            archivo.write("Hola Mundo otra vez");
            archivo.close();
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());

        }
    }
    public static void main(String [] args)
    {
        System.out.println("Ejemplo de escritura / Lectura de archivos");
        //escribeArchivo("carpeta");
        try {
            leeArchivo("prueba.txt");
        }
        catch (NoSuchElementException ex){
            System.out.println(ex.getMessage());
        }
        catch(FileNotFoundException ex){  // En el caso de multiples catch, Primero subclases y luego las superclases
            System.out.println(ex.getMessage());
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }


}

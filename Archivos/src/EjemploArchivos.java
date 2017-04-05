import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by Andrey on 04/04/2017.
 */
public class EjemploArchivos {


    public static void leeAlumno(String nomArchivo){
        File archivo = new File(nomArchivo);
        try{
            FileInputStream flojoEntrada = new FileInputStream(archivo);
            ObjectInputStream objetoEntrada = new ObjectInputStream(flojoEntrada);
            Alumno alumno = (Alumno)objetoEntrada.readObject();
            System.out.println("Alumno leido desde archivo...");
            System.out.println("Nombre = " +alumno.dimeNombre());
            System.out.println("Clave = " +alumno.dimeClave());
            System.out.println("Laptop = " + alumno.dimePortatil());


        }

        catch (ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void escribeAlumno(String nomArch){
        File archivo = new FIle(nomArch);
        try{
            FileOutputStream flujoSalida = new FileOutputStream(archivo);
            ObjectOutputStream objetoSalida = new ObjectOutputStream(flujoSalida);
            Alumno a1 = new Alumno(12345,"Diego", new Laptop("AlienWare","Ni idea"));
            objetoSalida.writeObject(a1);
            objetoSalida.close();

        }
        catch (IOException ex){
            System.out.println("Error al escribir el Alummno en archivo");


        }
    }


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

    public static void escribeAlumno(Scannertring nomArch){

    }
    //Este metodo atrapa la excepcion

    public static void escribeArchivo(String nombre)
    {
        FileWriter archivo = null;
        try{
            archivo = new FileWriter(nombre);
          //  archivo.write("Hola Mundo otra vez");
            Alumno a1 = new Alumno(123456, "Diego");
            archivo.write(a1);
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
            leeArchivo("alumnos.txt");
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

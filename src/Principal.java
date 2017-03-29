
public class Principal {
    public static void main(String [] args){
        System.out.println("Ejemplo de alumnos con clave unica");
        Alumno a1 = new Alumno("Bernardo");
        Alumno a2 = new Alumno("Karen");
        /**
         * Las variables de clase y los metodos static existen y pueden utilizarse,
         * incluso aunque no se hayan creado instancias de la clase.
         */
        Alumno.reiniciaContador();
        Alumno a3 = new Alumno("Ivan");
        System.out.println(a1.comoTeLlamas() + ": " + a1.cualEsTuClave());
        System.out.println(a2.comoTeLlamas() + ": " + a2.cualEsTuClave());
        System.out.println(a3.comoTeLlamas() + ": " + a3.cualEsTuClave());
        System.out.println(Alumno.dimeTotalAlumnos());



    }
}

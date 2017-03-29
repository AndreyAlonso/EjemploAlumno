

public class Alumno {
    private String nombre;
    private   int clave;
    private static  int contador = 0;

    public Alumno(String nombre){
        this.nombre = nombre;
        this.clave = ++contador;
    }

    public String comoTeLlamas(){
        return nombre;
    }

    public int cualEsTuClave(){
        return clave;
    }

    public static int dimeTotalAlumnos(){

        /*********************************************************
         *
         * NO se puede utilizar this dentro de un metodo estatico.
         * System.out.println(this.nombre);
         *
         * 
         * Si un metodo static
         ***********************************************************/
        return contador;
    }
    public static void reiniciaContador(){
        contador = 0;
    }
}


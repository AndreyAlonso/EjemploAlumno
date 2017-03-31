import java.io.IOException;

/**
 * Created by Alumnos on 31/03/2017.
 */
public class Principal {

    public static void lanzaExcepcion() throws IOException{
        throw new IOException("Excepcion verificda");
    }
    public static void lanzaNoVerificada() throws  RuntimeException{
        throw new RuntimeException("Excepcion no verificada");
    }



        public static void main(String [] args){
            System.out.println("Excepciones verificadas y no verificadas");
            //lanzaExcepcion();                           //No se esta manejando la excepcion, requiere try/catch


            //Es obligatorio utilizar try-catch en excepciones verificadas
            //es decir aquellas excepciones que no son subclase de RuntimeException
            try{
                lanzaExcepcion();
            }catch (IOException e){
                System.out.println("Atrapa la excepcion");
                e.printStackTrace();
            }

            /*
            Es opcional usar try -catch en excepciones no verificadas
            es decir aquellas excepciones que son subclases de RuntimeException

             */

            lanzaNoVerificada();


        }
}

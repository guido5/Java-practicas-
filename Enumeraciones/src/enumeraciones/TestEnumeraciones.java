package enumeraciones;
import Enumeracion.Continentes;
import Enumeracion.Dias;

/**
 *
 * @author Diego Eduardo Guido Ramos
 * @version 1.0
 * 
 * Programa para probar las enumeraciones y el jdk de java en linux
 */
public class TestEnumeraciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Valores de la enumeracion
        System.out.println("Valor 1: " + Dias.LUNES);
        
        //Hacemos un test del dia utilizado
        indicarDia(Dias.VIERNES);
        
        //Utilizamos la enumeracion de paises
        System.out.println("Continentes no. 4" + Continentes.AMERICA);
        System.out.println("Paises en america: " + Continentes.AMERICA.getPaises());
        
        //Hacemos el test del numero de paises por continente
        System.out.println("");
        indicarPaises(Continentes.AFRICA);
        
        //Imprimimos los continentes
        System.out.println("");
        imprimirContienentes();
    }
    
    /**
     * Se usa para indicar el dia que se tiene de la numeracion Dias.
     * @param dias 
     */

    private static void indicarDia(Dias dias) {
        switch(dias){
            case LUNES:
                System.out.println("Valor 1: " + Dias.LUNES);
               break;
            case MARTES:
                System.out.println("Valor 1: " + Dias.MARTES);
                break;
            case MIERCOLES:
                System.out.println("Valor 1: " + Dias.MIERCOLES);
                break;
            case JUEVES:
                System.out.println("Valor 1: " + Dias.JUEVES);
                break;
            case VIERNES:
                System.out.println("Valor 1: " + Dias.VIERNES);
                break;
            case SABADO:
                System.out.println("Valor 1: " + Dias.SABADO);
                break;
            default:
                System.out.println("Valor 1: " + Dias.DOMINGO);
                break;
        }
    }
    
    /**
    * Podemos usar algun valor constante de la enumeracion directamente
    * @param continentes contiene una enumeracion con parametros.
    */

    public static void indicarPaises(Continentes continentes) {
        switch(continentes){
            case AFRICA:
                System.out.println("No. Paises en: "+ continentes + ": " + continentes.getPaises());
                break;
            default:
                System.out.println("Y asi seguimos con los demas");
        }
    }
    
    /**
         * Sentencia forEach.
         * Para cada una de los objetos de un arreglo (en este caso Contienentes) se pueden
         * establecer un objeto y recorrer la lista. El unico detalle es que no se puede saber
         * el indice del objeto en el que estamos. Se recomienda usar unicamente para realizar
         * impresiones rapidas de la lista.
         */
        
        /**
         * Para el caso de las enumeraciones con objetos se tiene: 
         * en Continentes c - se guarda un objeto de la lista Continentes.values()
         * en Continentes.values() - se tiene toda la lista de la enumeracion
         */

    public static void imprimirContienentes() {        
        for(Continentes c: Continentes.values()){
            System.out.println("contienente: " + c + "contiene " + c.getPaises() + " paises.");
        }
    }
    
}

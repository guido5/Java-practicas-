
package bloques.de.codigo;

/**
 *
 * @author eduardo
 * 
 */
public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    //Bloque de inicializacion estatico
    static{
        //Iniciamos el idPersona desde el valor 10
        contadorPersonas = 10;
        //Aqui no se pueden usar variables no estaticas
        //idPersona = 1;
        System.out.println("Ejecuta bloque estatico");
    }
    
    //Bloque de codigo para inicializar atributos de la clase.
    //El bloque se copia a cada constructor de la clase.
    {
    System.out.println("Ejecuta bloque inicializador");
    idPersona = ++ contadorPersonas;
}
    
    public Persona(){
        System.out.println("Ejecuta Constructor");
    }
    
    /**
     * sirve para regresar el valor del id creado.
     * @return idPersonas 
     * 
     */
    
    public int getIdPersona(){
        return idPersona;
    }
}

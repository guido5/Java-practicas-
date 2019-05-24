/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiondeobjetos;

/**
 *
 * @author avata
 */
public class ConversionDeObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado;
        //Asignamos una refencia de un objeto de menor jerarquia
        //Esto es upcasting, no hay necesidad de una notacion especial
        empleado = new Escritor("Roy", 15000, TipoEscritura.CLASICO);
        
        /**Sin embargo si queremos acceder al detalle de la clase Escritor
        * No es posible ya que sus caracteristicas no son comunes
        * entre todas las clases de la jerarquia de clases
        */
        imprimirDetalles(empleado);
        
        empleado = new Gerente("Martin", 18000,  "Sistemas");
           
               
        imprimirDetalles(empleado);
    }
    
    private static void imprimirDetalles(Empleado empleado){
        String resultado = null;
        
        //Imprmir detalles es general para todos ya que es por polimorfismo
        //no se necesita de ninguna conversion
        System.out.println("\nDetalles: " + empleado.obtenerDetalles());
        
        //Pero los detalles de cada clase deberemos hacer un downcasting
        if(empleado instanceof Escritor){
            Escritor escritor = (Escritor) empleado;
            //Finalmente podemos acceder a los metodos de la clase Escritor
            resultado = escritor.getTipoEscrituraEnText();
            
            //Otra forma de hacer la conversion en la misma linea de codigo
            //Esto es muy comun encontrarlo en Java
            resultado = ((Escritor) empleado).getTipoEscrituraEnText();
            
            System.out.println(resultado);
            
        }else if(empleado instanceof Gerente){
            //Hacemos el downcasting en la misma linea de codigo
            //nos ahorramos una variable
            resultado = ((Gerente)empleado).getDepartamento();
            System.out.println(resultado);
        }
    }
    
}

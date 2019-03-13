 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author eduardo
 */
public class Clase2 {
    public Clase2(){
        System.out.println("");
        
        //Constructor public
        new Clase1(1);
        
        //Constructor protegido
        new Clase1(1,2);
        
        //Constructor default
        new Clase1(1,2,3);
        
        //Constructor privado
        //new Clase1(1,2,3,4);
    }
    
    public void pruebaDesdeClase2(){
        //Acceso a Clase 1 desde Clase 2
        Clase1 c1 = new Clase1();
        System.out.println("");
        System.out.println("Atributo publico: "+ c1.atrPublico);;
        System.out.println("Atributo protegido: "+ c1.atrProtegido);
        System.out.println("Atributo default: "+ c1.atrPaquete);
        System.out.println("Atributo privado: Acceso denegado");
        
        System.out.println("");
        System.out.println("Metodo publico: " + c1.metodoPublico());
        System.out.println("metodo protegido: "+c1.metodoProtegido());
        System.out.println("metodo defautl: "+ c1.metodoPAquete());
        System.out.println("metodo privado: Acceso denegado");
    }
}

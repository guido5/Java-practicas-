/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Clase1;

/**
 *
 * @author eduardo
 */
public class Clase4 {
    public Clase4(){//Constructor protegido, al ser una subclase puede acceder
    //Aunque este en otro paquete
    //super(1,2);
    //Acceso package, al estar fuera de este paquete esta restringido
    //super(1,2,3);
    //Acceso privado, restringido
    //super(1,2,3,4);
    }
    
    public void pruebaDesdeClase4(){
        //Acceso a Clase1 desde Clase 2
        //Clase 3 extiende de Clase1
        Clase1 c1= new Clase1();
        System.out.println("");
        System.out.println("Atributo publico: "+c1.atrPublico);
        System.out.println("Atributo protegido: No se puede acceder");
        System.out.println("Atributo default:No se puede acceder desde este paquete");
        new Clase1();
        
        System.out.println("Metodo publico: "+c1.metodoPublico() );
        System.out.println("Metodo protegido: No se puede llamar" );
        System.out.println("Metodo default: No se puede acceder desde este paquete");
        System.out.println("Metodo privado no se puede acceder desde esta clase");
    }
}

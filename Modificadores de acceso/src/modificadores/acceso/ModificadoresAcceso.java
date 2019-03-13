/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificadores.acceso;

import paquete1.Clase2;
import paquete2.Clase3;
import paquete2.Clase4;

/**
 *
 * @author eduardo
 */
public class ModificadoresAcceso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("***Accesso desde Clase 2 a Clase1 (mismo paquete)");
        new Clase2().pruebaDesdeClase2();
        
        System.out.println("***Accesso desde Clase 3 a Clase1 Protegido");
        new Clase3().pruebaDesdeClase3();
        
        System.out.println("***Accesso desde Clase 2 a Clase1 negado");
        new Clase4().pruebaDesdeClase4();
    }
    
}

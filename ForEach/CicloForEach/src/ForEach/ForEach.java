/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForEach;

/**
 *
 * @author eduardo
 */
public class ForEach {
    
    public static void main(String[] args){
        //Creamos un arreglo de Personas
        Persona [] personas = {new Persona("Juan"), new Persona("karla")};
        
        //Iteramos cada elemento del arreglo perosnas
        for (Persona p:personas){
            System.out.println("Nombre persona: " + p.getNombre());
        }
        
        System.out.println();
        //Creamos un arreglo de enteros
        int [] edades = {15,20,41,50};
        //Iteramos el arreglo
        for(int edad:edades){
            System.out.println("Edad: " + edad);
        }
    }
    

    
}

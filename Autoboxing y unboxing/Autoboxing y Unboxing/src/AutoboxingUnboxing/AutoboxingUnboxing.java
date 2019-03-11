/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoboxingUnboxing;

/**
 *
 * @author eduardo
 */
public class AutoboxingUnboxing {
    
    public static void main(String args[]){
        //Autoboxing ( se convierte en tipos primitivos)
        Integer enteroObj = 10;
        Float floatObj = 15.2F;
        Double doubleObj = 40.1;
        System.out.println("Autoboxing");
        System.out.println("Entero Obj: " + enteroObj);
        System.out.println("Flotante Obj: " + floatObj.floatValue());
        System.out.println("Double Obj: " + doubleObj.doubleValue());;
        
        int entero = enteroObj;
        float flotante = floatObj;
        double doble = doubleObj;
        System.out.println("\nUnboxing");
        System.out.println("Entero: " + entero);
        System.out.println("Flotante: " + flotante);
        System.out.println("Doble: " + doble);
    }
    
}

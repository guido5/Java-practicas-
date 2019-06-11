package Beans;

import java.io.Serializable;

public class PersonaBean implements Serializable {
    //Implementa Serializable
    private String nombre;
    private int edad;

    //Constructor Vacio
    public PersonaBean() {
    }

    public PersonaBean(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Getters y Setters de los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

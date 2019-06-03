package Datos;

public class ImplementacionMYSQL implements AccesoDatos {
    @Override
    public void insertar() {
        System.out.println("Insertar en MYSQL");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde MYSQL");
    }
}

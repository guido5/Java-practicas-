package ManejoInterfaces;

import java.awt.*;
import Datos.*;

public class ManejoInterfaces {
    public static void main(String[] args) {
        AccesoDatos datos = new ImplementacionDatos();
        ejecutar(datos, "listar");
        datos = new ImplementacionMYSQL();
        ejecutar(datos,"insertar");
    }
    private static void ejecutar(AccesoDatos datos, String accion){
        if("listar".equals(accion)){
            datos.listar();
        }else if("insertar".equals(accion)){
            datos.insertar();;
        }
    }
}

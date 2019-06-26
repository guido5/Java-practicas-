package ManejoExcepciones2.ManejoExcepciones2;
import ManejoExcepciones2.datos.*;
import ManejoExcepciones2.Excepciones.*;
public class ManejoExcepciones2 {
    public static void main(String[] args) {
        AccesoDatos datos = new ImplementacionMySQL();
        datos.simularError(true);
        ejecutar(datos,"listar");
        //Cambiamos el estado de la simulacion de error a false
        datos.simularError(false);
        ejecutar(datos,"escribir");
    }

    private static void ejecutar(AccesoDatos datos, String accion) {
        if("listar".equals(accion)){
            try {
                datos.listar();
            } catch (LecturaEx lecturaEx) {
                lecturaEx.printStackTrace();
            } catch (AccesoDatosEx accesoDatosEx) {
                accesoDatosEx.printStackTrace();
            }
        }else if ("escribir".equals(accion)){
            try {
                datos.insertar();
            } catch (EscrituraEx escrituraEx) {
                escrituraEx.printStackTrace();
            } catch (AccesoDatosEx accesoDatosEx) {
                accesoDatosEx.printStackTrace();
            }
        }
    }
}

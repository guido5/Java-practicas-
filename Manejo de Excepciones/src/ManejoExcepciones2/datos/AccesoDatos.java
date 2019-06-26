package ManejoExcepciones2.datos;
import ManejoExcepciones2.Excepciones.AccesoDatosEx;
import ManejoExcepciones2.datos.*;

public interface AccesoDatos {
    public void insertar() throws AccesoDatosEx;
    public void listar() throws AccesoDatosEx;
    public void simularError(boolean simularError) ;
}

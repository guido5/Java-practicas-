package ManejoExcepciones2.datos;

import ManejoExcepciones2.Excepciones.AccesoDatosEx;
import ManejoExcepciones2.Excepciones.EscrituraEx;
import ManejoExcepciones2.Excepciones.LecturaEx;

public class ImplementacionMySQL implements AccesoDatos {
    private boolean simularError;
    @Override
    public void insertar() throws AccesoDatosEx {
        if(simularError ){
            throw new EscrituraEx("Error de escritura de datos");
        }else{
            System.out.println("Insertar desde MySQL");
        }
    }

    @Override
    public void listar() throws AccesoDatosEx {
        if(simularError ){
            throw new LecturaEx("Error de escritura de datos");
        }else{
            System.out.println("Listar desde MySQL");
        }
    }

    @Override
    public void simularError(boolean simularError) {
        this.simularError = simularError;
    }

    public  boolean isSimularError(){
        return simularError;
    }
}

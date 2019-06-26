package ManejoExcepciones1.ManejoExcepciones1;
import ManejoExcepciones1.Domain.*;
public class ManejoExcepciones1 {
    public static void main(String[] args) {
        /**
         * Por ser un tipo de checkException se escribe el bloque try catch o
         * se puede escribir en la firma del metodo que la esta implementando
         * (Utilizar de preferencia el try - catch
         */
        try{
            Division division = new Division(10,0);
            division.visualizarOperacion();
        }catch (OperationException ex){
            ex.printStackTrace();
        }
    }
}

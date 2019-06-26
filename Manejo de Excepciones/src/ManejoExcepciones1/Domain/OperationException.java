package ManejoExcepciones1.Domain;

public class OperationException extends Exception{

    public OperationException(String message) {
        //Inicializamos el constructor del padre
        super(message);
    }
}

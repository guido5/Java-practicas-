package ManejoExcepciones1.Domain;

public class Division {
    private int numerador;
    private int denominador;


    /** Las excepciones del tipo checkException se declaran dentro de la definicion del metodo
     * o dentro del codigo, ya sea con un bloque try - catch o directamente en la definicion.
     * Esto indica que la clase que llame al metodo que implementa la excepcion tambien estara
     * implementando la excepcion. Como estas son excepciones del tipo checException van dentro
     * del codigo. Si hubieran sido del tipo RunTimeException (unCheckException) entonces no
     * es obligatorio que las agreguemos en la implementacion del codigo
     * Hay que tener cuidado con las excepciones que se usen el codigo ya que el codigo que lo implemente
     * va a tener que manejarlo hasta que complete la ejecucion del metodo.
     * @param numerador
     * @param denominador
     * @throws OperationException
     */
    public Division(int numerador, int denominador) throws OperationException{

        if (denominador == 0){
            //throw new illegalArgumentException("denominador igual a cero");
            throw new OperationException("Denominador igual a cero");
        }
    }

    public void visualizarOperacion(){
        System.out.println("El resultado es: " + (numerador/denominador));
    }
}

package ManejoExcepciones1.ManejoExcepciones1;
import ManejoExcepciones1.Domain.*;
public class ManejoExcepcionesArg {
    public static void main(String[] args) throws OperationException{
        try{
            int op1 = Integer.parseInt(args[0]);
            int op2 = Integer.parseInt(args[1]);
            Division division = new Division(op1, op2);
        }catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println("Ocurrio una excepcion: ");
            System.out.println("Hubo un error al acceder a un elemento fuera de rrango");
            aie.printStackTrace();
        }catch (NumberFormatException nfe){
            System.out.println("Ocurrio una excepcion: ");
            System.out.println("uno de los elementos no es entero");
            nfe.printStackTrace();
        }catch (OperationException oe){
            System.out.println("Ocurrio una excepcion: ");
            System.out.println("Se trato de realizar las operaciones y murio");
            oe.printStackTrace();
        }finally{
            System.out.println("Se ejecutaron todas las excepciones");
        }
    }
}

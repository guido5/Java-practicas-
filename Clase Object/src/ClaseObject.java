public class ClaseObject {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Juan", 10000);
        Empleado emp2 = new Empleado("Juan", 10000);

        compararObjeto(emp1, emp2);
    }

    private static void compararObjeto(Empleado emp1, Empleado emp2) {
        System.out.println("Contenido de los objetos: " + emp1);

        if(emp1 == emp2){
            System.out.println("Los objetos tienen mismas direcciones");
        }else{
            System.out.println("Los objetos tienen distintas direcciones");
        }

        if(emp1.equals(emp2)){
            System.out.println("Objetos tienen el mismo contenido");
        }else{
            System.out.print("Objetos tienen diferentes contenidos");
        }

        if(emp1.hashCode() == emp2.hashCode()){
            System.out.println("Los objetos tienen mismo hashcode");
        }else{
            System.out.println("Los objetos tienen distintos hashcode");
        }
    }
}

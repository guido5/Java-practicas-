package ejemploClaseAbstracta;

import ClasesAbstractas.*;

public class EjemploClasesAbstractas {
    public static void main(String[] args) {


        FiguraGeometrica figura1 = new Rectangulo("Rectangulo");
        FiguraGeometrica figura2 = new Triangulo("Triangulo");
        FiguraGeometrica figura3 = new Triangulo("Circulo");

        System.out.println(figura1);
        figura1.dibujar();

        System.out.println(figura2);
        figura2.dibujar();

        System.out.println(figura3);
        figura3.dibujar();
    }
}

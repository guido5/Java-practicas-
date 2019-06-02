package ClasesAbstractas;

public class Circulo extends FiguraGeometrica{
    public Circulo(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        System.out.println("Aqui deberia dibujar un : " + this.getClass().getSimpleName());
    }
}

public class Cubo extends FiguraSolida {

    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 6 * Math.pow(lado, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 12 * lado;
    }

    @Override
    public double calcularVolumen() {
        return Math.pow(lado, 3);
    }
}

public class Esfera extends FiguraSolida {

    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }

    @Override
    public double calcularVolumen() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }
}
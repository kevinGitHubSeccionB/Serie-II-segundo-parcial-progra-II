public class Main {

    public static void main(String[] args) {


        Calculable[] figuras = {
                new Circulo(5),
                new Rectangulo(8, 4),
                new Triangulo(6, 4, 5, 5),
                new Esfera(3),
                new Cubo(4),
                new Cilindro(3, 7)
        };

        System.out.println("======================================");
        System.out.println("   SISTEMA DE CALCULO GEOMETRICO");
        System.out.println("======================================");

        for (Calculable figura : figuras) {

            System.out.println("\n--------------------------------------");
            System.out.println("Figura: "
                    + figura.getClass().getSimpleName());
            System.out.println("--------------------------------------");

            System.out.printf("Area: %.2f%n",
                    figura.calcularArea());

            System.out.printf("Perimetro: %.2f%n",
                    figura.calcularPerimetro());

            System.out.printf("Volumen: %.2f%n",
                    figura.calcularVolumen());
        }

        System.out.println("\n======================================");
        System.out.println("          FIN DEL PROGRAMA");
        System.out.println("======================================");
    }
}
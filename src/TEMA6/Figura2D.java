package TEMA6;

abstract class Figura2D {

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    @Override
    public String toString() {
        return "Área: " + calcularArea() + ", Perímetro: " + calcularPerimetro();
    }


    public class Cuadrado extends Figura2D {
        private double lado;

        public Cuadrado(double lado) {
            this.lado = lado;
        }

        @Override
        public double calcularArea() {
            return lado * lado;
        }

        @Override
        public double calcularPerimetro() {
            return 4 * lado;
        }
    }

    // Subclase Rectángulo
    public class Rectangulo extends Figura2D {
        private double base, altura;

        public Rectangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        @Override
        public double calcularArea() {
            return base * altura;
        }

        @Override
        public double calcularPerimetro() {
            return 2 * (base + altura);
        }
    }

    // Subclase Triángulo
    public class Triangulo extends Figura2D {
        private double base, altura, lado1, lado2, lado3;

        public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
            this.base = base;
            this.altura = altura;
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        }

        @Override
        public double calcularArea() {
            return (base * altura) / 2;
        }

        @Override
        public double calcularPerimetro() {
            return lado1 + lado2 + lado3;
        }
    }

    // Subclase Círculo
    public class Circulo extends Figura2D {
        private double radio;
        private final double PI = Math.PI;

        public Circulo(double radio) {
            this.radio = radio;
        }

        @Override
        public double calcularArea() {
            return PI * radio * radio;
        }

        @Override
        public double calcularPerimetro() {
            return 2 * PI * radio;
        }
    }
}








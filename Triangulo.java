// Triangulo.java
public class Triangulo extends Figura implements FiguraPlana {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        double p = calcularPerimetro() / 2;
        return Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Triângulo - Lado 1: " + lado1 + ", Lado 2: " + lado2 + ", Lado 3: " + lado3);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
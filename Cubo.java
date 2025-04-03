
public class Cubo extends Figura implements FiguraEspacial {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularVolume() {
        return lado * lado * lado;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Cubo - Lado: " + lado);
        System.out.println("Volume: " + calcularVolume());
    }
}
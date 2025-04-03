
public class Cone extends Figura implements FiguraEspacial {
    private double raio;
    private double altura;

    public Cone(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    @Override
    public double calcularVolume() {
        return (1.0 / 3.0) * Math.PI * raio * raio * altura;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Cone - Raio: " + raio + ", Altura: " + altura);
        System.out.println("Volume: " + calcularVolume());
    }
}
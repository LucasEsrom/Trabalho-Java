
public class Esfera extends Figura implements FiguraEspacial {
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularVolume() {
        return (4.0 / 3.0) * Math.PI * raio * raio * raio;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Esfera - Raio: " + raio);
        System.out.println("Volume: " + calcularVolume());
    }
}
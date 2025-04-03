// Main.java
public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Retangulo retangulo = new Retangulo(4, 6);
        Triangulo triangulo = new Triangulo(3, 4, 5);
        Esfera esfera = new Esfera(3);
        Cubo cubo = new Cubo(4);
        Cone cone = new Cone(3, 5);

        circulo.exibirDetalhes();
        System.out.println();
        retangulo.exibirDetalhes();
        System.out.println();
        triangulo.exibirDetalhes();
        System.out.println();
        esfera.exibirDetalhes();
        System.out.println();
        cubo.exibirDetalhes();
        System.out.println();
        cone.exibirDetalhes();
    }
}
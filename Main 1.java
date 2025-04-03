public class Main {
    public static void main(String[] args) {
        
        Carro carro = new Carro("Toyota", "Corolla", 2022, 120000, 4);
        Moto moto = new Moto("Honda", "CB 500", 2023, 35000, 500);

        
        System.out.println("Antes do desconto:");
        carro.exibirDetalhes();
        moto.exibirDetalhes();

        
        carro.aplicarDesconto(10); // 10% de desconto
        moto.aplicarDesconto(5);   // 5% de desconto

  
        System.out.println("\nDepois do desconto:");
        carro.exibirDetalhes();
        moto.exibirDetalhes();
    }
}

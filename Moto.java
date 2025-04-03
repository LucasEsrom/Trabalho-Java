class Moto extends Veiculo implements Desconto {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, double preco, int cilindradas) {
        super(marca, modelo, ano, preco);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() { return cilindradas; }

    @Override
    public void exibirDetalhes() {
        System.out.println("Moto: " + getMarca() + " " + getModelo() + 
                           ", Ano: " + getAno() + ", Preço: R$" + getPreco() + 
                           ", Cilindradas: " + cilindradas);
    }

    @Override
    public void aplicarDesconto(double porcentagem) {
        setPreco(getPreco() - (getPreco() * porcentagem / 100));
    }
}

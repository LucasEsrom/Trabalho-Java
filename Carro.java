class Carro extends Veiculo implements Desconto {
    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, double preco, int numeroPortas) {
        super(marca, modelo, ano, preco);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() { return numeroPortas; }

    @Override
    public void exibirDetalhes() {
        System.out.println("Carro: " + getMarca() + " " + getModelo() + 
                           ", Ano: " + getAno() + ", Preço: R$" + getPreco() + 
                           ", Portas: " + numeroPortas);
    }

    @Override
    public void aplicarDesconto(double porcentagem) {
        setPreco(getPreco() - (getPreco() * porcentagem / 100));
    }
}

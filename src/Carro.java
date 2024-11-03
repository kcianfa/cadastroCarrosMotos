public class Carro extends Veiculo {
    private int numeroDePortas;

    // Construtor da classe Carro
    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);  // Chama o construtor da classe pai
        this.numeroDePortas = numeroDePortas;
    }

    // Método sobrescrito para exibir detalhes do carro, incluindo o número de portas
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();  // Chama o método da classe pai para exibir os atributos comuns
        System.out.println("Número de Portas: " + numeroDePortas);
    }
}
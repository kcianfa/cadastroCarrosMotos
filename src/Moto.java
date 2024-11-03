public class Moto extends Veiculo {
    private boolean temSidecar;

    // Construtor da classe Moto
    public Moto(String marca, String modelo, int ano, boolean temSidecar) {
        super(marca, modelo, ano);  // Chama o construtor da classe pai
        this.temSidecar = temSidecar;
    }

    // Método sobrescrito para exibir detalhes da moto, incluindo a presença de sidecar
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();  // Chama o método da classe pai para exibir os atributos comuns
        System.out.println("Tem Sidecar: " + (temSidecar ? "Sim" : "Não"));
    }
}
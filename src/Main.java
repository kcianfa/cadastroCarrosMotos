public class Main {
    public static void main(String[] args) {
        // Instanciação de um Carro
        Carro carro = new Carro("Toyota", "Corolla", 2020, 4);
        System.out.println("Detalhes do Carro:");
        carro.exibirDetalhes();

        // Instanciação de uma Moto
        Moto moto = new Moto("Harley-Davidson", "Iron 883", 2019, true);
        System.out.println("\nDetalhes da Moto:");
        moto.exibirDetalhes();
    }
}
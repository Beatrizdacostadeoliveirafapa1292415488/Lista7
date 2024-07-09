public class Veiculo {
    private String Placa;
    private String cor;
    private String modelo;
    private Proprietario proprietario;


    public Veiculo(String Placa, String cor, String modelo, Proprietario proprietario) {
        this.Placa = Placa;
        this.cor = cor;
        this.modelo = modelo;
        this.proprietario = proprietario;
    }

    // Método para exibir os dados do veículo
    public void mostrarDadosVeiculo() {
        System.out.println("Veículo:");
        System.out.println("Número da Placa: " + Placa);
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
        proprietario.mostrarDadosProprietario();
        System.out.println();
    }
}

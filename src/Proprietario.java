public class Proprietario {
    private String nome;
    private String endereco;
    private String sexo;
    private String cpf;
    private String CNH;


    public Proprietario(String nome, String endereco, String sexo, String cpf, String CNH) {
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.cpf = cpf;
        this.CNH = CNH;
    }


    public void mostrarDadosProprietario() {
        System.out.println("Proprietário:");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Sexo: " + sexo);
        System.out.println("CPF: " + cpf);
        System.out.println(" CNH: " +CNH);
    }
}

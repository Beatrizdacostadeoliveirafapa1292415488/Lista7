public class Testeveiculo {
    public static void main(String[] args) {
        Proprietario proprietario1 = new Proprietario("bia", "rua peru vaz de caminha, 123", "F", "123.456.789-00", "123456789");
        Proprietario proprietario2 = new Proprietario("alice", "av.ipiranga, 1234", "F", "987.654.321-00", "987654321");


        Veiculo veiculo1 = new Veiculo("ABC-1234", "Prata", " Corolla", proprietario1);
        Veiculo veiculo2 = new Veiculo("XYZ-9876", "Preto", " Civic", proprietario1);
        Veiculo veiculo3 = new Veiculo("DEF-5678", "Branco", " Gol", proprietario1);
        Veiculo veiculo4 = new Veiculo("MNO-4321", "Vermelho", " Fiesta", proprietario2);
        Veiculo veiculo5 = new Veiculo("JKL-2468", "Azul", " Onix", proprietario2);


        System.out.println(" informacoes dos  veículos :");
        veiculo1.mostrarDadosVeiculo();
        veiculo2.mostrarDadosVeiculo();
        veiculo3.mostrarDadosVeiculo();
        veiculo4.mostrarDadosVeiculo();
        veiculo5.mostrarDadosVeiculo();
    }
    }


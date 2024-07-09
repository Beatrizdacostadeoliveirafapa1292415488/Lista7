import java.util.Scanner;

public class TesteCd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o número de música : ");
        int numeroMusicas = scanner.nextInt();


        Cd cd = new Cd(numeroMusicas);


        int opcao;
        do {

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cd.play();
                    break;
                case 2:
                    cd.pause();
                    break;
                case 3:
                    cd.stop();
                    break;
                case 4:
                    cd.proximaFaixa();
                    break;
                case 5:
                    cd.faixaAnterior();
                    break;
                case 0:
                    System.out.println("fim.");
                    break;
                default:
                    System.out.println("erro. Tente novamente.");
                    break;
            }

        } while (opcao != 0);


    }


    private static void exibirMenu() {
        System.out.println("===== Menu  =====");
        System.out.println("1 - Play");
        System.out.println("2 - Pause");
        System.out.println("3 - Stop");
        System.out.println("4 - Próxima faixa");
        System.out.println("5 - Faixa anterior");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }
    }


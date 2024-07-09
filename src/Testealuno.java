import java.util.Scanner;

public class Testealuno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o número da matrícula: ");
        int numeroMatricula = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a primeira nota do aluno: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota do aluno: ");
        double nota2 = scanner.nextDouble();


        Aluno aluno = new Aluno(numeroMatricula, nome, nota1, nota2);


        System.out.println("Média do aluno: " + aluno.calcularMedia());


        if (aluno.aprovado()) {
            System.out.println(" APROVADO!");
        } else {
            System.out.println(" REPROVADO.");


            System.out.println("O aluno precisa de " + aluno.quantoPrecisa() + " no exame.");
        }

    }
}

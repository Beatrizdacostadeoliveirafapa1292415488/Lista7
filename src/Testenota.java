import java.util.Scanner;

public class Testenota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Informe  o primeiro item:");
        Itemnota item1 = criarItemNotaFiscal(scanner);

        System.out.println("Informe o segundo item:");
        Itemnota item2 = criarItemNotaFiscal(scanner);

        System.out.println("Informe o terceiro item:");
        Itemnota item3 = criarItemNotaFiscal(scanner);
        scanner.nextLine();


        Nota nota = new Nota(item1, item2, item3);





    }


    private static Itemnota criarItemNotaFiscal(Scanner scanner) {
        System.out.print("Descrição do item: ");
        String produto= scanner.nextLine();

        System.out.print("Preço Unitário: ");
        double precoUnitario = scanner.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();

        System.out.print("Alíquota ICMS (%): ");
        double aliquota = scanner.nextDouble();



        return new Itemnota(produto, precoUnitario, quantidade, aliquota);
    }
    }


import java.util.Scanner;

public class Testequadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o valor do lado do quadrado (em centímetros): ");
        double lado = scanner.nextDouble();


        Quadrado quadrado = new Quadrado(lado);


        System.out.println("Área do quadrado: " + quadrado.calcularArea() + " cm²");
        System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro() + " cm");
        System.out.println("Diagonal do quadrado: " + quadrado.calcularDiagonal() + " cm");



    }}
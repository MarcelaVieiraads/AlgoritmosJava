
import java.util.Scanner;

public class Exercicio6 {
	//Faça um programa que receba quatro números inteiros, calcule e mostre a soma desses
	//números.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número:");
        int num3 = scanner.nextInt();

        System.out.println("Digite o quarto número:");
        int num4 = scanner.nextInt();

        int soma = num1 + num2 + num3 + num4;

        System.out.println("\nSoma dos quatro números: " + soma);
    }
}
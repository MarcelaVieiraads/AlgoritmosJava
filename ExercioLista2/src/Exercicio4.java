import java.util.Scanner;

public class Exercicio4 {
	//Faça um programa para ler um inteiro. O programa deverá imprimir se o número é par
	//ou ímpar.

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int numero;
	System.out.println("Digite um número");
	numero = teclado.nextInt();
	if (numero % 2 == 0) {
	System.out.println("O número " + numero + " é par.");
	}
	else {
	System.out.println("O número " + numero + " é ímpar.");
	}
	}
	}
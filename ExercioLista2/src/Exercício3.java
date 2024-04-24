import java.util.Scanner;

public class Exercício3 {
	//Faça um programa para ler um número real, se o número for positivo imprima a raiz
	//quadrada, senão imprima o número ao quadrado.

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Digite um número:");
	double numero = teclado.nextDouble();
	if (numero > 0) {
	System.out.println("O número " + numero + " é positivo.");
	System.out.println("A raiz quadrada é " + Math.sqrt(numero));
	}
	else if (numero < 0) {
	System.out.println("O número " + numero + " é negativo.");
	System.out.println("Elevado ao quadrado é " + Math.pow(numero, 2));
	}
	else {
	System.out.println("Zero é um número sem raiz e sem potência.");
	}
	}
	}
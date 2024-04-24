import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		//Criar um programa que irá ler um número inteiro e exibir no console: o número digitado e
		//as potências de 2, 3 e 5 do número digitado.
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        System.out.println("\nNúmero digitado: " + numero);

        System.out.println("Potência de 2: " + Math.pow(numero, 2));
        System.out.println("Potência de 3: " + Math.pow(numero, 3));
        System.out.println("Potência de 5: " + Math.pow(numero, 5));
    }

	}



import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// um programa para ler 4 números (ponto flutuante).
		// O programa deverá imprimir na saída padrão o maior, o menor, quantos são
		// positivos e quantos são negativos.
		int positivo = 0;
		int negativo = 0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe 4 números");
		double n1 = leitor.nextDouble();
		double n2 = leitor.nextDouble();
		double n3 = leitor.nextDouble();
		double n4 = leitor.nextDouble();
		if (n1 >= n2 && n1 >= n3 && n1 >= n4) {
			System.out.println(n1 + " é o maior");
		} else if (n2 >= n1 && n1 >= n3 && n1 >= n4) {
			System.out.println(n2 + " é o maior");
		} else if (n3 >= n1 && n3 >= n2 && n3 >= n4) {
			System.out.println(n3 + " é o maior");
		} else if (n4 >= n1 && n4 >= n2 && n4 >= n3) {
			System.out.println(n4 + " é o maior");
		}
		// saber o menor

		if (n1 <= n2 && n1 <= n3 && n1 <= n4) {
			System.out.println(n1 + " é menor");
		} else if (n2 <= n1 && n1 <= n3 && n1 <= n4) {
			System.out.println(n2 + " é menor");
		} else if (n3 <= n1 && n3 <= n2 && n3 <= n4) {
			System.out.println(n3 + " é menor");
		} else if (n4 <= n1 && n4 <= n2 && n4 <= n3) {
			System.out.println(n4 + " é menor");
		}
		// saber qual positivo ou negativo
		if (n1 >= 0) {
			positivo++;

		} else {
			negativo++;

		}
		if (n2 >= 0) {
			positivo++;

		} else {
			negativo++;

		}
		if (n3 >= 0) {
			positivo++;

		} else {
			negativo++;

		}
		if (n4 >= 0) {

			positivo++;

		} else {
			negativo++;

		}
		System.out.println(" numero de positivo: " + positivo);
		System.out.println(" numero de negativo: "+ negativo);

	}
}

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua nota de português!");
		double a = teclado.nextDouble();
		System.out.println("Digite sua nota de Matemática!");
		double b = teclado.nextDouble();
		System.out.println("Digite sua nota de Ingles!");
		double c = teclado.nextDouble();
		double media = (a + b + c) / 3;
		System.out.println("Sua média é:" + media);

		if (media >= 9.0) {
			System.out.println("conceito  (A)   Parabéns Aprovado!");
		} else if (media >= 7.5 && media <= 8.5) {
			System.out.println("Conceito  (B)   Aprovado");
		} else if (media < 7.5 && media >= 6.0) {
			System.out.println("Conceito  (C)   Aprovado");
		} else if (media < 6 && media >= 4.0) {
			System.out.println("Conceito  (D)   Reprovado");

		} else if (media < 4.0) {
			System.out.println("Conceito  (E)   Reprovado");
		}
		 teclado.close();

	}

}

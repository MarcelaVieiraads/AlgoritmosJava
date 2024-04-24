import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual é a largura do comprimento?");
		double comp = teclado.nextDouble();
		System.out.println("Qual é o valor do metro quadrado? ");
		double area = teclado.nextDouble();

		System.out.println("Qual a area do terreno? ");
		double largura = teclado.nextDouble();
		System.out.println("Qual a area do terreno? ");
		double terreno = area = largura * comp;
		System.out.println("A area do terreno é: " + terreno);
		double valor = area * comp;
		System.out.println("O valor a ser pago é: R$" + valor);

	}

}

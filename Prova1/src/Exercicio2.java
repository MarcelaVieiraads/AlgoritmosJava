import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o numero da base");
		int a = teclado.nextInt();
		System.out.println(" Agora digite a altura");
		int b = teclado.nextInt();

		int area = a * b;
		System.out.println("Área do triangulo é:" + area);
		if (area >= 300) {
			System.out.println(" Área grande ");
		} else if (area < 300) {
			System.out.println("Área pequena");
		}
	}

}

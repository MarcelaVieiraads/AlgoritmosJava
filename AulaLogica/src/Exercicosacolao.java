import java.util.Scanner;

public class Exercicosacolao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println(" Digite um numero!");
		int fruta = teclado.nextInt();
		if (fruta == 1) {
			System.out.println("Mamão");
		}
		else if (fruta == 2) {
			System.out.println("Goiaba");

		}
		else if (fruta == 3) {
			System.out.println("Limão");
		}
		else if (fruta == 4) {
			System.out.println("kiwi");
		}
		else if (fruta == 5) {
			System.out.println("Banana");
		}
		else {
			System.out.println("falhou");
		}
	}

}

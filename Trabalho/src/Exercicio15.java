import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe as datas");

		int dia01 = leitor.nextInt();
		int mes01 = leitor.nextInt();
		int ano01 = leitor.nextInt();

		int dia02 = leitor.nextInt();
		int mes02 = leitor.nextInt();
		int ano02 = leitor.nextInt();
		if (ano01 < ano02) {
			System.out.println("data 01é menor");
		} else if (ano02 < ano01) {
			System.out.println("data 02 é menor");
		} else if (mes01 < mes02) {
			System.out.println("data 01 é menor");
		} else if (mes02 < mes01) {
			System.out.println("data 02 é menor");
		} else if (dia01 < dia02) {
			System.out.println("data 02 é menor");
		} else if (dia02 < dia01) {
			System.out.println("data 02 é menor");
		} else {
			System.out.println("data iguais");
		}

	}

}

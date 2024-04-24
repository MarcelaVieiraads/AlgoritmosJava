import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantos pães vendeu hj ?");
		double pao = teclado.nextDouble();
		System.out.println("Quantas broas venderam?");
		double broa = teclado.nextDouble();
		double sal = pao * 0.17;
		System.out.println("O valor ganho de pães de sal é: R$"+ sal);
		double divina = broa * 3.50 ;
		System.out.println("O valor ganho de broas divinas é: R$"+divina);
		double total = divina +sal ;
		System.out.println("O valor total é : R$"+total);
		double colchao = total - 0.8;
		System.out.println("o valor a ser guardado é :"+ colchao);
    
	}

}

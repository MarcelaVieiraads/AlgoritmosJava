import java.util.Scanner;

public class Exercicio1 {
	//Faça um programa para ler o valor em reais e a cotação do dólar. Em seguida, imprima o
	//valor em reais e o seu correspondente em dólares.

	public static void main(String[] args) {
		
		Scanner funcaoteclado = new Scanner(System.in);
		System.out.println("informe o valor em reais:");
	    double reais=funcaoteclado.nextDouble();
	    System.out.println("Agora converte em dólar");
		double dolar =4.98;
   	    double calculo=(reais*dolar);
   	    System.out.println(calculo+"o valor convertido em dólar");
		

		

	}

}

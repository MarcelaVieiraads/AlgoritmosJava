import java.util.Scanner;

public class Exercicio5 {
	//Criar um programa que calcule o índice IMC. 
	//O usuário deverá informar os valores para
	//peso e altura.

	public static void main(String[] args) {
		

		Scanner leitor = new Scanner(System.in);
		System.out.println ("Informe seu peso:");
	   double peso = leitor.nextDouble();
	   System.out.println ("Informe sua altura:");
	   double altura = leitor.nextDouble();
	   double calculoImc= peso/(altura*altura);
	   System.out.println ("indice IMC:"+ calculoImc);	   
	}

}

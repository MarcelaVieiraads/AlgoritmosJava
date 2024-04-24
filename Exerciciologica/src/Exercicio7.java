import java.util.Scanner;

public class Exercicio7 {
	// Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual, calcule
	//e mostre a idade desta pessoa, e quantos anos essa pessoa terá em 2045.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		System.out.println ("Qual o seu ano de nacimento ?:");
		int nascimento  = leitor.nextInt();
		System.out.println ("qual o ano atual?:");
		int atual = leitor.nextInt();
		int calculo = atual-nascimento;
		int idadefutura =53;
		 System.out.println ("Você tem :"+ calculo+"anos");
		 System.out.println (" E em 2045 você terá:"+idadefutura+"anos");
		 
		 
			
		
		
		
	}

}

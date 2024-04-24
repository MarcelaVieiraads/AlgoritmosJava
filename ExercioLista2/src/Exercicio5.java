import java.util.Scanner;

public class Exercicio5 {
	//Crie um programa que irá ler duas notas de um aluno (entre 0 e 10). O programa
	//deverá calcular a média aritmética entre as duas notas lidas e imprimir na saída padrão
	//a situação deste aluno, que pode ser APROVADO ou REPROVADO. Considerar que a
	//média de aprovação é 7.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual a sua nota de Português?");
		double portugues= teclado.nextDouble();
		System.out.println("Qual a sua nota de Matemática?");
		double matematica = teclado .nextDouble();
		double media = (portugues +matematica)/2;
		if(media>=7) {
			System.out.println("Aprovado");}
		
			else if(media<=7) {
				System.out.println("Reprovado");
			}
		}
		
	}



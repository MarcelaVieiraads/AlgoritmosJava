
import java.util.Scanner;

public class Exercicio6 {
	// Criar um programa que irá ler um número inteiro maior que zero que representa
	// o dia
	// da semana. Para cada número, escrever o dia da semana por extenso. Verificar
	// as
	// regras abaixo:
	// se for digitado o número 1 informar “Domingo!”
	// se for digitado 2, informar “Segunda-feira!”
	// se for digitado 3, informar “Terça-feira!”
	// se for digitado 4, informar “Quarta-feira!”
	// se for digitado 5, informar “Quinta-feira!”
	// se for digitado 6, informar “Sexta-feira!”
	// se for digitado 7, informar “Sábado-feira!”
	// Para qualquer outro número, informar “Opção inválida!”
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int escolha;
		System.out.println("Digite um número entre 1 e 7");
		escolha = teclado.nextInt();
		if (escolha == 1) {
			System.out.println("Domingo");
		} else if (escolha == 2) {
			System.out.println("Segunda-feira");
		} else if (escolha == 3) {
			System.out.println("Terça-feira");
		} else if (escolha == 4) {
			System.out.println("Quarta-feira");
		} else if (escolha == 5) {
			System.out.println("Quinta-feira");
		} else if (escolha == 6) {
			System.out.println("Sexta-feira");
		} else if (escolha == 7) {
			System.out.println("Sábado");
		} else {
			System.out.println("Opção inválida!");
		}
	}
}
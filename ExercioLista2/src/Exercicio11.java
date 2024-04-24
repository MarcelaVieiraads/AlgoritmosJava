import java.util.Scanner;

public class Exercicio11 {
	//Criar um programa que irá ler um número (ponto flutuante) e na sequência deverá
	//imprimir o valor absoluto do número lido.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		double n, result;
		System.out.println("Digite um número:");
		n = leitor.nextDouble();
		if (n > 0) {
		System.out.println("O valor absoluto do número digitado é:"+n);
		}
		else if (n < 0) {
		System.out.println("O valor absoluto do número digitado é: "+(n)*-1);
		}
		}
		
	}



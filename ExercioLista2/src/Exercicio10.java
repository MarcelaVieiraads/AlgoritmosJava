import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
         //um programa que irá ler um operador aritmético e dois operandos. 
		//Em seguida, o programa deverá calcular a operação indicada. 
		//As operações possíveis são: soma (+), subtração (-), multiplicação (*) e divisão (/). por exemol, Para a entrada * 8 5 a saída deverá ser 40.

		Scanner leitor = new Scanner(System.in);
		double n1, n2, resultado = 0;
		System.out.println("Digite a operação (+ - * /)");
		String operacao = leitor.nextLine();
		System.out.println("Digite o 1o operador:");
		n1 = leitor.nextDouble();
		System.out.println("Digite o 2o operador:");
		n2 = leitor.nextDouble();
		if (operacao.equals("+")) {

		resultado = n1+n2;
		}
		else if (operacao.equals("-")) {
		resultado = n1-n2;
		}
		else if (operacao.equals("*")) {
		resultado = n1*n2;
		}
		else if (operacao.equals("/")) {
		resultado = n1/n2;
		}
		else {
		System.out.println("Operador inválido.");
		}
		System.out.println(resultado);
		}
		
		
		
		
		
		
	}



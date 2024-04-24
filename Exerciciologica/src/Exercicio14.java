import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		//Faça um programa que receba o salário-base de um funcionário, calcule e mostre o salário
		//a receber, sabendo-se que esse funcionário tem gratificação de 5% sobre o salário-base,
		//e paga imposto de 7% sobre o valor total + gratificação
	
		//Programa Java para calcular salário líquido com gratificação e imposto
		//Java
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Digite o valor do salário-base:");
		        double salarioBase = scanner.nextDouble();

		        // Cálculo da gratificação
		        double gratificacao = salarioBase * 0.05;

		        // Cálculo do valor total (salário-base + gratificação)
		        double valorTotal = salarioBase + gratificacao;

		        // Cálculo do imposto
		        double imposto = valorTotal * 0.07;

		        // Cálculo do salário líquido
		        double salarioLiquido = valorTotal - imposto;

		        System.out.println("---------- Salário Detalhado ----------");
		        System.out.printf("Salário-base: R$ %.2f\n", salarioBase);
		        System.out.printf("Gratificação (5%%): R$ %.2f\n", gratificacao);
		        System.out.printf("Valor total (SB + Gratificação): R$ %.2f\n", valorTotal);
		        System.out.printf("Imposto (7%%): R$ %.2f\n", imposto);
		        System.out.printf("Salário líquido: R$ %.2f\n", salarioLiquido);
		    }
	}


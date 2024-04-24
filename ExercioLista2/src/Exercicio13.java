import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		//Criar um programa que irá ler o salário de um trabalhador e o valor da prestação de um
		//empréstimo, se a prestação for maior que 20% do salário imprima:
		//Empréstimo não concedido! caso contrário imprima: Empréstimo concedido!.
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		double sal, emp;
		System.out.println("Digite seu o valor do seu salário: R$ ");
		sal = leitor.nextDouble();
		System.out.println("Digite o valor do empréstimo: R$ ");


		emp = leitor.nextDouble();
		if (emp > sal * 0.20) {
		System.out.println("Empréstimo não concedido.");
		}
		else {
		System.out.println("Empréstimo concedido.");
		}
		}
		
	}



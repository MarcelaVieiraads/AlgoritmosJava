import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual a sua idade?");
		double idade= teclado .nextDouble();
		System.out.println("Qual a seu peso? ");
		double peso = teclado .nextDouble();
		if(idade < 25 && peso <= 65 ) {
			System.out.println(" Grupo1");
		}
		else if (idade <25  &&  peso >=65 ||idade <25 && peso ==100 || idade <25 &&peso <100 ) {
			System.out.println("Grupo 2");
		}
		else if (idade <25  &&  peso >100  ) {
			System.out.println("Grupo 3");
		}
		else if (idade >25 &&  peso <=65|| idade == 60 &&  peso <=65||idade < 60  &&  peso <=65  ) {
			System.out.println("Grupo 4");
		}
		else if (idade >25 && peso ==100 || idade == 60 && peso ==100 ||idade < 60 &&peso ==100 &&  peso >=65 ) {
			System.out.println("Grupo 5");
		}
		else if (idade >25 || idade == 60 &&   peso <100 ||idade < 60  &&   peso <100 ) {
			System.out.println("Grupo 6");
		}
		else if (idade >60 &&  peso <=65 ) {
			System.out.println("Grupo 7");
		}
		else if (idade >60  &&  peso >=65 || idade >60 &&peso ==100 ||idade >60 && peso <100 ) {
			System.out.println("Grupo 8");
		}
			else if (idade >60 &&  peso >100 ) {
				System.out.println("Grupo 9");
			}
		
		
		}
	}



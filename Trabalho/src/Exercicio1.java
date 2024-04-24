import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   Scanner teclado = new Scanner(System.in);
   System.out.println("Digite lado a");
		int ladoa = teclado .nextInt();
		System.out.println("Digite o lado b");
		int ladob = teclado .nextInt();
		System.out.println("Digite o ladoc");
		int ladoc = teclado .nextInt();
		System.out.println("Esse triangulo é :");
		if(ladoa == ladob && ladoa == ladoc) {
			System.out.println("É um equilátero");
		}
	   else if( ladoa == ladob || ladoa == ladoc || ladob == ladoc) {
		   System.out.println("É um Ísoscelis");
	   }
	   else if( ladoa!= ladob || ladob != ladoc || ladoc != ladoa) {
		   System.out.println("Escaleno");
	   }
		
	}

}

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner teclado= new Scanner(System.in);
  System.out.println("Digite sua nota ?");
  int nota= teclado.nextInt();
  System.out.println("Digite dua frequencia?");
  int frequencia = teclado.nextInt();
       if(nota>=7&&frequencia>=75) {
	   System.out.println("Parabéns você esta Aprovado!!");}
       else {
    	   System.out.println("Reprovado");
       }
  
  
  
	}

}

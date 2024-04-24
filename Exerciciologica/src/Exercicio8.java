import java.util.Scanner;

public class Exercicio8 {
	//Criar um programa que irá ler dois números (ponto flutuante) e exibir no console: a soma,
	//a subtração, a multiplicação, a divisão e o resto entre eles.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner teclado= new Scanner(System.in);
  System. out.println("Digite valor 1");
  float v1= teclado.nextFloat();
  System.out.println(" Digite valor 2");
  float v2 =teclado. nextFloat();
  float soma = v1 + v2 ;
  float sub = v1 - v2;
  float mult = v1 * v2;
  float div = v1 / v2;
 System.out.println("a soma é:"+ soma);
 System.out.println("subtração é: "+sub);
System.out.println(" multiplicação é:"+mult);
System.out.println("divisão é: "+div);
		
	}

}

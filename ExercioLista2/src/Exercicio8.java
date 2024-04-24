
import java.util.Scanner;
public class Exercicio8 {
	//Criar um programa para calcular o maior número entre 4 números lidos.

public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
int n1, n2, n3, n4, maiorNum;
System.out.println("Digite o primeiro número:");
n1 = teclado.nextInt();
System.out.println("Digite o segundo número:");
n2 = teclado.nextInt();
System.out.println("Digite o terceiro número:");
n3 = teclado.nextInt();
System.out.println("Digite o quarto número:");
n4 = teclado.nextInt();
maiorNum = Math.max(Math.max(n1, n2), Math.max(n3, n4));
System.out.println("O maior número é: " + maiorNum);}
}
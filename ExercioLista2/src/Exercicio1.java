import java.util.Scanner;
public class Exercicio1 {
public static void main(String[] args) {
	//Faça um programa que receba dois números inteiros e mostre qual é o maior deles.
Scanner teclado = new Scanner(System.in);
int n1, n2;
System.out.println("Digite o primeiro número inteiro:");
n1 = teclado.nextInt();
System.out.println("Digite o segundo número inteiro:");
n2 = teclado.nextInt();
if (n1 > n2) {
System.out.println("O primeiro número (" + n1 + ") é maior queo segundo número (" + n2 + ").");

}
else if (n2 > n1) {
System.out.println("O segundo número (" + n2 + ") é maior que oprimeiro número (" + n1 + ").");

}
else {
System.out.println("Os dois números são iguais.");
}
}
}
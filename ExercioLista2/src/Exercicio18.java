import java.util.Scanner;
public class Exercicio18 {

public static void main(String[] args) {
	//Implementar um programa que recebe como parâmetro um número inteiro n e retorne
	//1 se ele for divisível por 3 ou por 5, mas não simultaneamente pelos dois, ou 0 caso
	//contrário.
Scanner leitor = new Scanner(System.in);
int n, result;
System.out.println("Digite um número inteiro:");
n = leitor.nextInt();
if ((n % 3 == 0 || n % 5 == 0) && !(n % 3 == 0 && n % 5 == 0)){
System.out.println("1 (um).");
}
else {
System.out.println("0 (zero).");
}
}
}
import java.util.Scanner;
public class Exercicio16 {
public static void main(String[] args) {
	//Criar um programa que irá ler os 3 lados de um triângulo e na sequência deverá
	//informar se o triângulo é equilátero, isósceles ou escaleno.
	//Triângulo equilátero: 3 lados iguais
	//Triângulo isósceles: 2 lados iguais
	//Triângulo escaleno: todos os lados diferentes
Scanner leitor = new Scanner(System.in);
int a, b, c;
System.out.println("Digite o lado A:");
a = leitor.nextInt();
System.out.println("Digite o lado B:");
b = leitor.nextInt();
System.out.println("Digite o lado C:");
c = leitor.nextInt();
if (a==b && b==c) {
System.out.println("Os 3 lados são iguais, então é um triânguloequilátero.");


}
else if (a==b || b==c) {
System.out.println("Temos 2 lados iguais, então é um triânguloisósceles.");
}
else {
System.out.println("Todos os lados diferentes.");
}
}
}
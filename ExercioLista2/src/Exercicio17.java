import java.util.Scanner;
public class Exercicio17 {
public static void main(String[] args) {
	//Implementar um programa que recebe como parâmetro três números maiores que zero
	//(x, y, z) e uma operação numérica que pode assumir os valores 1, 2, 3 e 4. Caso a
	//operação seja 1, o programa deve calcular a média geométrica, caso seja 2, a média
	//ponderada, caso seja 3, a média harmônica, caso seja 4, a média aritmética.
Scanner leitor = new Scanner(System.in);
double n1, n2, n3, result;
int escolha;
System.out.println("Digite a primeira nota:");
n1 = leitor.nextDouble();
System.out.println("Digite a segunda nota:");
n2 = leitor.nextDouble();
System.out.println("Digite a terceira nota:");
n3 = leitor.nextDouble();
System.out.println("Opção 1: Média Geométrica.");
System.out.println("Opção 2: Média Ponderada.");
System.out.println("Opção 3: Média Harmônica.");
System.out.println("Opção 4: Média Aritmética.");
escolha = leitor.nextInt();
if (escolha==1) {
result = n1 * n2 * n3;
System.out.println("A média geométrica de "+result+" é"+Math.cbrt(result));
}
else if (escolha==2){

result = (n1 + (2 * n2) + (3 * n3)) / 6;
System.out.println("A média ponderada é "+result);
}
else if (escolha==3) {
result = 3 / ((1/n1) + (1/n2) + (1/n3));
System.out.println("A média harmônica é "+result);
}
else if (escolha==4) {
result = (n1 + n2 + n3) / 3;
System.out.println("A média aritmética é "+result);
}
else {
System.out.println("ERRO!!!\nOpção inválida.");
}
}
}
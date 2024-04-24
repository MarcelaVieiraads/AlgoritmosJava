import java.util.Scanner;
public class Exercicio14 {
public static void main(String[] args) {
	//A empresa Miranda ́s Services, maior empresa de tecnologia do mundo, vai dar
	//aumento de salário de acordo com a tabela abaixo. Você deve criar um programa para
	//ler o salário e escrever o mesmo após o reajuste.
	//SALÁRIO AUMENTO
	//até R$ 1800,00 35%
	//acima de R$ 1800,00 15%
Scanner leitor = new Scanner(System.in);
double salario;
System.out.println("Digite seu o valor do seu salário: R$ ");
salario = leitor.nextDouble();
if (salario <= 1800) {
System.out.println("Seu salário com ajuste é: R$"+(salario * 1.35));
}
else {
System.out.println("Seu salário com ajuste é: R$"+(salario * 1.15));
}
}
}
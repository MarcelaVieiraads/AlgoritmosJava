import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub2.
		// Uma empresa vai dar aumento de 30% para funcionários que ganham até R$
		// 500,00.
		// Leia o salário e mostre o valor reajustado (caso ele tenha direito), ou uma
		// mensagem (caso ele NÃO tenha direito).
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite o seu salario!");
		double salario = teclado.nextDouble();
		double aumento = (salario * 0.30);
		double calculo = (salario + aumento);
		if (salario <= 500) {
			System.out.println("você ira receber  " + calculo +" Parabéns");
		} else if (salario >= 500) {
			System.out.println("Infelizmente não foi dessa vez");

		}
	}

}

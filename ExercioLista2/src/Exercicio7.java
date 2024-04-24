import java.util.Scanner;

public class Exercicio7 {
	// O banco Miranda ́s Coorporation possui dois tipos de investimentos, poupança
	// e
	// fundos XPTO. Crie um programa para ler o tipo do investimento e o valor
	// investido, em
	// seguida, o programa deverá calcular e escrever o valor reajustado pelo
	// rendimento.
//TIPO DESCRIÇÃO RENDIMENTO
	// 1 Poupança 1,85%
	// 2 Fundos XPTO 2,50%
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int escolha;
		double poupanca, fundosXpto, restPou, restXpto;
		System.out.println("Digite 1 para POUPANÇA ou 2 para FUNDOSXPTO:");

		escolha = teclado.nextInt();
		if (escolha == 1) {
			System.out.println("Digite valor a ser depositado:");
			poupanca = teclado.nextDouble();
			restPou = poupanca * 1.0185;
			System.out.printf("Valor com aplicação é: R$%.2f",

					restPou);
		} else if (escolha == 2) {
			System.out.println("Digite valor a ser depositado:");
			fundosXpto = teclado.nextDouble();
			restXpto = fundosXpto * 1.0250;
			System.out.printf("Valor com aplicação é: R$%.2f",

					restXpto);
		} else {
			System.out.println("Erro: número inválido");
		}
	}
}
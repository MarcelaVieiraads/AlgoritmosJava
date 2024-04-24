import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		//Uma conta poupança foi aberta com um depósito de X reais (você deve ler este número),
		//com rendimentos 0.56% de juros ao mês. No segundo mês, R$303,20 reais foram
		//depositados nessa conta poupança. No terceiro mês R$58,25 reais foram retirados da
		//conta. Implemente um programa que imprime quanto haverá nessa conta no quarto mês.

		Scanner scanner = new Scanner(System.in);

        // Leitura do valor do depósito inicial
        System.out.println("Digite o valor do depósito inicial:");
        double depositoInicial = scanner.nextDouble();

        // Leitura do valor do depósito do segundo mês
        System.out.println("Digite o valor do depósito do segundo mês:");
        double depositoSegundoMes = scanner.nextDouble();

        // Leitura do valor do saque do terceiro mês
        System.out.println("Digite o valor do saque do terceiro mês:");
        double saqueTerceiroMes = scanner.nextDouble();

        // Cálculo do saldo no primeiro mês
        double saldoPrimeiroMes = depositoInicial;

        // Cálculo do saldo no segundo mês (considerando juros e novo depósito)
        double jurosPrimeiroMes = saldoPrimeiroMes * 0.0056;
        double saldoSegundoMes = saldoPrimeiroMes + jurosPrimeiroMes + depositoSegundoMes;

        // Cálculo do saldo no terceiro mês (considerando juros e saque)
        double jurosSegundoMes = saldoSegundoMes * 0.0056;
        double saldoTerceiroMes = saldoSegundoMes + jurosSegundoMes - saqueTerceiroMes;

        // Cálculo do saldo no quarto mês (considerando juros)
        double jurosTerceiroMes = saldoTerceiroMes * 0.0056;
        double saldoQuartoMes = saldoTerceiroMes + jurosTerceiroMes;

        // Exibição do saldo no quarto mês
        System.out.printf("Saldo no quarto mês: R$ %.2f\n", saldoQuartoMes);
    }
}
	

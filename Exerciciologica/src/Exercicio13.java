import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		//Escreva um algoritmo para criar um programa de ajuda para vendedores. A partir de um
		//valor total lido, mostrar:
		// o total a pagar com desconto de 10%;
		// o valor de cada parcela, no parcelamento de 3x sem juros;
		//a comissão do vendedor, no caso da venda ser a vista (5% sobre o valor com
		//desconto)
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o valor total da venda:");
	        double valorTotal = scanner.nextDouble();

	        double desconto = valorTotal * 0.1;
	        double totalComDesconto = valorTotal - desconto;
	        double valorParcela = totalComDesconto / 3;
	        double comissaoVista = totalComDesconto * 0.05;

	        System.out.println("---------- Resultado da Venda ----------");
	        System.out.printf("Valor total: R$ %.2f\n", valorTotal);
	        System.out.printf("Desconto: R$ %.2f\n", desconto);
	        System.out.printf("Total com desconto: R$ %.2f\n", totalComDesconto);
	        System.out.printf("Valor da parcela (3x sem juros): R$ %.2f\n", valorParcela);
	        System.out.printf("Comissão do vendedor (venda à vista): R$ %.2f\n", comissaoVista);
	
	}

}

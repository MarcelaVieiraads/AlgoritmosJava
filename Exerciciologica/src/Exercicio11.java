import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		//Faça um programa para ler o comprimento dos dois lados de um triângulo retângulo,
		//calcular e imprimir o valor da hipotenusa.
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o comprimento do cateto adjacente:");
        double catetoAdjacente = scanner.nextDouble();

        System.out.println("Digite o comprimento do cateto oposto:");
        double catetoOposto = scanner.nextDouble();

        double hipotenusa = Math.sqrt(catetoAdjacente * catetoAdjacente + catetoOposto * catetoOposto);

        System.out.println("\nHipotenusa: " + hipotenusa);
    }
}

	


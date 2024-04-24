import java.util.Scanner;

public class Exercicio4 {
	//Criar um programa para ler duas variáveis e trocar o conteúdo delas. O resultado deve ser
	//impresso na saída padrão. Dica: utilize uma terceira variável.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
        int b = 10;

        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);

        // Variável auxiliar para armazenar o valor de a temporariamente
        int temp = a;

        // Atribuindo o valor de b à variável a
        a = b;

        // Atribuindo o valor armazenado em temp à variável b
        b = temp;

        System.out.println("\nValores após a troca:");
        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);
    }
}
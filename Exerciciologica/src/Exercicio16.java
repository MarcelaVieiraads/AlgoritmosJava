import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		//Construa um programa que, tendo como dados de entrada dois pontos quaisquer no
		//plano, P(x1,y1) e P(x2,y2), escreva a distância entre eles. A fórmula que efetua tal cálculo
		//é:
		Scanner scanner = new Scanner(System.in);

        // Leitura das coordenadas do ponto P1
        System.out.println("Digite as coordenadas do ponto P1 (x1, y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        // Leitura das coordenadas do ponto P2
        System.out.println("Digite as coordenadas do ponto P2 (x2, y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Cálculo da distância entre os pontos
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Exibição da distância
        System.out.printf("A distância entre os pontos P1 e P2 é de: %.2f unidades\n", distancia);
    }
}
	



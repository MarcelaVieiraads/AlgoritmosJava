import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// receba salario -> calcule e mostre aumento 25%
		//definir variaveis
		//salario + aumento (opcional)
		//ler variaveis
		//calcular aumento
		//mostrar o valor final
    Scanner leitor = new Scanner(System.in);
    System.out.println ("funcionaria Marcela vieira recebe atualmernte:");
    double reais=leitor.nextDouble();
    double aumento= (reais*0.25);
    double calculo= (reais+aumento);
    System.out.println("A Marcela irá receber: " +calculo);
    
    
	}

}

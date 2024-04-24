import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		//12.Criar um programa que irá ler a idade de um jogador de futebol e escrever na saída
		//padrão a categoria do craque baseada na sua idade. As seguintes regras devem ser
		//respeitadas:
		//● De 5 a 10 anos: Infantil
		//● De 11 a 15 anos: Juvenil
		//● De 16 a 20 anos: Júnior
		//● De 21 a 33 anos: Profissional
		//● Acima de 34 anos: Melhor procurar outra profissão!
		// TODO Auto-generated method stub
 Scanner Teclado = new Scanner (System.in);
		System.out.println("Digite a sua idade");
		 int idade = Teclado.nextInt();
		 if(idade>=5 && idade<=10) {
		 System.out.println("Infantil");
		 }
		 else if (idade>=11 && idade<=15) {
			 System.out.println("Juvenil");
			  }
		 else if (idade>=16 && idade<=20) {
			 System.out.println("Júnior");
		 }
		 else if (idade>=21 && idade<=33) {
			 System.out.println("Profissional");
		 }
			 else if (idade>=21 && idade<=33) {
				 System.out.println("Júnior");
			 }
				 else if (idade>=34) {
					 System.out.println("Melhor procurar outra profissaõ!");
		}

	}
}

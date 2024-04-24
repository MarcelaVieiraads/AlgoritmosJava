import java.util.Scanner;

public class Exercio15 {

	public static void main(String[] args) {
		//15.Criar um programa que irá ler duas datas e em seguida, deverá imprimir qual delas
		//ocorreu cronologicamente primeiro. Cada data é composta por 3 números inteiros, um
		//representando o dia, outro o mês e outro o ano.
		// TODO Auto-generated method stub
		
		Scanner calendario = new Scanner(System.in);
		int d1, d2, m1, m2, a1, a2;
		System.out.println("Digite o dia:");
		d1 = calendario.nextInt();
		System.out.println("Mês:");
		m1 = calendario.nextInt();
		System.out.println("Ano:");
		a1 = calendario.nextInt();
		System.out.println(d1+"/"+m1+"/"+a1);
		System.out.println("Digite mais um dia:");
		d2 = calendario.nextInt();
		System.out.println("Mês:");
		m2 = calendario.nextInt();
		System.out.println("Ano:");
		a2 = calendario.nextInt();
		System.out.println(d2+"/"+m2+"/"+a2);
		if (a1<a2 || (a1==a2 && m1<m2) || (a1==a2 && m1==m2 && d1<d2) ) {
		System.out.println("A data que ocorreu primeiro foi:"+d1+"/"+m1+"/"+a1);
		}
		else {
		System.out.println("A data que ocorreu primeiro foi:"+d2+"/"+m2+"/"+a2);
		}
		}
		
	}



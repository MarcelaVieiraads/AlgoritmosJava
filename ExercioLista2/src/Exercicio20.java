import java.util.Scanner;
public class Exercicio20 {
public static void main(String[] args) {
	//Utilize um operador ternário para atribuir valores a uma variável nos seguintes
	//cenários. Você irá precisar de uma variável para receber o resultado e uma variável a
	//ser avaliada.
	//a. Verifique se você precisa mudar de emprego. Se seu salário for maior que 10.500
	//atribua “fique quietinho ai”, caso contrário “mude de emprego”.
	//b. Verifique se seu time de futebol precisa investir em jogadores. Se já conquistou
	//mais que 3 títulos (brasileirão) atribua “melhor do Brasil!”, caso contrário
	//“precisamos investir mais”.
	//c. Verifique se uma variável é maior que 1500. Se sim, atribua “true”, caso contrário,
	//“false”.
Scanner leitor = new Scanner(System.in);
double sal;
System.out.println("Digite seu salário: R$ ");
sal = leitor.nextDouble();
String decisao = (sal > 10500) ? "Fique quietinho ai!" : "Mude de emprego.";

System.out.println(decisao);
System.out.println("Digite o titilo do brasileirão:");
int brasileirao = leitor.nextInt();
String jogador = (brasileirao > 3) ? "Melhor do Brasil!" : "Precisamosinvestir mais.";

System.out.println(jogador);
System.out.println("Digite um valor:");
double n = leitor.nextDouble();
boolean variavel = (n > 1500) ? true : false;
System.out.println(variavel);}
}
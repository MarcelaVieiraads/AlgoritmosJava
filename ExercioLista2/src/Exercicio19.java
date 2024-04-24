import java.util.Scanner;
public class Exercicio19 {
public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);
int cod, quantidade;
double preco, totalNota, desconto, precoFinal;
System.out.println("Digite o código do produto (1 à 40):");
cod = leitor.nextInt();
System.out.println("Digite a quantidade de produtos:");
quantidade = leitor.nextInt();
if (cod >=1 && cod<=10) {
preco = 10;
}
else if (cod >=11 && cod<=20) {
preco = 15;
}
else if (cod >=21 && cod<=30) {
preco = 20;
}
else if (cod >=31 && cod<=40) {
preco = 30;
}
else {
System.out.println("Código inválido!");
return;
}
totalNota = quantidade * preco;
if (totalNota <=250) {
desconto = totalNota * 0.05;
}
else if (totalNota >250 && totalNota <=500) {
desconto = totalNota * 0.10;
}
else {
desconto = totalNota * 0.15;
}
precoFinal = totalNota - desconto;
System.out.println("Preço unitário: R$ "+preco);
System.out.println("Total da nota: R$ "+totalNota);
System.out.println("Valor do desconto: R$ "+(desconto));
System.out.println("Valor final com desconto: R$ "+precoFinal);
}
}
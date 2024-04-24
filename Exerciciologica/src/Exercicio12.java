
public class Exercicio12 {

	public static void main(String[] args) {
		//Criar um programa que irá ler um valor inteiro em segundos e depois irá mostrá-lo em
		//horas, minutos e segundos.
		 // Valor inicial em segundos
        int segundos = 7259;

        // Conversão para horas
        int horas = segundos / 3600;
        segundos %= 3600; // Atualiza o valor de 'segundos' para o restante após a conversão para horas

        // Conversão para minutos
        int minutos = segundos / 60;
        segundos %= 60; // Atualiza o valor de 'segundos' para o restante após a conversão para minutos

        // Exibindo o resultado
        System.out.println(segundos + " segundos equivalem a:");
        System.out.println(horas + " horas, " + minutos + " minutos e " + segundos + " segundos");
    }
}

	

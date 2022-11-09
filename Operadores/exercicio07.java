/*Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius. A fórmula de conversão de
temperatura a ser utilizada é C = (F - 32) * 5 / 9, em que a variável F é a temperatura em graus Fahrenheit e a
variável C é a temperatura em graus Celsius. */

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {

		int f;
		double c;

		Scanner leitura = new Scanner(System.in);

		System.out.println("E agora vamos converter Fahrenheit em Celsius? ");
		System.out.println("Insira a temperatura em Fahrenheit: ");

		f = leitura.nextInt();
		c = (f - 32) * 5 / 9;

		System.out.println("A quantidade convertida em Celsius é: " + c);

	}

}

/*Ler uma temperatura em graus Fahrenheit e apresent�-Ia convertida em graus Celsius. A f�rmula de convers�o de
temperatura a ser utilizada � C = (F - 32) * 5 / 9, em que a vari�vel F � a temperatura em graus Fahrenheit e a
vari�vel C � a temperatura em graus Celsius. */

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

		System.out.println("A quantidade convertida em Celsius �: " + c);

	}

}

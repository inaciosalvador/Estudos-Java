/*Ler uma temperatura em graus Celsius e apresent�-Ia convertida em graus Fahrenheit. A f�rmula de convers�o de
temperatura a ser utilizada � F = (9 * C + 160) / 5, em que a vari�vel F representa � a temperatura em graus
Fahrenheit e a vari�vel C representa � a temperatura em graus Celsius. */


import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		int c;
		double f;

		Scanner leitura = new Scanner(System.in);
		System.out.println("Vamos converter Celsius em Fahrenheit? Insira a quantidade de graus Celsius: ");
		c = leitura.nextInt();

		f = (9 * c + 160) / 5;

		System.out.println("A temperatura em Fahrenheit �: " + f);
		
	}

}

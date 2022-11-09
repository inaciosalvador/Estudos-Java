/*Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de
temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura em graus
Fahrenheit e a variável C representa é a temperatura em graus Celsius. */


import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		int c;
		double f;

		Scanner leitura = new Scanner(System.in);
		System.out.println("Vamos converter Celsius em Fahrenheit? Insira a quantidade de graus Celsius: ");
		c = leitura.nextInt();

		f = (9 * c + 160) / 5;

		System.out.println("A temperatura em Fahrenheit é: " + f);
		
	}

}

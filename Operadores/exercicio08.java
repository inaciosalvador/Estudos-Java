/* Calcular e apresentar o valor do volume de uma lata de �leo, utilizando a f�rmula:
V = 3.14159 * R * R * A
Onde as vari�veis: V, R e A representam respectivamente o volume, o raio e a altura.*/

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {

		double v, a, r;

		Scanner leitura = new Scanner(System.in);

		System.out.println("Vamos calcular o volume da lata de oleo.");
		System.out.println("Informe o raio e a altura respectivamente.");

		r = leitura.nextDouble();
		a = leitura.nextDouble();

		v = 3.14159 * r * r * a;

		System.out.println("O volume da lata � de: " + v);

	}

}

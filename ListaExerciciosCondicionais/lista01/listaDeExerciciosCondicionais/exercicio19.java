package listaDeExerciciosCondicionais;

import java.util.Scanner;

public class exercicio19 {

	public static void main(String[] args) {

		double a, b, c;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira 3 valores: ");

		a = entrada.nextDouble();
		b = entrada.nextDouble();
		c = entrada.nextDouble();

		if (a < (b + c) || b < (a + c) || c < (b + a)) { // primeiro teste para verificar se cada lado é menor que a soma dos outros dois.
			if (a == b || b == c) {
				System.out.println("Triangulo equilatero.");
			} else if (a == b && a == c && b == c) {
				System.out.println("Triangulo isosceles.");

			} else {
				System.out.println("triangulo escaleno.");
			}

		} else {
			System.out.println("Os valores não caracterizam um triangulo. "); // caso cada lado não seja menor que a soma dos outros dois, vai aparecer esta mensagem.
		}

	}

}

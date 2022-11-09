/*Escreva um programa que leia três valores para os lados de um triângulo (variáveis A, B e C). Verificar se cada lado
é menor que a soma dos outros dois lados. Se sim, saber de A==B e se B==C, sendo verdade o triângulo é eqüilátero;
Se não, verificar de A==B ou se A==C ou se B==C, sendo verdade o triângulo é isósceles; e caso contrário, o
triângulo será escaleno. Caso os lados fornecidos não caracterizarem um triângulo, avisar a ocorrência. */

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

		if (a < (b + c) || b < (a + c) || c < (b + a)) { // primeiro teste para verificar se cada lado é menor que a
															// soma dos outros dois.
			if (a == b || b == c) {
				System.out.println("Triangulo equilatero.");
			} else if (a == b && a == c && b == c) {
				System.out.println("Triangulo isosceles.");

			} else {
				System.out.println("triangulo escaleno.");
			}

		} else {
			System.out.println("Os valores não caracterizam um triangulo. "); // caso cada lado não seja menor que a
																				// soma dos outros dois, vai aparecer
																				// esta mensagem.
		}
		entrada.close();
	}

}

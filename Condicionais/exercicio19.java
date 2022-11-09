/*Escreva um programa que leia tr�s valores para os lados de um tri�ngulo (vari�veis A, B e C). Verificar se cada lado
� menor que a soma dos outros dois lados. Se sim, saber de A==B e se B==C, sendo verdade o tri�ngulo � eq�il�tero;
Se n�o, verificar de A==B ou se A==C ou se B==C, sendo verdade o tri�ngulo � is�sceles; e caso contr�rio, o
tri�ngulo ser� escaleno. Caso os lados fornecidos n�o caracterizarem um tri�ngulo, avisar a ocorr�ncia. */

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

		if (a < (b + c) || b < (a + c) || c < (b + a)) { // primeiro teste para verificar se cada lado � menor que a
															// soma dos outros dois.
			if (a == b || b == c) {
				System.out.println("Triangulo equilatero.");
			} else if (a == b && a == c && b == c) {
				System.out.println("Triangulo isosceles.");

			} else {
				System.out.println("triangulo escaleno.");
			}

		} else {
			System.out.println("Os valores n�o caracterizam um triangulo. "); // caso cada lado n�o seja menor que a
																				// soma dos outros dois, vai aparecer
																				// esta mensagem.
		}
		entrada.close();
	}

}

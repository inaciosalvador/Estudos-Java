/* Escrever um programa que leia um conjunto de n�meros positivos, e exiba se o n�mero lido � par ou �mpar. Exiba
ao final a soma total dos n�meros pares lidos e tamb�m a soma dos n�meros �mpares lidos. Suporemos que o
n�mero de elementos deste conjunto n�o � conhecido, e que um n�mero negativo ser� utilizado para sinalizar o fim
dos dados.*/

import java.util.Scanner;

public class exercicio31 {

	public static void main(String[] args) {

		int cont = 1, par = 0, impar = 0;

		while (cont > 0) {

			Scanner ler = new Scanner(System.in); // Onde colocar o ler.close(); ??????

			System.out.println("\n\n\n� PAR OU IMPAR? INSIRA VALORES POSITIVOS (PARA SAIR DIGITE UM NEGATIVO.)\n\n\n");
			cont = ler.nextInt();
			if (cont % 2 == 0) {
				System.out.println(cont + " � PAR \n\n\n");
				par += cont;
			} else {
				System.out.println(cont + " � IMPAR \n\n\n");
				impar += cont;
			}

		}
		System.out.println("A soma dos numero pares inseridos �: " + par);
		System.out.println("A soma dos numero impares inseridos �: " + impar);

	}
}

/*
 * Professor, nesse caso n�o posso usar o ler.close(); para fechar a scanner,
 * nem dentro, nem fora do loop, como resolvo isso?
 */

/*Escreva um programa que leia dois n�meros e exiba mensagem informando o valor do maior n�mero e o valor do
menor n�mero. Se os dois n�meros forem iguais, o programa deve exibir mensagem informando este fato. */

package listaDeExerciciosCondicionais;

import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {
		double a, b;
		Scanner ler = new Scanner(System.in);

		System.out.println("Insira 2 valores");
		a = ler.nextDouble();
		b = ler.nextDouble();

		if (a > b) {
			System.out.println(a + " � maior que " + b);
		} else if (a == b) {
			System.out.println("Os numeros s�o iguais");
		} else {
			System.out.println(b + " � maior que " + a);
		}
		ler.close();
	}

}

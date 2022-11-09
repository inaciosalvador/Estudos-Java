/*Escreva um programa que leia dois números e exiba mensagem informando o valor do maior número e o valor do
menor número. Se os dois números forem iguais, o programa deve exibir mensagem informando este fato. */

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
			System.out.println(a + " é maior que " + b);
		} else if (a == b) {
			System.out.println("Os numeros são iguais");
		} else {
			System.out.println(b + " é maior que " + a);
		}
		ler.close();
	}

}

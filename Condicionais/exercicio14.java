/*Escreva um programa que leia dois n�meros e apresente a diferen�a do maior para o menor.*/

package listaDeExerciciosCondicionais;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {

		int a, b;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite 2 numeros: ");
		a = ler.nextInt();
		b = ler.nextInt();

		System.out.println("A diferen�a do 1� para o 2� �: " + (a - b));

		ler.close();
	}

}

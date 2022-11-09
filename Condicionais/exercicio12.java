/*) Escreva um programa que leia um número inteiro e exiba o seu módulo. O módulo de um número x é: x se x é maior
ou igual a zero
x * (-1) se x é menor que zero*/

package listaDeExerciciosCondicionais;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {

		int a;

		Scanner ler = new Scanner(System.in);
		System.out.println("Olá! Digite um numero: ");

		a = ler.nextInt();

		if (a >= 0) {
			System.out.println("O modulo de " + a + " é: " + a);
		} else {
			a = a * (-1);
			System.out.println(" o modulo de " + a + "é: " + a);
		}

		ler.close();
	}

}

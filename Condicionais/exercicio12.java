/*) Escreva um programa que leia um n�mero inteiro e exiba o seu m�dulo. O m�dulo de um n�mero x �: x se x � maior
ou igual a zero
x * (-1) se x � menor que zero*/

package listaDeExerciciosCondicionais;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {

		int a;

		Scanner ler = new Scanner(System.in);
		System.out.println("Ol�! Digite um numero: ");

		a = ler.nextInt();

		if (a >= 0) {
			System.out.println("O modulo de " + a + " �: " + a);
		} else {
			a = a * (-1);
			System.out.println(" o modulo de " + a + "�: " + a);
		}

		ler.close();
	}

}

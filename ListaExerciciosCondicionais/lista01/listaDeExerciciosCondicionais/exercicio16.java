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

	}

}

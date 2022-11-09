package listaDeExerciciosCondicionais;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {

		int a, b;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite 2 numeros: ");
		a = ler.nextInt();
		b = ler.nextInt();

		System.out.println("A diferença do 1º para o 2º é: " + (a - b));

	}

}

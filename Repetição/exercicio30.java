/*) Faça um programa para imprimir uma tabuada. */

import java.util.Scanner;

public class exercicio30 {

	public static void main(String[] args) {

		int tab;
		Scanner ler = new Scanner(System.in);
		System.out.println("TABUADA \n Escolha um numero para a tabuada de multiplicação: ");
		tab = ler.nextInt();
		for (int cont = 1; cont < 10; cont++) {
			System.out.println(tab + "x" + cont + "=" + (tab * cont));
		}
		ler.close();
	}

}

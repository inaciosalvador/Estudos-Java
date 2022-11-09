/*) Escreva um programa que exiba as seguintes opções e realize os que se pede em cada uma delas: 1 – Adição
2 – Subtração
3 – Multiplicação
4 – Divisão*/

package listaDeExerciciosCondicionais;

import java.util.Scanner;

public class exercicio23 {

	public static void main(String[] args) {
		int a, b, x;

		System.out.println("Insira dois valores: "); // o usuario insere 2 valores e depois escolhe a opereção
		Scanner ler = new Scanner(System.in);
		a = ler.nextInt();
		b = ler.nextInt();
		System.out.println(
				"Calculadora Online\nEscolha uma opção: \n 1-Adição \n 2-Subtração \n 3-Multiplicação \n 4-Divisão \n 5-Sair");
		x = ler.nextInt();

		switch (x) {
		case 1: // adição
			System.out.print("O valor da soma é: " + (a + b));
			break;

		case 2: // subtração
			System.out.print("O valor da subtração é: " + (a - b));
			break;

		case 3: // multiplicação
			System.out.print("O valor da multiplicação é: " + (a * b));
			break;

		case 4: // divisão
			System.out.print("O valor da divisão é: " + (a / b));
			break;

		default:
			System.out.println("Insira uma opção valida: ");

		}
		ler.close();
	}

}

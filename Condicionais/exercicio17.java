/*) Escreva um programa que leia um número inteiro. Verificar por meio de condição se o valor fornecido está na faixa
entre 0 (zero) e 9 (nove). Caso o valor fornecido esteja dentro da faixa, apresentar a mensagem “valor válido”. Caso
contrário, apresentar a mensagem “valor inválido”.*/

package listaDeExerciciosCondicionais;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		int x;

		Scanner input = new Scanner(System.in);

		System.out.println("Insira um valor inteiro: ");
		x = input.nextInt();

		if (x >= 0 && x < 10) {
			System.out.println("Valor válido");
		} else {
			System.out.println("Valor invalido");

		}
		input.close();
	}

}

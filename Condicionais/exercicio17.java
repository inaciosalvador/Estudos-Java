/*) Escreva um programa que leia um n�mero inteiro. Verificar por meio de condi��o se o valor fornecido est� na faixa
entre 0 (zero) e 9 (nove). Caso o valor fornecido esteja dentro da faixa, apresentar a mensagem �valor v�lido�. Caso
contr�rio, apresentar a mensagem �valor inv�lido�.*/

package listaDeExerciciosCondicionais;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		int x;

		Scanner input = new Scanner(System.in);

		System.out.println("Insira um valor inteiro: ");
		x = input.nextInt();

		if (x >= 0 && x < 10) {
			System.out.println("Valor v�lido");
		} else {
			System.out.println("Valor invalido");

		}
		input.close();
	}

}

/*) Escreva um programa que exiba as seguintes op��es e realize os que se pede em cada uma delas: 1 � Adi��o
2 � Subtra��o
3 � Multiplica��o
4 � Divis�o*/

package listaDeExerciciosCondicionais;

import java.util.Scanner;

public class exercicio23 {

	public static void main(String[] args) {
		int a, b, x;

		System.out.println("Insira dois valores: "); // o usuario insere 2 valores e depois escolhe a opere��o
		Scanner ler = new Scanner(System.in);
		a = ler.nextInt();
		b = ler.nextInt();
		System.out.println(
				"Calculadora Online\nEscolha uma op��o: \n 1-Adi��o \n 2-Subtra��o \n 3-Multiplica��o \n 4-Divis�o \n 5-Sair");
		x = ler.nextInt();

		switch (x) {
		case 1: // adi��o
			System.out.print("O valor da soma �: " + (a + b));
			break;

		case 2: // subtra��o
			System.out.print("O valor da subtra��o �: " + (a - b));
			break;

		case 3: // multiplica��o
			System.out.print("O valor da multiplica��o �: " + (a * b));
			break;

		case 4: // divis�o
			System.out.print("O valor da divis�o �: " + (a / b));
			break;

		default:
			System.out.println("Insira uma op��o valida: ");

		}
		ler.close();
	}

}

/*Ler dois valores inteiros para as vari�veis A e B, efetuar a troca dos valores de modo que a vari�vel A passe a
possuir o valor da vari�vel B, e a vari�vel B passe a possuir o valor da vari�vel A. Apresentar os valores trocados.*/

package listaDeExerciciosCondicionais;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {

		int a;
		int b;
		int c; // Foi necessario esta variavel para fazer a troca dos valores de A e B

		Scanner leitura = new Scanner(System.in);

		System.out.println("Seja bem vindo! Para comer�ar, insira dois numeros: ");
		a = leitura.nextInt();
		b = leitura.nextInt();
		System.out.println("O numero escolhido para A foi: " + a);
		System.out.println("O numero escolhido para B foi: " + b);

		c = a;
		a = b;
		b = c;

		System.out.println("O novo valor de A �: " + a);
		System.out.println("O novo valor de B �: " + b);
		System.out.println("Obrigado pela ajuda variavel C ! ");

		leitura.close();
	}

}
/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa
expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias. */

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {

		int idade, meses, dias;

		Scanner leitura = new Scanner(System.in);
		System.out.println("Insira sua idade: ");
		idade = leitura.nextInt();

		meses = idade * 12;
		dias = meses * 365;

		System.out.println("voce tem " + meses + " meses e " + dias + " dias de vida.");

	}

}

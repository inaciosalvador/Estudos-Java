/* Escreva um programa que leia:
- a quantidade de números que deverá processar;
- os números que deverá processar,e calcule e exiba, para cada número a ser processado o seu fatorial. Lembrete:
O fatorial de um número N é dado pela fórmula: N! = 1 * 2 * 3 * 4 * 5 * ... * N*/

import java.util.Scanner;

public class exercicio27 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n1 = 0, n = 0, fat = 0, fatora = 1;
		System.out.println("Digite quantos números deseja fatoriar: ");
		fatora = input.nextInt();
		while (fatora != n1) {
			System.out.println("Digite um valor inteiro: ");
			n = input.nextInt();
			for (int cont = 0; n >= 1; cont--) {
				fat = fat * cont;
				System.out.println("Fatorial de " + n + " é: " + fat); // incompleto...
			}

		}

	}

}

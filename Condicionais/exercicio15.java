/*Escreva um programa que leia quatro notas escolares de um aluno e apresentar uma mensagem que o aluno foi
aprovado se o valor da m�dia escolar for maior ou igual a 7. Se o valor da m�dia for menor que 7, solicitar a nota do
recupera��o, somar com o valor da m�dia e obter a nova m�dia. Se a nova m�dia for maior ou igual a 7, apresentar
uma mensagem informando que o aluno foi aprovado na recupera��o. Se o aluno n�o foi aprovado, apresentar uma
mensagem informando esta condi��o. Apresentar junto com as mensagens o valor da m�dia do aluno. */

package listaDeExerciciosCondicionais;

import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {

		int semestre;
		double media = 0, mediaGeral, recupera = 0, novaMedia;

		for (semestre = 1; semestre <= 4; ++semestre) { // la�o para incrementar o periodo do semestre

			Scanner ler = new Scanner(System.in);

			System.out.println("Informe sua nota do " + semestre + "� semestre.");

			media += ler.nextDouble(); // variavel m�dia � um acumulador, para que seja dividido por 4 em seguida.

		}

		mediaGeral = media / 4;

		System.out.println("Sua M�dia foi de: " + mediaGeral);

		if (mediaGeral >= 7) {
			System.out.println("Voc� foi aprovado.");
		} else {

			Scanner ler = new Scanner(System.in);
			System.out.println("Infelizmente voc� n�o passou por m�dia.\n");
			System.out.println("Insira sua nota de recupera��o.");

			recupera = ler.nextDouble(); // variavel para ser somada a nova media
			novaMedia = (mediaGeral + recupera); // calculo para verificar se a nova media � maior que 7

			if (novaMedia >= 7) { // novo teste
				System.out.println("Voc� foi aprovado.");
			} else
				System.out.println("Voc� foi reprovado.");

		}

	}

}

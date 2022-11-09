package listaDeExerciciosCondicionais;

import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {

		int semestre;
		double media = 0, mediaGeral, recupera = 0, novaMedia;

		for (semestre = 1; semestre <= 4; ++semestre) { // laço para incrementar o periodo do semestre

			Scanner ler = new Scanner(System.in);

			System.out.println("Informe sua nota do " + semestre + "º semestre.");

			media += ler.nextDouble(); // variavel média é um acumulador, para que seja dividido por 4 em seguida.

		}

		mediaGeral = media / 4;

		System.out.println("Sua Média foi de: " + mediaGeral);

		if (mediaGeral >= 7) {
			System.out.println("Você foi aprovado.");
		} else {

			Scanner ler = new Scanner(System.in);
			System.out.println("Infelizmente você não passou por média.\n");
			System.out.println("Insira sua nota de recuperação.");

			recupera = ler.nextDouble(); // variavel para ser somada a nova media
			novaMedia = (mediaGeral + recupera); // calculo para verificar se a nova media é maior que 7

			if (novaMedia >= 7) { // novo teste
				System.out.println("Você foi aprovado.");
			} else
				System.out.println("Você foi reprovado.");

		}

	}

}

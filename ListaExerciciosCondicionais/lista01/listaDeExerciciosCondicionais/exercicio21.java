package listaDeExerciciosCondicionais;

import java.util.Scanner;

public class exercicio21 {

	public static void main(String[] args) {

		int a = 0;
		int escolha = 1;

		while (escolha != 2) {
			Scanner ler = new Scanner(System.in);
			System.out.println("Insira um valor ");
			a = ler.nextInt();

			if (a < 0) {
				System.out.println("O numero é negativo.");
			} else {
				System.out.println("O numero é positivo.");
			}

			Scanner leitura = new Scanner(System.in);
			System.out.println("Deseja verificar outro numero? Digite (1 para sim) ou (2 para não) ");

			escolha = leitura.nextInt();
			if (escolha != 1) {
				break;

			}

		}
			
	}

}

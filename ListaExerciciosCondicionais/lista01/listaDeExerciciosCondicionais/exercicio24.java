package listaDeExerciciosCondicionais;

import java.util.Scanner;

public class exercicio24 {

	public static void main(String[] args) {

		int n1, n2, x = 0, media, resposta;
		System.out.println("Insira 2 numeros inteiros: ");
		Scanner input = new Scanner(System.in);
		n1 = input.nextInt();
		n2 = input.nextInt();

		System.out.println("Escolha uma opção: ");
		System.out.println("1 - Verificar se um dos números lidos é ou não múltiplo do outro");
		System.out.println("2 - Verificar se os dois números lidos são pares");
		System.out.println("3 - Verificar se a média dos dois números é maior ou igual a 7");
		System.out.println("4 - sair");

		x = input.nextInt();

		switch (x) {
		case 1:
			resposta = (n1 / n2) * n2;
			if (resposta == n1) {
				System.out.println("Os números são múltiplos!");
			} else {
				System.out.println("Os números não são múltiplos");
			}
			break;
		case 2:
			if (n1 % 2 == 0 && n2 % 2 == 0) {
				System.out.println("Os dois numeros são pares");
			} else {
				System.out.println("Os dois numeros não são pares");
			}
			break;
		case 3:
			media = (n1 + n2) / 2;

			if (media > 7) {
				System.out.println("A media " + media + " é maior que 7");
			} else if (media == 7) {
				System.out.println("A media " + media + " é igual a 7");
			} else {
				System.out.println("A media " + media + " é menor que 7");
			}
			break;
		case 4:
			System.out.println("Até a proxima!");
			break;
		default:
			System.out.println("Opção invalida");
		}

		input.close();
	}

}

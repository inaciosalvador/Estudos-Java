package listaDeExerciciosCondicionais;

import java.util.Scanner;

public class exercicio24 {

	public static void main(String[] args) {

		int n1, n2, x = 0, media, resposta;
		System.out.println("Insira 2 numeros inteiros: ");
		Scanner input = new Scanner(System.in);
		n1 = input.nextInt();
		n2 = input.nextInt();

		System.out.println("Escolha uma op��o: ");
		System.out.println("1 - Verificar se um dos n�meros lidos � ou n�o m�ltiplo do outro");
		System.out.println("2 - Verificar se os dois n�meros lidos s�o pares");
		System.out.println("3 - Verificar se a m�dia dos dois n�meros � maior ou igual a 7");
		System.out.println("4 - sair");

		x = input.nextInt();

		switch (x) {
		case 1:
			resposta = (n1 / n2) * n2;
			if (resposta == n1) {
				System.out.println("Os n�meros s�o m�ltiplos!");
			} else {
				System.out.println("Os n�meros n�o s�o m�ltiplos");
			}
			break;
		case 2:
			if (n1 % 2 == 0 && n2 % 2 == 0) {
				System.out.println("Os dois numeros s�o pares");
			} else {
				System.out.println("Os dois numeros n�o s�o pares");
			}
			break;
		case 3:
			media = (n1 + n2) / 2;

			if (media > 7) {
				System.out.println("A media " + media + " � maior que 7");
			} else if (media == 7) {
				System.out.println("A media " + media + " � igual a 7");
			} else {
				System.out.println("A media " + media + " � menor que 7");
			}
			break;
		case 4:
			System.out.println("At� a proxima!");
			break;
		default:
			System.out.println("Op��o invalida");
		}

		input.close();
	}

}

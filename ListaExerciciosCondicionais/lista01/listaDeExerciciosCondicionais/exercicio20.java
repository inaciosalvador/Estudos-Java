package listaDeExerciciosCondicionais;

import java.util.Scanner;

public class exercicio20 {

	public static void main(String[] args) {
		int contador = 1;
		double resultUm = 0, valor = 0, resultDois = 0, maior = 0, menor = 0;

		while (contador <= 3) { // o loop foi criado para ser inserido 3 valores.

			Scanner ler = new Scanner(System.in);
			System.out.println("Digite o " + contador + "� valor ");
			valor = ler.nextInt();

			if (valor <= 0) {
				System.out.println("Insira um valor maior que zero: ");
				contador = contador - 1;

			}

			if (contador == 1) { // menor e maior foi inicializado comum 1 para obter um valor

				menor = valor;
				maior = valor;
			}

			if (valor > maior) { // aqui ele testa os valores maiores
				maior = valor;

			} else if (valor < menor && valor > 0) { // aqui ele testa os menores
				menor = valor;
			}

			contador++; // aqui ele incrementa o contador
			ler.close();
		}

		resultUm = (menor * maior); // aqui ele realiza a primeira opera��o
		resultDois = (maior / menor); // e aqui a segunda opera��o

		System.out.println("O maior �:" + maior);
		System.out.println("O menor �:" + menor);

		System.out.println("O menor multiplicado pelo maior �: " + resultUm);
		System.out.println("O maior dividido pelo menor �: " + resultDois);
		
	
	}
	
}

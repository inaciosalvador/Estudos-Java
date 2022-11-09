
/*Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os valores
lidos, baseando-se na utilização do conceito de propriedade distributiva. Dica: se forem lidas as variáveis A, B, C e
D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B com D e por
último C com D. Note que para cada operação serão utilizadas seis combinações. Assim sendo, devem ser
realizadas doze operações de processamento, sendo seis para as adições e seis para as multiplicações.*/

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {

		int a, b, c, d;

		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite 4 valores para somar e multiplicar entre si: ");

		a = leitura.nextInt();
		b = leitura.nextInt();
		c = leitura.nextInt();
		d = leitura.nextInt();

		System.out.println("A soma de A com B é: " + (a + b));
		System.out.println("A multiplicacao de A com B é:" + (a * b));
		System.out.println();

		System.out.println("A soma de A com C é: " + (a + c));
		System.out.println("A multiplicacao de A com c é:" + (a * c));
		System.out.println();

		System.out.println("A soma de A com D é:" + (a + d));
		System.out.println("A multiplicacao de A com D é:" + (a * d));
		System.out.println();

		System.out.println("A soma de B com C é: " + (b + c));
		System.out.println("A multiplicacao de B com C é : " + (b * c));
		System.out.println();

		System.out.println("A soma de B com D é:" + (b + d));
		System.out.println("A multiplicacao de B com D é: " + (b * d));
		System.out.println();

		System.out.println("A soma de C com D é: " + (c + d));
		System.out.println("A multiplicacao de C com D é: " + (c * d));
		System.out.println();

	}

}

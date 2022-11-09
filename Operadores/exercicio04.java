
/*Ler quatro valores num�ricos inteiros e apresentar o resultado dois a dois da adi��o e multiplica��o entre os valores
lidos, baseando-se na utiliza��o do conceito de propriedade distributiva. Dica: se forem lidas as vari�veis A, B, C e
D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B com D e por
�ltimo C com D. Note que para cada opera��o ser�o utilizadas seis combina��es. Assim sendo, devem ser
realizadas doze opera��es de processamento, sendo seis para as adi��es e seis para as multiplica��es.*/

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

		System.out.println("A soma de A com B �: " + (a + b));
		System.out.println("A multiplicacao de A com B �:" + (a * b));
		System.out.println();

		System.out.println("A soma de A com C �: " + (a + c));
		System.out.println("A multiplicacao de A com c �:" + (a * c));
		System.out.println();

		System.out.println("A soma de A com D �:" + (a + d));
		System.out.println("A multiplicacao de A com D �:" + (a * d));
		System.out.println();

		System.out.println("A soma de B com C �: " + (b + c));
		System.out.println("A multiplicacao de B com C � : " + (b * c));
		System.out.println();

		System.out.println("A soma de B com D �:" + (b + d));
		System.out.println("A multiplicacao de B com D �: " + (b * d));
		System.out.println();

		System.out.println("A soma de C com D �: " + (c + d));
		System.out.println("A multiplicacao de C com D �: " + (c * d));
		System.out.println();

	}

}

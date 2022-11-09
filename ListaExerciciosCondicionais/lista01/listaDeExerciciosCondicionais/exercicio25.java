package listaDeExerciciosCondicionais;

import java.util.*;

public class exercicio25 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double altura, resultado;
		int sexo;

		System.out.println("Digite sua altura: ");
		altura = input.nextDouble();

		System.out.println("Informe seu sexo: \n 1-Masculino \n 2-Feminino ");
		sexo = input.nextInt();

		switch (sexo) {

		case 1:

			resultado = (72.7 * altura) - 58;
			System.out.printf("Seu peso ideal é: " + resultado);
			break;

		case 2:

			resultado = (62.1 * altura) - 47.7;
			System.out.printf("Seu peso ideal é: " + resultado);
			break;

		default:
			System.out.println("O preenchimento do campo ( SEXO ) foi incorreto!");
		}
		input.close();
	}
}
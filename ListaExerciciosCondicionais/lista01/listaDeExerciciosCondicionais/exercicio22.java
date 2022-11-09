package listaDeExerciciosCondicionais;

import java.util.Scanner;

public class exercicio22 {

	public static void main(String[] args) {

		double a = 0, b = 0, x = 0;

		Scanner ler = new Scanner(System.in);

		System.out.println("Insira um valor: ");
		x = ler.nextDouble();
		
		if (x > 0) { //Condição para testar se é maior que zero
			a = x;
			System.out.println("O valor " + x + " foi armazenado na variavel A");
		} else if (x == 0) { // Como não havia condição explicita pra quando o valor fosse igual a zero nada foi feito
			System.out.println("A valor inserido não foi salvo em nenhum lugar.");
		} else { // Aqui o valor será armazenado em B como solicitado na questão
			b = x;
			System.out.println("O valor " + x + " foi armazenado na variavel B");
		}
		ler.close();
	}

}

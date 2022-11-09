/*Faça um programa que:
- Leia a cotação do dólar
- Leia um valor em dólares
- Converta esse valor para Real
- Mostre o resultado*/

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {

		Scanner ex = new Scanner(System.in);
		double dolar = 5.21;
		System.out.println("Insira a quantidade de dolar a ser convertido: ");
		double qtdolar = ex.nextFloat();
		double result = qtdolar * dolar;
		System.out.println("O valor em real é: R$" + result);

	}

}
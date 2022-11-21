/*Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e imposto).
 * 
 *  Emseguida, mostrar os dados do funcion�rio (nome e sal�rio l�quido).
 *  
 *  Em seguida, aumentar o sal�rio do funcion�rio com base em uma porcentagem dada (somente o sal�rio bruto �
afetado pela porcentagem) e mostrar novamente os dados do funcion�rio.*/

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();

		System.out.print("Name: ");
		funcionario.name = input.next();
		System.out.print("Gross salary: ");
		funcionario.grossSalary = input.nextDouble();
		System.out.println("Tax: ");
		funcionario.tax = input.nextDouble();

		System.out.println("Employee: " + funcionario.name + ", $ " + funcionario.NetSalary());
		System.out.println("Which percentage to increase salary? ");

		double increase = input.nextDouble();

		System.out.println("Updated data: " + funcionario.name + ", $ " + funcionario.increaSalary(increase));

		input.close();
	}

}

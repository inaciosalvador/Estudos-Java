package application;

import java.util.Scanner;

import entities.Retangulo;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();

		System.out.print("Enter rectangle width and height: ");
		retangulo.width = sc.nextDouble();
		retangulo.heigth = sc.nextDouble();

		
		System.out.println("AREA = " + retangulo.area());
		System.out.println("PERIMETER = " + retangulo.perimetro());
		System.out.println("DIAGONAL =  " + retangulo.diagonal());

		sc.close();

	}

}

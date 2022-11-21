/*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema.
*/package main;

import java.util.Scanner;

import entities.Students;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Students student = new Students();

		System.out.println("Insira seu nome, 1�, 2� e 3� nota: ");
		student.nome = input.next();
		student.n1 = input.nextDouble();
		student.n2 = input.nextDouble();
		student.n3 = input.nextDouble();

		if (student.finalGrade() > 60) {

			System.out.println("FINAL GRADE: " + student.finalGrade() + "\nPASS");

		} else {

			System.out.println("FINAL GRADE: " + student.finalGrade() + "\nFAILED");
			System.out.println("MISSING: " + (60 - student.finalGrade() + " POINTS"));

		}

		input.close();

	}

}

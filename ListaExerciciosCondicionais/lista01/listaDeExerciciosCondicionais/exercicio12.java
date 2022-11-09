package listaDeExerciciosCondicionais;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		
		int a;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Olá! Digite um numero: ");
		
		a = ler.nextInt();
		
		if (a>=0) {
			System.out.println("O modulo de " + a + " é: " +a);
		} else {
			a = a* (-1);
			System.out.println(" o modulo de "+ a + "é: " +a);
		}

	}

}

/*Fa�a um programa que gera e escreve os n�meros �mpares dos n�meros lidos entre 100 e 200.*/
public class exericio28 {

	public static void main(String[] args) {
		int cont;
		for (cont = 100; cont <= 200; cont++) { // contador faz inicia em 100 e termina em 200
			if (cont % 2 == 1) { // Aqui n�s demos a condi��o ao if para imprimir apenas os impares
				System.out.println(cont);
			}
		}
	}
}

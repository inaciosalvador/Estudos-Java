/*Faça um programa que gera e escreve os números ímpares dos números lidos entre 100 e 200.*/
public class exericio28 {

	public static void main(String[] args) {
		int cont;
		for (cont = 100; cont <= 200; cont++) { // contador faz inicia em 100 e termina em 200
			if (cont % 2 == 1) { // Aqui nós demos a condição ao if para imprimir apenas os impares
				System.out.println(cont);
			}
		}
	}
}

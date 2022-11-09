/*Faça um programa para calcular o estoque médio de uma peça, sendo que:
ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.*/

public class Exercicio01 {

	public static void main(String[] args) {

		int qtmaximo = 35, qtminimo = 60;

		int result = (qtmaximo + qtminimo) / 2;

		System.out.println("A media do estoque é: " + result);

	}

}

/*Fa�a um programa para pagamento de comiss�o de vendedores de pe�as, levando-se em considera��o que sua
comiss�o ser� de 5% do total da venda e que voc� tem os seguintes dados:
- Identifica��o do vendedor
- C�digo da pe�a
- Pre�o unit�rio da pe�a
- Quantidade vendida*/

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		int codVendedor;
		int codPeca;
		double preco;
		int qtdPeca;
		double resultVendas;

		Scanner ler = new Scanner(System.in);

		System.out.println("Insira o seu ID: ");
		codVendedor = ler.nextInt();
		System.out.println("Agora insira o codigo da peca:  ");
		codPeca = ler.nextInt();
		System.out.println("Insira o preco da peca:  ");
		preco = ler.nextDouble();
		System.out.println("E por ultimo a quantidade vendida:  ");
		qtdPeca = ler.nextInt();

		resultVendas = qtdPeca * preco;

		System.out.println("Ol� " + codVendedor + ". Voce vendeu R$" + resultVendas + ", e sua comiss�o � de: R$ "
				+ (resultVendas / 100) * 0.05);

	}

}

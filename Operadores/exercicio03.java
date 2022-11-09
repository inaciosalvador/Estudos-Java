/*Faça um programa para pagamento de comissão de vendedores de peças, levando-se em consideração que sua
comissão será de 5% do total da venda e que você tem os seguintes dados:
- Identificação do vendedor
- Código da peça
- Preço unitário da peça
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

		System.out.println("Olá " + codVendedor + ". Voce vendeu R$" + resultVendas + ", e sua comissão é de: R$ "
				+ (resultVendas / 100) * 0.05);

	}

}

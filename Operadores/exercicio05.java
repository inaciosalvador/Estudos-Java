/*Efetuar o c�lculo da quantidade de litros de combust�vel gasta em uma viagem, utilizando um autom�vel que faz 12
Km por litro. Para obter o c�lculo, o usu�rio deve fornecer o tempo gasto na viagem e a velocidade m�dia. Desta
forma, ser� poss�vel obter a dist�ncia percorrida com a f�rmula DISTANCIA = TEMPO * VELOCIDADE. Tendo o
valor da dist�ncia, basta calcular a quantidade de litros de combust�vel utilizada na viagem com a f�rmula:
LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade m�dia, tempo gasto,
a dist�ncia percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.*/

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
	    double tempo,distancia,litrosUsados;
	    int velocidade;
	    
		System.out.println("Ol�, este sistema ir� calcular a quantidade de litros gasto na viagem.");
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o tempo gasto na viagem e sua velocidade media: ");
		tempo = entrada.nextDouble();
		velocidade = entrada.nextInt();
		
		 distancia = tempo*velocidade;
		 litrosUsados = distancia/12;
		 
		 System.out.println("A sua velocidade m�dia foi de: " + velocidade);
		 System.out.println("O tempo gasto informado foi de: " + tempo);
		 System.out.println("A distancia percorrida foi de: " + distancia + "km.");
		 System.out.printf("E a quantidade de combustivel consumida foi de:%.2f litros",litrosUsados);
		
		 entrada.close();
	}

}

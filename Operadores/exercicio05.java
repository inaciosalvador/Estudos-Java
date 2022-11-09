/*Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12
Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média. Desta
forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE. Tendo o
valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula:
LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média, tempo gasto,
a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.*/

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
	    double tempo,distancia,litrosUsados;
	    int velocidade;
	    
		System.out.println("Olá, este sistema irá calcular a quantidade de litros gasto na viagem.");
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o tempo gasto na viagem e sua velocidade media: ");
		tempo = entrada.nextDouble();
		velocidade = entrada.nextInt();
		
		 distancia = tempo*velocidade;
		 litrosUsados = distancia/12;
		 
		 System.out.println("A sua velocidade média foi de: " + velocidade);
		 System.out.println("O tempo gasto informado foi de: " + tempo);
		 System.out.println("A distancia percorrida foi de: " + distancia + "km.");
		 System.out.printf("E a quantidade de combustivel consumida foi de:%.2f litros",litrosUsados);
		
		 entrada.close();
	}

}

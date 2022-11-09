package listaDeExerciciosCondicionais;

import java.util.Scanner;

public class exercicio18 {

	public static void main(String[] args) {
		 int codigo;
		    
		    Scanner input = new Scanner(System.in);
		    
		    System.out.println("Escolha uma opção: (1) (2) (3) ");
		    codigo = input.nextInt();
		    
		    switch(codigo) {
	    case 1:
	        System.out.println("Um");
	    break;
	    case 2:
	        System.out.println("Dois");
	    break;
	    case 3:
	        System.out.println("Três");
	    break;
	    default:
	        System.out.println("Valor invalido");    
	    
	    
		    }

	}

}

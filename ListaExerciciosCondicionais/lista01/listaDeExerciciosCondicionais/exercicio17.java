package listaDeExerciciosCondicionais;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		 int x;
		    
		    Scanner input = new Scanner(System.in);
		    
		    System.out.println("Insira um valor inteiro: ");
		    x = input.nextInt();
		    
		    if (x>=0 && x<10){
		        System.out.println("Valor válido");
		    } else {
		        System.out.println("Valor invalido");
		        
		    }
		    
	}

}

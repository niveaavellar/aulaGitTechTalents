package exercicios.ex12;

import java.util.Scanner;

public class DiaDaSemana {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um n�mero de 1 a 7");
		int numero = in.nextInt();
		
		switch (numero) {
		case 1: 
			System.out.println(numero + " representa Domingo!");
			break;
		
		case 2: 
			System.out.println(numero + " representa Segunda!");
			break;
		
		case 3: 
			System.out.println(numero + " representa Ter�a!");
			break;
			
		case 4: 
			System.out.println(numero + " representa Quarta!");
			break;
			
		case 5: 
			System.out.println(numero + " representa Quinta!");
			break;
				
		case 6: 
			System.out.println(numero + " representa Sexta!");
			break;
			
		case 7: 
			System.out.println(numero + " representa S�bado!");
			break;
		
		default:
		System.out.println("Ops! O n�mero que voc� digitou � inv�lido!");
		break;
		}
		
	}
	
	

}

package exercicios.ex14;

import java.util.Scanner;

public class EhPrimo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um n�mero de 2 digitos.");
		int numero = in.nextInt();
		
		String s = Integer.toString(numero);
		int numDeDigitos = s.length();
		
		if(numDeDigitos>2) {
			System.out.println("Eu disse dois d�gitos! Ajuda� xD");
		}else {
		
			if(numero % 2 == 0 || numero % 3 == 0 || numero % 5 == 0 || numero % 7 == 0) {
				System.out.println(numero + " n�o � n�mero primo!");
			}else {
				System.out.println(numero + " � n�mero primo!");
			}
		}
	}

}

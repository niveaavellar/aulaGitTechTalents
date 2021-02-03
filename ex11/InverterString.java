package exercicios.ex11;

import java.util.Scanner;

public class InverterString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite uma palavra");
		String palavra = in.next();
		
		char arvalap[] = new char[palavra.length()];
		
		int x = 0;
		for(int i = palavra.length()-1; i>=0; i-- ) {
			
			arvalap[x] = palavra.charAt(i);
			x++;
			
		}
		
		String str = new String(arvalap);
		
		System.out.println("A palavra " + palavra + " invertida é " + str);
		
	}

}

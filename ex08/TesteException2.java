package exercicios.ex08;

import java.util.Scanner;

public class TesteException2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Eu sei dividir!");
		System.out.println("Informe o primeiro valor: ");
		int x = teclado.nextInt();
		System.out.println("Informe o segundo valor: ");
		int y = teclado.nextInt();
		try {
		double r = (x/y);
		}
		catch (ArithmeticException e) {
			while (y==0) {
				System.out.println("N„„„o! Voce n„o pode dividir por zero! Digite outro segundo valor!");
			y = teclado.nextInt();
			}
			
			
		}
		
		System.out.println("O resultado da divis„o È " + x/y);
	}

}
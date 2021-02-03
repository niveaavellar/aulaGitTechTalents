package exercicios.ex15;

//	MANO! Isso não funciona ç_ç
//	este código apenas estava tentando transformar oque o usuário digitasse
//	em uma array de inteiros sem o ; ou seja, era só pra dar uma de excel, texto para colunas
//	e só depois eu ia organizar com a seguinte ideia:
//		if(maior<numero){
//	        maior = numero;
//	      }
//	      if(menor>numero){
//	        menor = numero;
//	      }
//	Mas como nem deu pra chegar a isso, deixa quieto *sons de violinos e chuva caindo*
		

import java.util.ArrayList;
import java.util.Scanner;

public class BonusLoucao {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite varios números inteiros divididos por vírgula");
		String entrada = in.next();
		ArrayList<Character> arrayDeTratamento1;
		arrayDeTratamento1 = new ArrayList<>();
		ArrayList<Character> arrayDeTratamento2;
		arrayDeTratamento2 = new ArrayList<>();
		ArrayList<Character> arrayVazia;
		arrayVazia = new ArrayList<>();
		ArrayList<Integer> arrayFinal;
		arrayFinal = new ArrayList<>();
		
		String a = ";";
		
		
		
		
		int contador = 0;
		
		for (int i = 0; i < entrada.length(); i++) {
			if(entrada.charAt(i) == a.charAt(0)) {
				
				contador++;

			}
		}
				
		int contador1 = 0;
		while(contador1<contador) {
		
			for (int i = 0; i < entrada.length(); i++) {
				if(entrada.charAt(i) != a.charAt(0)) {
					arrayDeTratamento1.add(entrada.charAt(i));
					
					
					
				}else {
					for (int j = i; j < entrada.length()-1; j++) {
						arrayDeTratamento2.add(entrada.charAt(j+1));
					}
					break;
				}
			}
			
			char arrayListPraArray[]=new char[arrayDeTratamento1.size()];
			for (int i = 0; i < arrayListPraArray.length; i++) {
				arrayListPraArray[i]=arrayDeTratamento1.get(i);
			}
			String str = new String(arrayListPraArray);
			
			int x = Integer.parseInt(str);
			arrayFinal.add(x);
			
			char arrayListPraEntrada[]=new char[arrayDeTratamento2.size()];
			for (int i = 0; i < arrayListPraEntrada.length; i++) {
				arrayListPraEntrada[i]=arrayDeTratamento2.get(i);
			}

			String socorro = new String(arrayListPraEntrada);
			
			entrada = socorro;
			arrayDeTratamento1 = arrayVazia;
			arrayDeTratamento2 = arrayVazia;
			
			
			contador1++;
		}
			
			
			
		


		System.out.println(arrayFinal);
//		System.out.println(arrayDeTratamento1);
	}

}
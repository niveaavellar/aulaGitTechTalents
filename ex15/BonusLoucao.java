package exercicios.ex15;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class BonusLoucao {
	
	public static void main(String[] args) {


		Scanner in = new Scanner(System.in);

		System.out.println("Digite os números separados por ;");

		String numeros = in.next();

		
		String[] numerosArray = numeros.split(";");

		List<String> numerosLista = Arrays.asList(numerosArray);


		List<Integer> numerosListaInteger = new ArrayList<Integer>();


		for (String numeroStr : numerosLista) {

			numerosListaInteger.add(Integer.valueOf(numeroStr));

		}

		in.close();
		
		
		
		
		
		
//		Minha SuperTentativa que parecia SuperLinda mas falhou miseravelmete
//
//		int numeroAuxiliar=numerosListaInteger.get(0);
//		int resultado[] = new int[numerosListaInteger.size()];
//		int posicaoNoResultado = 0;
//		int tamanhoInicial = numerosListaInteger.size();
//		
//		while(posicaoNoResultado<tamanhoInicial) {
//			//dentro deste while, vou tirar item por item da array numerosListaInteger
//			//até nao sobrar nada!
//		
//
//		//pra pegar o menor número da array
//		for (int i = 0; i < numerosListaInteger.size(); i++) {
//			if (numerosListaInteger.get(i)<numeroAuxiliar) {
//				numeroAuxiliar = numerosListaInteger.get(i);
//			}
//		}
//		//pra excluir o menor numero da array (não quero mais ele)
//		for (int j = 0; j < numerosListaInteger.size(); j++) {
//			if (numerosListaInteger.get(j)==numeroAuxiliar) {
//				numerosListaInteger.remove(numerosListaInteger.get(j));
//		//não ta excluindo!! porque não??
//			}
//		}
//		//e o tal numero removido, menor da array, vai pra primeira posição no resultado!
//		resultado[posicaoNoResultado]=numeroAuxiliar;
//		
//		posicaoNoResultado++;
//
//		
//		}
//		
//		
//		for(int i=0; i<resultado.length; i++) {
//			System.out.println(resultado[i]);
//		}
		
		
		int resultado[] = new int[numerosListaInteger.size()];
		for(int i =0; i< numerosListaInteger.size(); i++) {
			resultado[i] = numerosListaInteger.get(i);
		}
		
//		System.out.println(Arrays.toString(resultado));
		
		int posicaoMenorNumero = 0;
		int tamanho = resultado.length;
		
		int i = 0;
		while (i<tamanho) {
			for (int j = i+1; j < resultado.length; j++) {
				if(resultado[j] < resultado[posicaoMenorNumero]) {
					posicaoMenorNumero = j;
				}
				
			}
			int aux = resultado[i];
			resultado[i] = resultado[posicaoMenorNumero];
			resultado[posicaoMenorNumero] = aux;

			i++;
			posicaoMenorNumero = i;
			
		}

		System.out.println(Arrays.toString(resultado));

	}

	


}

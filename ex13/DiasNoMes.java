package exercicios.ex13;

import java.util.Scanner;

public class DiasNoMes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o mes em n�mero: ");
		int mes = in.nextInt();
		System.out.println("Digite o ano: ");
		int ano = in.nextInt();
		
		switch (mes) {
		case 1: 
			System.out.println(mes + " � Janeiro, ele tem 31 dias!");
			break;
		
		case 2: 
			if(ano % 4 == 0) {
				System.out.println(mes + " � Fevereiro, em " + ano + " este mes teve 29 dias (foi ano bissexto)!");
			}else {
				System.out.println(mes + " � Fevereiro, em " + ano + " este mes teve 28 dias!");
			}
			break;
		
		case 3: 
			System.out.println(mes + " � Mar�o, ele tem 31 dias!");
			break;
			
		case 4: 
			System.out.println(mes + " � Abril, ele tem 30 dias!");
			break;
			
		case 5: 
			System.out.println(mes + " � Maio, ele tem 31 dias!");
			break;
				
		case 6: 
			System.out.println(mes + " � Junho, ele tem 30 dias!");
			break;
			
		case 7: 
			System.out.println(mes + " � Julho, ele tem 31 dias!");
			break;
			
		case 8: 
			System.out.println(mes + " � Agosto, ele tem 31 dias!");
			break;
			
		case 9: 
			System.out.println(mes + " � Setembro, ele tem 30 dias!");
			break;
			
		case 10: 
			System.out.println(mes + " � Outubro, ele tem 31 dias!");
			break;
			
		case 11: 
			System.out.println(mes + " � Novembro, ele tem 30 dias!");
			break;
			
		case 12: 
			System.out.println(mes + " � Dezembro, ele tem 31 dias!");
			break;
		
		default:
		System.out.println("Ops! O n�mero que voc� digitou n�o corresponde a nenhum m�s!");
		break;
		}
		
	}

}

package exercicios.ex13;

import java.util.Scanner;

public class DiasNoMes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o mes em número: ");
		int mes = in.nextInt();
		System.out.println("Digite o ano: ");
		int ano = in.nextInt();
		
		switch (mes) {
		case 1: 
			System.out.println(mes + " é Janeiro, ele tem 31 dias!");
			break;
		
		case 2: 
			if(ano % 4 == 0) {
				System.out.println(mes + " é Fevereiro, em " + ano + " este mes teve 29 dias (foi ano bissexto)!");
			}else {
				System.out.println(mes + " é Fevereiro, em " + ano + " este mes teve 28 dias!");
			}
			break;
		
		case 3: 
			System.out.println(mes + " é Março, ele tem 31 dias!");
			break;
			
		case 4: 
			System.out.println(mes + " é Abril, ele tem 30 dias!");
			break;
			
		case 5: 
			System.out.println(mes + " é Maio, ele tem 31 dias!");
			break;
				
		case 6: 
			System.out.println(mes + " é Junho, ele tem 30 dias!");
			break;
			
		case 7: 
			System.out.println(mes + " é Julho, ele tem 31 dias!");
			break;
			
		case 8: 
			System.out.println(mes + " é Agosto, ele tem 31 dias!");
			break;
			
		case 9: 
			System.out.println(mes + " é Setembro, ele tem 30 dias!");
			break;
			
		case 10: 
			System.out.println(mes + " é Outubro, ele tem 31 dias!");
			break;
			
		case 11: 
			System.out.println(mes + " é Novembro, ele tem 30 dias!");
			break;
			
		case 12: 
			System.out.println(mes + " é Dezembro, ele tem 31 dias!");
			break;
		
		default:
		System.out.println("Ops! O número que você digitou não corresponde a nenhum mês!");
		break;
		}
		
	}

}

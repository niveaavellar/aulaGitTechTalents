package exercicios.ex10;

import java.util.Scanner;

public class Calculadora {
	  public static void main(String[] args) {

		    
		    double resultado = 0;
		    int exit = 1;
		    Scanner in = new Scanner(System.in);
		    int operacao = 10;

		    while(exit == 1){

		      System.out.println("Qual operação matemática você quer fazer? 1 - soma; 2 - subtração; 3 - divisão; 4 - multiplicação; 5 - potência; 0 - sair");

		      operacao = in.nextInt();
		      System.out.println("Digite o primeiro número da conta: ");
		      int primeiroNumero = in.nextInt();
		      System.out.println("Digite o segundo número da conta: ");
		      int segundoNumero = in.nextInt();

		      switch(operacao){
		        case 1:
		        resultado = primeiroNumero+segundoNumero;
		        System.out.println(resultado);
		        System.out.println("Digite 1 para continuar; Digite 0 para sair.");
		        exit = in.nextInt();
		        break;
		        case 2:
		        resultado = primeiroNumero-segundoNumero;
		        System.out.println(resultado);
		        System.out.println("Digite 1 para continuar; Digite 0 para sair.");
		        exit = in.nextInt();
		        break;
		        case 3:
		        if (segundoNumero == 0) {
		        	System.out.println("Não pode dividir por zero! Senão o mundo explode!");
		        }else {
		        resultado = primeiroNumero/(double)segundoNumero;
		        System.out.println(resultado);
		        	}
		        System.out.println("Digite 1 para continuar; Digite 0 para sair.");
		        exit = in.nextInt();
		        break;
		        case 4:
		        resultado = primeiroNumero*segundoNumero;
		        System.out.println(resultado);
		        System.out.println("Digite 1 para continuar; Digite 0 para sair.");
		        exit = in.nextInt();
		        break;
		        case 5:
		        resultado=1;
		        for(int i = 0; i<segundoNumero; i++) {
		        	resultado = resultado * primeiroNumero;
		        }		        
		        
		        System.out.println(primeiroNumero + " elevado a " + segundoNumero + " é " + resultado);
		        System.out.println("Digite 1 para continuar; Digite 0 para sair.");
		        exit = in.nextInt();
		        break;
		        default:
		        	System.out.println("Operação inválida.");
		        	System.out.println("Digite 1 para continuar; Digite 0 para sair.");
			        exit = in.nextInt();
		        break;
		            
		      }
		    }
		    
		    in.close();

	}

}

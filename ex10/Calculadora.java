package exercicios.ex10;

import java.util.Scanner;

public class Calculadora {
	  public static void main(String[] args) {

		    
		    double resultado = 0;
		    int exit = 1;
		    Scanner in = new Scanner(System.in);
		    int operacao = 10;

		    while(exit == 1){

		      System.out.println("Qual opera��o matem�tica voc� quer fazer? 1 - soma; 2 - subtra��o; 3 - divis�o; 4 - multiplica��o; 5 - pot�ncia; 0 - sair");

		      operacao = in.nextInt();
		      System.out.println("Digite o primeiro n�mero da conta: ");
		      int primeiroNumero = in.nextInt();
		      System.out.println("Digite o segundo n�mero da conta: ");
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
		        	System.out.println("N�o pode dividir por zero! Sen�o o mundo explode!");
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
		        
		        System.out.println(primeiroNumero + " elevado a " + segundoNumero + " � " + resultado);
		        System.out.println("Digite 1 para continuar; Digite 0 para sair.");
		        exit = in.nextInt();
		        break;
		        default:
		        	System.out.println("Opera��o inv�lida.");
		        	System.out.println("Digite 1 para continuar; Digite 0 para sair.");
			        exit = in.nextInt();
		        break;
		            
		      }
		    }
		    
		    in.close();

	}

}

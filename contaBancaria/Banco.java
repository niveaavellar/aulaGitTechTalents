package exercicios.contaBancaria;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;


public class Banco {
	
	String senhaGerente = "1234"; //super segura a senha, parab�ns 
	String nomeDoBanco = "Alternative Bank";
		
	public ContaBancaria adicionarConta() {

		Random random = new Random();

		ContaBancaria contaBancaria = null;
		

		//Scanner sc = new Scanner(System.in);
		Scanner sc = Main.sc;

		int numeroAgencia = 3552;

		System.out.println("Informe o tipo de conta [1-Conta Corrente] [2-Conta Poupan�a] : ");
		int tipoConta = sc.nextInt();

		switch (tipoConta) {
		case 1:

			ContaCorrente contaCorrente = new ContaCorrente();

			contaCorrente.setTipoConta("Conta Corrente");
			contaCorrente.setAgencia(numeroAgencia);

			System.out.println("Digite o seu nome: ");
			contaCorrente.setCliente(sc.next());

			contaCorrente.setNumero(random.ints(1000, 9999).findFirst().getAsInt());

			contaCorrente.setData(LocalDate.now().getDayOfMonth() + "/" + LocalDate.now().getMonth() + "/"
					+ LocalDate.now().getYear());

			System.out.println("Digite saldo inicial: ");
			contaCorrente.setSaldo(sc.nextDouble());

			System.out.println("Digite o limite: ");
			contaCorrente.setLimite(sc.nextDouble());
			
			System.out.println("Saldo atual: " + contaCorrente.getSaldo());

			contaBancaria = contaCorrente;
			break;

		case 2:

			ContaPoupanca contaPoupanca = new ContaPoupanca();

			contaPoupanca.setTipoConta("Conta Poupan�a");
			contaPoupanca.setAgencia(numeroAgencia);

			System.out.println("Digite o seu nome: ");
			contaPoupanca.setCliente(sc.next());

			contaPoupanca.setNumero((random.ints(1000, 9999).findFirst().getAsInt()));

			contaPoupanca.setData(LocalDate.now().getDayOfMonth() + "/" + LocalDate.now().getMonth() + "/"
					+ LocalDate.now().getYear());

			System.out.println("Digite saldo inicial: ");
			contaPoupanca.setSaldo(sc.nextDouble());

			System.out.println("Informe o total de dias de Rendimento: ");
			contaPoupanca.setDiaRendimento(sc.nextInt());
			
			contaPoupanca.calcularNovoSaldo();

			contaBancaria = contaPoupanca;
			break;

		default:
			System.out.println("Tipo de Conta Inexistente.");

		}

		//sc.close();
		return contaBancaria;
		

	}

	public void exibirMenu(ContaBancaria conta) {
		
		Scanner in = Main.sc;
		int opcao;
			
		do {
			
			System.out.println("Menu Conta Banc�ria");
			System.out.println("[1]-Listar Extrato");
			System.out.println("[2]-Efetuar Saque");
			System.out.println("[3]-Efetuar Dep�sito");
			System.out.println("[4]-Adicionar Limite Cheque Especial");
			System.out.println("[5]-Encerrar Conta");
			System.out.println("[0]-Sair");
			System.out.println("");
			
			opcao = in.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("Saldo atual: " + conta.getSaldo());
				if (!conta.listaDeTransacoes.isEmpty()) {
					System.out.println("Transa��es efetuadas nesta conta:");
					for(String transacao : conta.listaDeTransacoes) {
					System.out.println(transacao);
		
					}
				}else {
					System.out.println("Ainda n�o foi feita nenhuma transa��o nesta conta.");
				}
				
				break;
			case 2:			
				System.out.println("Digite o valor do saque: ");
				conta.sacar(in.nextDouble());
				break;
			case 3:				
				System.out.println("Digite o valor do dep�sito: ");
				conta.depositar(in.nextDouble());
				break;
			case 4:
				Scanner sc = Main.sc;
				if (conta.tipoConta == "Conta Corrente") {
					System.out.println("Digite a senha para efetuar esta opera��o");
					String senha = sc.next();
					if(senha.equals(senhaGerente)) {
						System.out.println("Digite novo limite da conta");
						double novoLimite = sc.nextDouble();
	 					conta.setLimite(novoLimite);  
					}else {
						System.out.println("Senha incorreta!");
					}

				}else {
					System.out.println("Menu inv�lido para Conta Poupan�a");
				}
				break;
			case 5:
				
				Scanner sc5 = Main.sc;
				if (conta.getSaldo() == 0) {
					System.out.println("Digite a senha para efetuar esta opera��o");
					String senha = sc5.next();
					if(senha.equals(senhaGerente)) {
						System.out.println("Conta encerrada!");
						opcao = 0;
					}else {
						System.out.println("Senha incorreta!");
					}

				}else {
					System.out.println("O saldo desta conta � " + conta.getSaldo() + " e, portanto, n�o pode ser encerrada. O saldo deve ser 0 para prosseguir com o encerramento.");
				}
				
				break;
			case 0:
				System.out.println("Sistema sendo encerrado...");
				break;
			}

			
		} while (opcao != 0);	

		
	}

}

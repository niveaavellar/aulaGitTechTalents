package exercicios.contaBancaria;


public class ContaCorrente extends ContaBancaria {

	private double limite;
	private double taxa = 0.03;

//	public ContaCorrente() {
//		this.limite = limite;
//		this.taxa = taxa;
//	}
@Override
	public void sacar(double valor) {
		if (valor > this.saldo+limite) {
			System.out.println("Saldo insuficiente para realizar o saque");
		} else {
			this.saldo = this.saldo - valor;
			System.out.println("O saldo dispon�vel �: " + this.saldo);
			if (this.saldo < 0) {
				System.err.println("Voc� est� usando cheque especial!");
			}
			listaDeTransacoes.add("Saque no valor de " + valor);
		}
	}
	
	public double getLimite() {
		return limite;
	}

@Override	
	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

}
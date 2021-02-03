package exercicios.ex03;

public class Pessoa {
	
	private String nome;
	private Universidade universidade;
	private String dataDeEntrada;
	
	Pessoa (String nome){
		this.nome = nome;
	}

	public void setUniversidade(Universidade universidade) {
		this.universidade = universidade;
	}
	
	public void setDataDeEntrada(String dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
	}
	
	public void informaDados() {
		System.out.println(nome + " trabalha na " + universidade.getNome());
	}
	

}

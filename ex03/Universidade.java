package exercicios.ex03;

public class Universidade {
	
	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void informaNome( ) {
		System.out.println("Esta universidade se chama " + nome);
	}
	

}
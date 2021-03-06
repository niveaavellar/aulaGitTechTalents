package exercicios.ex03;

public class TestaUniversidade {
	public static void main(String[] args) {
		
		Universidade unibiscoito = new Universidade();
		
		unibiscoito.setNome("UniBiscoito");
		unibiscoito.informaNome();
		
		Pessoa Vandercleyson = new Pessoa ("Vandercleyson");
		Vandercleyson.setUniversidade(unibiscoito);
		
		Vandercleyson.informaDados();
	}

}
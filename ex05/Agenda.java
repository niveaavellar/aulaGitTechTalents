package exercicios.ex05;

import java.util.ArrayList;

public class Agenda {
	
	private String nome;
	private ArrayList <Contato>listaDeContatos;
	
	
	public Agenda(String nome) {
		super();
		this.nome = nome;
		this.listaDeContatos = new ArrayList<>();
	}
	
	public void adicionaContato(Contato contato) {
		this.listaDeContatos.add(contato);
	}
	
	public void informacaoDeContato() {
		
		System.out.println("Conteúdo de " + this.nome);
		
		for(Contato contato : listaDeContatos) {
		
			System.out.println("Informações de " + contato.getNome());
			System.out.println("Telefone: " + contato.getTelefone());
			System.out.println("Email: " + contato.getEmail());
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}

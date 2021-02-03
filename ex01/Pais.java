package exercicios.ex01;

import java.util.ArrayList;

public class Pais {
	
	private String codigo;
	private String nome;
	private double populacao;
	private double dimensao;
	public ArrayList<Pais> fronteira;
	

	public Pais(String codigo, String nome, double dimensao) {
		this.codigo = codigo;
		this.nome = nome;
		this.dimensao = dimensao;
		this.fronteira = new ArrayList<>();
	}


	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPopulacao() {
		return populacao;
	}

	public void setPopulacao(double populacao) {
		this.populacao = populacao;
	}

	public double getDimensao() {
		return dimensao;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}
	
	public void comparaPaises (Pais pais) {
		if (this.codigo == pais.getCodigo()) {
			System.out.println("Comparando " + nome + " e " + pais.getNome() + " segundo codigo ISO: Trata-se do mesmo pa�s.");
		}else {
			System.out.println("Comparando " + nome + " e " + pais.getNome() + " segundo codigo ISO: S�o pa�ses diferentes.");
		}
		
	}
	
	public void calculaDensidade() {
		double densidade = populacao/dimensao;
		System.out.println("A densidade populacional de " + nome + " � " + densidade);
	}
	
	public void adicionaFronteira(Pais pais) {
		fronteira.add(pais);
	}
	
	public void ehFronteira(Pais pais) {
		for (int i = 0; i < fronteira.size(); i++) {
			if(fronteira.get(i)==pais) {
				System.out.println(pais.getNome() + " faz fronteira com " + nome);
				break;
			}else {
				System.out.println(pais.getNome() + " n�o faz fronteira com " + nome);
				break;
			}
			
		}
	}
	
	public void minhasFronteiras() {
		System.out.println("Pa�ses que fazem fronteira com " + nome + ": ");
		for (int i = 0; i < fronteira.size(); i++) {
			
			System.out.println(fronteira.get(i).getNome());
		}
			
	}

	

}

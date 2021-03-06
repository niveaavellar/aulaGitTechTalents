package exercicios.ex02;

import java.util.ArrayList;

public class Continente {

	private String nome;
	public ArrayList<Pais> paises;
	
	public Continente(String nome) {
		this.nome = nome;
		this.paises = new ArrayList<>();
	}
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public void adicionaPais(Pais pais) {
		paises.add(pais);
	}
	
	public double calculaDimensao() {
		double dimensao = 0;
		for (int i = 0; i < paises.size(); i++) {
			 dimensao = dimensao + paises.get(i).getDimensao();
		}
		return dimensao;		
	}
	public void imprimeDimensao() {
		System.out.println("A dimens�o total de " + nome + " � " + calculaDimensao());
	}
	
	
	public double calculaPopulacao() {
		double populacao = 0;
		for (int i = 0; i < paises.size(); i++) {
			populacao = populacao + paises.get(i).getPopulacao();
			
		}
		return populacao;
	}
	
	public void imprimePopulacao() {
		System.out.println("A popula��o total de " + nome + " � " + calculaPopulacao());
	}
	
	public void calculaDensidade() {
		double populacao = 0;
		for (int i = 0; i < paises.size(); i++) {
			populacao = populacao + paises.get(i).getPopulacao();
			
		}
		double dimensao = 0;
		for (int i = 0; i < paises.size(); i++) {
			 dimensao = dimensao + paises.get(i).getDimensao();
		}
		double densidade = populacao/dimensao;
		System.out.println("A densidade populacional de " + nome + " � " + densidade);
	}
	
	public void maisPopuloso() {
		double numero = paises.get(0).getPopulacao();
		String paisMaisPopuloso = paises.get(0).getNome();
		for (int i = 1; i < paises.size(); i++) {
			if(paises.get(i).getPopulacao()>numero) {
				numero = paises.get(i).getPopulacao();
				paisMaisPopuloso = paises.get(i).getNome();
			}
			 
		}
		System.out.println("O pa�s mais populoso de " + nome + " � " + paisMaisPopuloso + " com " + numero + " habitantes.");
		
	}
	
	public void menosPopuloso() {
		double numero = paises.get(0).getPopulacao();
		String paisMenosPopuloso = paises.get(0).getNome();
		for (int i = 1; i < paises.size(); i++) {
			if(paises.get(i).getPopulacao()<numero) {
				numero = paises.get(i).getPopulacao();
				paisMenosPopuloso = paises.get(i).getNome();
			}
			 
		}
		System.out.println("O pa�s menos populoso de " + nome + " � " + paisMenosPopuloso + " com " + numero + " habitantes.");
		
	}
	
	public void maiorTerritorio() {
		double dimensaoMaior = paises.get(0).getDimensao();
		String paisMaior = paises.get(0).getNome();
		for (int i = 1; i < paises.size(); i++) {
			if(paises.get(i).getDimensao()>dimensaoMaior) {
				dimensaoMaior = paises.get(i).getDimensao();
				paisMaior = paises.get(i).getNome();
			}
			 
		}
		System.out.println("O pa�s com maior extens�o territorial de " + nome + " � " + paisMaior + " com " + dimensaoMaior + " km�.");
		
	}
	
	
	public void menorTerritorio() {
		double dimensaoMenor = paises.get(0).getDimensao();
		String paisMenor = paises.get(0).getNome();
		for (int i = 1; i < paises.size(); i++) {
			if(paises.get(i).getDimensao()<dimensaoMenor) {
				dimensaoMenor = paises.get(i).getDimensao();
				paisMenor = paises.get(i).getNome();
			}
			 
		}
		System.out.println("O pa�s com menor extens�o territorial de " + nome + " � " + paisMenor + " com " + dimensaoMenor + " km�.");
		
	}
	
	public void razaoTerritorio() {
		double dimensaoMaior = paises.get(0).getDimensao();
		for (int i = 1; i < paises.size(); i++) {
			if(paises.get(i).getDimensao()>dimensaoMaior) {
				dimensaoMaior = paises.get(i).getDimensao();
			}
		}
		double dimensaoMenor = paises.get(0).getDimensao();
		String paisMenor = paises.get(0).getNome();
		for (int i = 1; i < paises.size(); i++) {
			if(paises.get(i).getDimensao()<dimensaoMenor) {
				dimensaoMenor = paises.get(i).getDimensao();
				paisMenor = paises.get(i).getNome();
			}
			 
		}
		
		double razao = dimensaoMaior/dimensaoMenor;
		System.out.println("Calculo da razao entre dimens�o do pais de maior territ�rio e da dimensao do mais de menor territ�rio: " + razao);

		
	}
		


}
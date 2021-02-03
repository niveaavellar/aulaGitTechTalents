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
		System.out.println("A dimensão total de " + nome + " é " + calculaDimensao());
	}
	
	
	public double calculaPopulacao() {
		double populacao = 0;
		for (int i = 0; i < paises.size(); i++) {
			populacao = populacao + paises.get(i).getPopulacao();
			
		}
		return populacao;
	}
	
	public void imprimePopulacao() {
		System.out.println("A população total de " + nome + " é " + calculaPopulacao());
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
		System.out.println("A densidade populacional de " + nome + " é " + densidade);
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
		System.out.println("O país mais populoso de " + nome + " é " + paisMaisPopuloso + " com " + numero + " habitantes.");
		
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
		System.out.println("O país menos populoso de " + nome + " é " + paisMenosPopuloso + " com " + numero + " habitantes.");
		
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
		System.out.println("O país com maior extensão territorial de " + nome + " é " + paisMaior + " com " + dimensaoMaior + " km².");
		
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
		System.out.println("O país com menor extensão territorial de " + nome + " é " + paisMenor + " com " + dimensaoMenor + " km².");
		
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
		System.out.println("Calculo da razao entre dimensão do pais de maior território e da dimensao do mais de menor território: " + razao);

		
	}
		


}
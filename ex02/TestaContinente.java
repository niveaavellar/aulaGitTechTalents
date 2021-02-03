package exercicios.ex02;

public class TestaContinente {
	public static void main(String[] args) {
		Pais brasil = new Pais("BRA", "Brasil", 8516000);
		Pais wakanda = new Pais("WAK", "Wakanda", 4500000);
		Pais dasMaravilhas = new Pais("BRA", "País das Maravilhas", 4500000);
		Pais paraguai = new Pais("PAR", "Paraguai", 406000);
		
		brasil.setPopulacao(500);
		wakanda.setPopulacao(300);
		dasMaravilhas.setPopulacao(22);
		paraguai.setPopulacao(100);
		
		Continente cont1 = new Continente("América do Leste");
		
		cont1.adicionaPais(brasil);
		cont1.adicionaPais(dasMaravilhas);
		cont1.adicionaPais(wakanda);
		cont1.adicionaPais(paraguai);
		
		cont1.calculaDimensao();
		cont1.imprimeDimensao();
		
		cont1.calculaPopulacao();
		cont1.imprimePopulacao();
		
		cont1.calculaDensidade();
		
		cont1.maisPopuloso();
		cont1.menosPopuloso();
		
		cont1.maiorTerritorio();
		cont1.menorTerritorio();
		
		cont1.razaoTerritorio();
		
		
	}
}
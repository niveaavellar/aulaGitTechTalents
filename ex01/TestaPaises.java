package exercicios.ex01;

public class TestaPaises {
	public static void main(String[] args) {
		Pais brasil = new Pais("BRA", "Brasil", 8516000);
		Pais wakanda = new Pais("WAK", "Wakanda", 4500000);
		Pais dasMaravilhas = new Pais("BRA", "País das Maravilhas", 4500000);
		Pais paraguai = new Pais("PAR", "Paraguai", 406000);
		
		brasil.comparaPaises(wakanda);
		brasil.comparaPaises(dasMaravilhas);
		brasil.setPopulacao(211800000);
		
		brasil.calculaDensidade();
		
		brasil.adicionaFronteira(paraguai);
		brasil.adicionaFronteira(wakanda);
		
		brasil.ehFronteira(paraguai);
		brasil.ehFronteira(dasMaravilhas);
		
		brasil.minhasFronteiras();
		
		
		
	}

}
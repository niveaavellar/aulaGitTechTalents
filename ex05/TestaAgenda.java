package exercicios.ex05;

public class TestaAgenda {
	public static void main(String[] args) {
		
		Contato contato1 = new Contato("Ana", "(19)91234567", "ana@gmail.com");
		Contato contato2 = new Contato("Beatriz", "(19)97654321", "beatriz@gmail.com");
		Contato contato3 = new Contato("Carla", "(19)924681357", "carla@gmail.com");
		Contato contato4 = new Contato("Brunão", "(19)966666666", "brunozzy@gmail.com");
		
		Agenda nivea = new Agenda("Agenda da Nivea");
		Agenda daniel = new Agenda("Agenda do Daniel");
		
		nivea.adicionaContato(contato1);
		nivea.adicionaContato(contato2);
		nivea.adicionaContato(contato3);
		daniel.adicionaContato(contato4);
		
		nivea.informacaoDeContato();
		
		System.out.println("---------------------------------------");
		
		daniel.informacaoDeContato();
		
		
	}

}

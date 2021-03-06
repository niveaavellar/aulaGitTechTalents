package exercicios.ex07;

public class TesteException {
	public static void main(String[] args) {
		System.out.println("inicio do main");
		metodo1();
		System.out.println("fim do main");
	}
	
	static void metodo1() {
		System.out.println("inicio do metodo1");
		metodo2();
		System.out.println("fim do metodo1");
	}
	
	static void metodo2() {
		System.out.println("inicio do metodo2");
		try {
			
			int[] array = new int[10];
			for (int i = 0; i <= 15; i++) {
				array[i]=i;
				System.out.println(i);
			}
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("xii, deu ruim! a lista só tem 10 itens, não queira contar 15!");
			
		}
		
		System.out.println("fim do metodo2");
	}

}

package exercicios.ex09;

public class ConversaoDeUnidadesDeTempo {
	
	private static int converteMinutosParaSegundos(int minuto) {
		return minuto*60;	
	}
	private static int converteHorasParaMinutos(int hora) {
		return hora*60;	
	}
	private static int converteDiasParaHoras(int dia) {
		return dia*24;	
	}
	private static int converteSemanasParaDias(int semana) {
		return semana*7;	
	}
	private static int converteMesesParaDias(int mes) {
		return mes*30;	
	}
	private static int converteAnosParaDias(int ano) {
		return ano*365;	
	}

	
	public static void main(String[] args) {
		
		int minuto = 4;
		int hora = 7;
		int dia = 2;
		int semana = 3;
		int mes = 4;
		int ano = 2;
		
		System.out.println(minuto + " minutos equivalem a "+ converteMinutosParaSegundos(minuto) + " segundos.");
		System.out.println(hora + " horas equivalem a "+ converteHorasParaMinutos(hora) + " minutos.");
		System.out.println(dia + " dias equivalem a "+ converteDiasParaHoras(dia) + " horas.");
		System.out.println(semana + " semanas equivalem a "+ converteSemanasParaDias(semana) + " dias.");
		System.out.println(mes + " meses equivalem a "+ converteMesesParaDias(mes) + " dias.");
		System.out.println(ano + " anos equivalem a "+ converteAnosParaDias(ano) + " dias.");
		
	}

	


	
	
	
	

}

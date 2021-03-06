package exercicios.ex04;

public class Televisao {
	
	private int volume = 0;
	private int canal = 1;
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	public void mostraVolume() {
		System.out.println("Volume: " + volume);
	}
	public void mostraCanal() {
		System.out.println("Canal: " + canal);
	}

}
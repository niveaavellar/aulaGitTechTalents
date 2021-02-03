package exercicios.ex04;

public class ControleRemoto {
	
	private Televisao televisao;
	

	public void setTelevisao(Televisao televisao) {
		this.televisao = televisao;
	}

	
	public void aumentaVolume(Televisao televisao) {
		televisao.setVolume(televisao.getVolume()+1);		
	}
	
	public void diminuiVolume(Televisao televisao) {
		televisao.setVolume(televisao.getVolume()-1);		
	}
	
	public void mudacanal(Televisao televisao, int canal) {
		televisao.setCanal(canal);		
	}

}
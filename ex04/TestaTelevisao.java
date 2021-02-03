package exercicios.ex04;

public class TestaTelevisao {
	public static void main(String[] args) {
		Televisao LG = new Televisao();
		ControleRemoto controle = new ControleRemoto();
		
		controle.setTelevisao(LG);
		
		LG.mostraCanal();
		LG.mostraVolume();
		
		controle.aumentaVolume(LG);
		controle.mudacanal(LG, 13);
		
		LG.mostraCanal();
		LG.mostraVolume();
		
	}

}
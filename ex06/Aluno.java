package exercicios.ex06;


public class Aluno {
	
	private String nome;
	private String matricula;
	private double nota[] = new double[4];
	
	
	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;

	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) {
		this.nota = nota;
	}


}

package exercicios.ex06;

import java.util.ArrayList;

public class Curso {
	
	private String nome;
	private String horario;
	private Professor professor;
	private ArrayList <Aluno>listaDeAlunos;
	
	public Curso(String nome, String horario) {
		super();
		this.nome = nome;
		this.horario = horario;
		this.listaDeAlunos = new ArrayList<>();
		
	}

	public String getNome() {
		return nome;
	}

	public String getHorario() {
		return horario;
	}

	public Professor getProfessor() {
		return professor;
	}

	

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	
	
	public void matriculaAluno(Aluno aluno) {
		this.listaDeAlunos.add(aluno);
		
	}
	
	public void atribuiNotasDoAluno(Aluno aluno, double nota1, double nota2, double nota3, double nota4) {
		double[] nota = new double[4];
		nota[0]=nota1;
		nota[1]=nota2;
		nota[2]=nota3;
		nota[3]=nota4;
		aluno.setNota(nota);			
	}
	
	public double calculaMedia(Aluno aluno) {
		double media = 0;
		
		for (int i = 0; i < listaDeAlunos.size(); i++) {
			if (listaDeAlunos.get(i) == aluno) {
				
				media = (aluno.getNota()[0]+aluno.getNota()[1]+aluno.getNota()[2]+aluno.getNota()[3])/4;
				break;
				
			}

		}
		
		return media;
	}
	
	public void informaMedia(Aluno aluno) {
		
		double media = calculaMedia(aluno);
		if (media==0) {
			System.out.println("Aluno nao matriculado!");
			
		}else {
			System.out.println("Média final de " + aluno.getNome() + " em " + nome + ": " +  media);
		}
	}
	
	public void calculaAprovacao(Aluno aluno) {
		
		if(calculaMedia(aluno) < 7) {
			System.out.println(aluno.getNome() + " está reprovado(a) em " + nome + "! Passe no departamento de " + professor.getDepartamento() 
			+ " para falar com " + professor.getNome() + " ou mande um email para " + professor.getEmail());
		}else {
			System.out.println(aluno.getNome() + " está aprovado(a) em " + nome + "!");
		}
		
	}
	
	public void calculaMediaTurma() {
		double media = 0;
		
		for (int i = 0; i < listaDeAlunos.size(); i++) {
			media = media + calculaMedia(listaDeAlunos.get(i));
		}

		System.out.println("Média da turma de "+ nome + ": " + media/listaDeAlunos.size());
	}

}

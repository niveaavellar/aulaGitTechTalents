package exercicios.ex06;

public class TestaCurso {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Nivea", "048080");
		Aluno aluno2 = new Aluno("Daniel", "047361");
		Aluno aluno3 = new Aluno("Beatriz", "097824");
		Aluno aluno4 = new Aluno("Nivea", "048080");
		Aluno aluno5 = new Aluno("Daniel", "047361");
		Aluno aluno6 = new Aluno("Beatriz", "097824");
		
		Curso mat = new Curso("Matemática", "8h");
		Curso geo = new Curso("Geografia", "10h");
		
		Professor prof1 = new Professor("Serpa", "Exatas", "serpa.exatas@unibiscoito.com");
		Professor prof2 = new Professor("Ana", "Ciências Naturais", "ana.cnat@unibiscoito.com");
		
		mat.setProfessor(prof1);
		geo.setProfessor(prof2);
		
		mat.matriculaAluno(aluno1);
		mat.matriculaAluno(aluno2);
		mat.matriculaAluno(aluno3);
		
		geo.matriculaAluno(aluno4);
		geo.matriculaAluno(aluno5);
		geo.matriculaAluno(aluno6);
			
		
		mat.atribuiNotasDoAluno(aluno1, 10, 9, 7.5, 10);
		mat.atribuiNotasDoAluno(aluno2, 5, 4.5, 9, 9);
		mat.atribuiNotasDoAluno(aluno3, 10, 9, 8, 7.5);
		geo.atribuiNotasDoAluno(aluno4, 4.5, 7, 8, 7.5);
		geo.atribuiNotasDoAluno(aluno5, 10, 8, 9, 10);
		geo.atribuiNotasDoAluno(aluno6, 7, 9, 7, 8);

		
		mat.calculaMedia(aluno1);
		mat.calculaMedia(aluno2);
		mat.calculaMedia(aluno3);
		geo.calculaMedia(aluno4);
		geo.calculaMedia(aluno5);
		geo.calculaMedia(aluno6);
		mat.informaMedia(aluno1);
		mat.informaMedia(aluno2);
		mat.informaMedia(aluno3);
		mat.informaMedia(aluno4);
		geo.informaMedia(aluno4);
		geo.informaMedia(aluno5);
		geo.informaMedia(aluno6);
		geo.informaMedia(aluno1);
		
		System.out.println("---------------------");
		
		mat.calculaAprovacao(aluno1);
		geo.calculaAprovacao(aluno4);
		mat.calculaAprovacao(aluno2);
		geo.calculaAprovacao(aluno5);
		
		System.out.println("---------------------");
		
		mat.calculaMediaTurma();
		geo.calculaMediaTurma();

		
		
	}


}

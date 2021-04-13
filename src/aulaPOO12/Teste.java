package aulaPOO12;

public class Teste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.setCurso("CS-50");
		double[] notas = {10, 9, 8, 7};
		aluno.setNotas(notas);
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setCurso("CS-50");
		double[] notas2 = {7, 6, 5, 5};
		aluno2.setNotas(notas);
		
		System.out.println(aluno);
		System.out.println(aluno.equals(aluno2));
	}

}

package aulaMatrizVetores;

public class Matriz {
	public static void main (String[] args) {
		double[][] notasAlunos = new double[30][4];
		
		notasAlunos[0][0] = 9;
		notasAlunos[0][1] = 8;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 8;
		
		System.out.println("notas são : " + notasAlunos[0][1] + " " +  notasAlunos[0][2] + " " + notasAlunos[0][0] + " " + notasAlunos[0][3]);
	}
}

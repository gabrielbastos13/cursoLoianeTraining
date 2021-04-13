package exceptions01;

public class Excecao {

	public static void main (String[] args) {
		try {
		int[] vetor = new int[4];
		
		System.out.println("Antes da exception");
		
		vetor[4] = 1;
		System.out.println("nao sera impresso");
		
		} catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Excessão ao acessar um índice do vetor que não existe");
		}
		System.out.println("Este texto será impresso após o tratamento da exceptions");
	}
}

package execContaBancaria;

public class Test {
	public static void main(String[] args) {
		System.out.println("*** Test Conta Bancaria   ***");
		
		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Cliente Conta Simples");
		contaSimples.setNumConta("11111");
		
		System.out.println(contaSimples	);
	}

}

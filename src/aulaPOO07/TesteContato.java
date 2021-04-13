package aulaPOO07;

public class TesteContato {
	
	public static void main(String[] args) {

	Contato contato = new Contato();
	
	contato.setNome("Gabriel");
	//contato.setEndereco("GRU");
	//contato.setTelefone("6666-6666");
	
	//relacionamento tem-um endereco 
	Endereco end = new Endereco();
	end.setNomeRua("Rua Anthony");
	end.setNumero("44");
	end.setComplemento("na");
	end.setCidade("G r u");
	end.setEstado("sp");
	end.setCep("001122");
	
	contato.setEndereco(end);
	
	//relacionamento tem-um telefone
	Telefone telefone = new Telefone();
	telefone.setTipo("celular");
	telefone.setDdd("11");
	telefone.setNumero("987654321");
	
	Telefone telefone2 = new Telefone();
	telefone2.setTipo("casa");
	telefone2.setDdd("11");
	telefone2.setNumero("22345678");
	
	Telefone[] telefones = new Telefone[2];
	telefones[0]= telefone;
	telefones[1]= telefone2;
	
	contato.setTelefones(telefones);
	
	//Teste saída no controle
	System.out.println(contato.getNome());
	//System.out.println(contato.getTelefone());
	
	if(contato != null && contato.getEndereco() != null) {
		System.out.println(contato.getEndereco().getCidade());
	}
	
	/*if(contato != null && contato.getTelefone() != null) {
		System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
	}*/
	
	if(contato != null && contato.getTelefones() != null) {
		for (Telefone t: contato.getTelefones()) {
		System.out.println(t.getDdd() + " " + t.getNumero());
		}
	}
	
}}

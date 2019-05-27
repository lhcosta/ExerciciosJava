
public class Util {
	
	
	private static Cliente criarCliente(String login) {
		Cliente c = new Cliente(login);
		return c;
	}
	
	private static Gerente criarGerente(String login) {
		Gerente g = new Gerente(login);
		return g;
	}
	
	private static Funcionario criarFuncionario(String login) {
		Funcionario f = new Funcionario(login);
		return f;
	}
	
	private static Diretor criarDiretor(String login) {
		Diretor d = new Diretor(login);
		return d;
	}
	
	public static Pessoa escolherPessoa(String login, int index_pessoa) {
		
		Pessoa pessoa = null;
		
		switch (index_pessoa) {
		case 1:
			pessoa = Util.criarCliente(login);
			break;
		case 2:
			pessoa = Util.criarFuncionario(login);
			break;
		case 3:
			pessoa = Util.criarGerente(login);
			break;
		case 4:
			pessoa = Util.criarDiretor(login);
		}
		
		return pessoa;
		
	}
	
	public static Setor escolherSetor(int index_setor) {
		
		Setor setor = null;
		
		switch (index_setor) {
		case 1:
			setor = new Agencia();
			break;
		case 2:
			setor = new Caixa();
			break;
		case 3:
			setor = new SalaReuniao();
			break;
		case 4:
			setor = new Cofre();
			break;
		case 5:
			setor = new Arquivo();
			
		}
		
		return setor;
		
	}
	
	
	public static void validarSenha(Pessoa pessoa, int senha) {
		
		if(!(pessoa.getSenha() == senha)) {
			throw new IllegalArgumentException("Senha Invalida");
		}
		
		
	}
	
}

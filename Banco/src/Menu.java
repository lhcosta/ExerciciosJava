
public class Menu {
	
	
	public static void principal() {
		
		boolean flag = false;
		int index_pessoa;
		Pessoa pessoa = null;
		
		index_pessoa = View.solicitarDadosInteiro("1 - Cliente\n"
				+ "2 - Funcionario\n"
				+ "3 - Gerente\n"
				+ "4 - Diretor\n", "Tipo Funcao", 1, 4);
		
		String login = View.solicitarDados("Digite o login", "Login");
		pessoa = Util.escolherPessoa(login, index_pessoa);
		
		do {
			
			try {
					
				int senha = View.solicitarDadosInteiro("Digite a senha", "Senha", 1, 12345);
				Util.validarSenha(pessoa, senha);
				
				menuSetor(pessoa);
				flag = true;
				
			}catch (IllegalArgumentException e) {
				View.mensagemErro(e.getMessage(), "Error");
				
			}catch (NullPointerException e) {
				flag = true;
			}
			
		}while(!flag);
		
		
	}
	
	
	private static void menuSetor(Pessoa pessoa) {
		
		boolean flag = false;
		
		do {
			
			try {
				
				int index_setor = View.solicitarDadosInteiro("1 - Agencia\n"
						+ "2 - Caixa\n"
						+ "3 - Sala Reuniao\n"
						+ "4 - Cofre\n"
						+ "5 - Arquivo\n", "Escolher Setor", 1, 5);
				
				Setor setor = Util.escolherSetor(index_setor);
				setor.acessar(pessoa);
				
				flag = true;
				View.mensagemTexto("Entrada liberada", "Bem-Vindo");
				
			} catch (IllegalArgumentException e) {
				View.mensagemErro(e.getMessage(), "Error");
				
			} catch (NullPointerException e) {
				flag = true;
			}
			
		}while(!flag);	
		
		
		
	}

}

import java.util.ArrayList;

public class Util {
	
	//Atributos
	private static ArrayList<Filial> filiais = new ArrayList<>();
	private static ArrayList<Filme> filmes = new ArrayList<>();
	private static ArrayList<Cliente> clientes = new ArrayList<>();
	
	//Criando um cliente
	public static Cliente criarCliente() {
		
		String nome = View.solicitarDados("DIGITE O NOME", "CLIENTE");
		String cpf = View.solicitarDados("DIGITE O CPF", "CLIENTE");
		
		Cliente c = new Cliente(nome, cpf);
		clientes.add(c);
		return c;
	}
	
	//Criando um funcionario
	public static Funcionario criarFuncionario() {
		
		String nome = View.solicitarDados("DIGITE O NOME", "FUNCIONARIO");
		int idade = View.solicitarDadosInteiro("DIGITE A IDADE", "FUNCIONARIO", 1, 100);
		
		Funcionario f = new Funcionario(nome, idade);
		return f;
	}
	
	/*
	 * Bloco de metodos relacionados as filiais
	 * */
	
	//Criando filial 
	public static void criarFilial() {
		
		String nome = View.solicitarDados("DIGITE O NOME", "FILIAL");
		Filial f = null;
		
		try {
			f = new Filial(nome);
			filiais.add(f);
		}catch(RuntimeException e) {
			View.mensagemErro("NAO E POSSIVEL CRIAR MAIS FILIAIS", "FILIAIS");
		}
	}
	
	//Apresentando todas as filias
	public static String retornaNomeFilias() {
		
		String nomes = "";
		int i = 1;
		
		for(Filial f : filiais) {
			nomes += (i + " - " + f.getNome().toUpperCase() + "\n");
			i++;
		}
		
		return nomes;
	}

	//Metodo Acessor Filial
	public static ArrayList<Filial> getFiliais() {
		return filiais;
	}
	
	
	/*
	 * Bloco relacionado aos filmes
	 * */
	
	public static void criarFilme() {
		
		String nome = View.solicitarDados("DIGITE O NOME", "FILME");
		int ano = View.solicitarDadosInteiro("DIGITE O ANO", "FILME", 1900, 2019);
		
		try {
			Filme f = new Filme(nome, ano);
			filmes.add(f);
		} catch (RuntimeException e) {
			// TODO: handle exception
			View.mensagemErro(e.getMessage(), "ERROR");
		}
		
	}
	
	//Apresentando todas os filmes
	public static String retornaNomeFilmes() {
		
		String nomes = "";
		
		if(filmes.size() == 0) {
			return "NENHUM FILME CADASTRADO!";
		}
		
		for(Filme f : filmes) {
			nomes += ("CODIGO " + f.getCodigo() + " - " + f.getNome().toUpperCase() + "\n");
		}
		
		return nomes;
	}
	
	//Metodo Acessor Filme
	public static ArrayList<Filme> getFilmes() {
		return filmes;
	}
	
	//Apresentar Filmes Disponiveis
	private static String getFilmesDisponiveis() {
		
		String nomes = "";
		boolean flag = false;
		
		if(filmes.size() == 0) {
			throw new RuntimeException("NENHUM FILME CADASTRADO");
		}
		
		for(Filme f : filmes) {
			if(!f.isAlugado()) {
				nomes += (f.getCodigo() + " - " + f.getNome().toUpperCase() + "\n");
				flag = true;
			}
		}
		
		if(!flag) {
			throw new RuntimeException("NÃO HÁ FILMES DISPONIVEIS");
		}
		
		return nomes;
		
	}
	
	//Realizando Locacao
	public static void realizarLocacao() {
		
		Cliente c  = Util.criarCliente();
		Locacao locacao;
		Funcionario funcionario;
		Filial filial;
		
		int qtdFilmes = 0;
		int flag = 0;
		
		//Selecionando filial
		int filialSelecionada = View.solicitarDadosInteiro(retornaNomeFilias(), "SELECIONE A FILIAL", 1, filiais.size());
		filial = filiais.get(filialSelecionada-1);
		
		//Selecionando funcionario
		try {
			int funcionarioSelecionado = View.solicitarDadosInteiro(filial.getNomesFuncionarios(),"SELECIONE O FUNCIONARIO", 1 , filial.getFuncionarios().size());
			funcionario = filial.getFuncionarios().get(funcionarioSelecionado-1);
			
		} catch (RuntimeException e) {
			
			// TODO: handle exception
			View.mensagemErro(e.getMessage(), "ERROR");
			return;
		}
		
		locacao = new Locacao(c, funcionario);
		
		
		//Selecionando filmes
		do {	
			try {
				
				int filmeSelecionado = View.solicitarDadosInteiro(getFilmesDisponiveis(), "SELECIONE O FILME", 1, Util.filmes.size());
				
				Filme filme = Util.getFilmes().get(filmeSelecionado-1);
				filme.setAlugado(true);
				
				locacao.setFilme(filme);
				
				qtdFilmes++;
				
				if(qtdFilmes < 2) {
					flag = View.solicitarDadosInteiro("DESEJA ESCOLHER OUTRO FILME\n"
							+ "1 - SIM\n"
							+ "2 - NAO\n", "ALOCANDO FILMES", 1, 2);
				}else {
					flag = 2;
				}
				
			} catch (RuntimeException e) {
				// TODO: handle exception
				View.mensagemErro(e.getMessage(), "ERROR");
				
				//Caso ocorra uma exception na seleção do segundo filme, mas um estiver tido sucesso, será alocado da mesma forma
				if(qtdFilmes > 0) {
					View.mensagemTexto("APENAS UM FILME FOI ALOCADO", "PARABENS!!");
					filial.setLocacao(locacao);
				}
				
				return;
			}
			
		}while(flag == 1 && qtdFilmes < 2);
		
		
		filial.setLocacao(locacao);
		View.mensagemTexto("LOCACAO OCORRIDA COM SUCESSO", "PARABENS!!");
	}
	
}

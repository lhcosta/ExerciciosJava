
public class Menu {

	//Fazer menu inicial para cadastro de filmes e filias
	public static void menuInicial() {
		boolean flag = false;
		int option; 
		
		View.mensagemTexto("BEM-VINDO AO SISTEMA DE LOCADORA", "");
		View.mensagemTexto("PARA INICIAR CRIE UMA FILIAL", "LOCADORA");
		
		//Criando uma filial inicial
		Util.criarFilial();
		
		
		do {
			
			option = View.solicitarDadosInteiro("1 - FILIAIS\n"
					+ "2 - FILMES\n"
					+ "3 - REALIZAR LOCACAO\n"
					+ "4 - ENCERRAR\n", "LOCADORA", 1, 4);
			
			switch (option) {
			case 1:
				menuFilial();
				break;
			case 2:
				menuFilme();
				break;
			case 3:
				if(Util.getFilmes().size() == 0) {
					View.mensagemErro("NAO E POSSIVEL PROSSEGUIR\nNENHUM FILME CADASTRADO\n", "ERROR");
					break;
				}
				
				Util.realizarLocacao();
				break;
			case 4:
				flag = true;
			}
			
			
		} while (!flag);
	}
	
	//Menu filial
	private static void menuFilial() {
		
		int option;
		boolean flag = false;
		
		do {
			
			option = View.solicitarDadosInteiro("1 - CADASTRAR FILIAL\n"
					+ "2 - APRESENTAR FILIAIS\n"
					+ "3 - RETORNAR AO MENU PRINCIPAL\n", "LOCADORA", 1, 3);
			
			switch (option) {
			case 1:
				Util.criarFilial();
				break;
			case 2:	
				int filialSelecionada = View.solicitarDadosInteiro(Util.retornaNomeFilias() + "\n0 - RETORNAR", "FILIAIS", 0 , Util.getFiliais().size());
				
				if(filialSelecionada == 0) {
					break;
				}
				
				subMenuFilial(Util.getFiliais().get(filialSelecionada-1));
				break;
			case 3:
				flag = true;
			}
			
		} while (!flag);
	}
	
	//Submenu Filial
	private static void subMenuFilial(Filial filial) {
		
		int option;
		boolean flag = false;
		
		do {
			
			option = View.solicitarDadosInteiro("1 - CADASTRAR FUNCIONARIO\n"
					+ "2 - APRESENTAR FUNCIONARIOS\n"
					+ "3 - APRESENTAR LOCACOES\n"
					+ "4 - RETORNAR\n", filial.getNome(), 1, 4);
			
			switch (option) {
			case 1:
				try {
					filial.setFuncionarios(Util.criarFuncionario());
				} catch (RuntimeException e) {
					// TODO: handle exception
					View.mensagemErro(e.getMessage(), "ERROR");
				}
				
				break;
			case 2:
				String nomes;
				
				try {
					nomes = filial.getNomesFuncionarios();
				} catch (RuntimeException e) {
					// TODO: handle exception
					nomes = e.getMessage();
				}
				
				View.mensagemTexto(nomes, filial.getNome());
				break;
			case 3:
				View.mensagemTexto(filial.getInfoLocacoes(), filial.getNome());
				break;
			case 4:
				flag = true;
			}
			
			
		} while (!flag);
	}
	
	
	
	//Menu filme
	private static void menuFilme() {
		
		int option;
		boolean flag = false;
		
		do {
			
			option = View.solicitarDadosInteiro("1 - CADASTRAR FILME\n"
					+ "2 - APRESENTAR FILMES\n"
					+ "3 - RETORNAR AO MENU PRINCIPAL\n", "LOCADORA", 1, 3);
			
			switch (option) {
			case 1:
				Util.criarFilme();
				break;
			case 2:	
				View.mensagemTexto(Util.retornaNomeFilmes(), "FILMES");
				break;
			case 3:
				flag = true;
			}
			
		} while (!flag);
	}
	
	
}

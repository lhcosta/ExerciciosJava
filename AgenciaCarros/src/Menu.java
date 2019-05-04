
public class Menu {
	
	private static String nomeAgencia;
	
	public static void menuInicial() {
		
		try {
			nomeAgencia = View.solicitarDados("DIGITE O NOME: ", "CADASTRO AGENCIA");
			menuFilial();
		}catch(NullPointerException e) {
			return;
		}
	}
	
	//Menu Filiais
	private static void menuFilial() {
		
		int option;
		boolean flag = false;
		
		do {
			
			try {
				
				option = View.solicitarDadosInteiro("1 - Cadastrar Filial\n"
						+ "2 - Apresentar Filial\n" , nomeAgencia, 1 , 2);
				
				switch (option) {
				case 1:
					Util.cadastrarFilial();
					View.mensagemTexto("Filial cadastrada com sucesso", "Filiais");
					break;
				case 2:
					int filial = View.solicitarDadosInteiro(Util.getNomeFiliais(), "Escolha uma filial", 1, Util.getFiliais().size());	
					//filial - 1, pois estou acessando por indice 
					subMenuFilial(Util.getFiliais().get(filial-1));
					break;
				}	
				
			}catch(NullPointerException e) {
				flag = true;
			} catch (IllegalArgumentException e) {
				View.mensagemErro("Nenhuma filial cadastrada", nomeAgencia);
			}
		
		} while (!flag);
		
	}
	
	//SubMenu de filiais
	private static void subMenuFilial(Filial filial) {
		
		int option;
		boolean flag = false;
		
		do {
			
			try {
				
				option = View.solicitarDadosInteiro("1 - Realizar Venda\n"
						+ "2 - Carros\n"
						+ "3 - Relatorios\n"
						+ "4 - Valor Total de Vendas\n", filial.getNome(), 1, 4);
				
				switch (option) {
				case 1:
					realizarVendas(filial);
					break;
				case 2:
					menuCarros(filial);
					break;
				case 3:
					View.mensagemTexto(filial.getTodosRelatorios(), "Relatorios - " + filial.getNome());
					break;
				case 4:
					View.mensagemTexto("R$ " + filial.getRendaTotal(), filial.getNome());
				}
				
			}catch (NullPointerException e) {
				//Utilizado para retornar por meio do botao cancelar
				flag = true;
			}catch (IllegalArgumentException e) {
				View.mensagemErro(e.getMessage(), filial.getNome());
			}
			
		} while (!flag);
		
	}
	
	
	//Realizar Venda
	private static void realizarVendas(Filial filial) {
		
		try {
			
			int carroEscolhido = View.solicitarDadosInteiro(filial.getNomesCarros(), "Escolha o carro", 1, filial.getCarros().size());
			Carro carro = filial.getCarros().get(carroEscolhido-1);
			
			Cliente cliente = Util.cadastrarCliente();
			
			Venda venda = Util.cadastrarVenda(carro);
			filial.setVendas(venda);
			
			Relatorio relatorio = Util.gerarRelatorio(carro, venda, cliente);
			filial.setRelatorios(relatorio);
			
		} catch (IllegalArgumentException e) {
			View.mensagemErro(e.getMessage(), "Escolha o carro");
			View.mensagemErro("Venda nao finalizada", filial.getNome());
			return;
		
		} catch (NullPointerException e) {
			return;
		}
	}
	
	//Menu de carros
	private static void menuCarros(Filial filial) {
		
		int option;
		boolean flag = false;
		
		do {
			
			try {
				
				option = View.solicitarDadosInteiro("1 - Cadastrar carro\n"
						+ "2 - Apresentar carros\n", filial.getNome(), 1, 2);
					
				switch (option) {
				case 1:
					Carro carro = Util.cadatrarCarro();
					filial.setCarro(carro);
					break;
				case 2:
					View.mensagemTexto(filial.getNomesCarros(), "Carros - " + filial.getNome());
				}
								
			} catch (NullPointerException e) {
				// TODO: handle exception
				//Utilizado para retornar por meio do botao cancelar
				flag = true;
			} catch (IllegalArgumentException e) {
				View.mensagemErro(e.getMessage(), filial.getNome());
				flag = true;
			}
			
		} while (!flag);

	}	
}

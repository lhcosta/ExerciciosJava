import java.util.ArrayList;

public class Util {
	
	private static ArrayList<Filial> filiais = new ArrayList<>();
	
	//Cadastrar carro
	public static Carro cadatrarCarro() {
		
		String marca = View.solicitarDados("Digite a marca: ", "Carro");
		String modelo = View.solicitarDados("Digite o modelo: ", "Carro");
		int ano = View.solicitarDadosInteiro("Digite o ano", "Carro", 1960, 2019);
		
		Carro carro = new Carro(marca, modelo, ano);
		
		return carro;
	}
	
	//Cadastrar cliente
	public static Cliente cadastrarCliente() {
		
		String nome = View.solicitarDados("Digite o nome: ", "Cliente");
		String cpf = View.solicitarDados("Digite o cpf: ", "Cliente");
		
		Cliente cliente = new Cliente(nome, cpf);
		
		return cliente;
	}
	
	//Cadastrar venda
	public static Venda cadastrarVenda(Carro carro) {
		
		Venda venda = new Venda(carro.getPreco());	
		return venda;
	}
	
	//Criando relatorio
	public static Relatorio gerarRelatorio(Carro carro, Venda venda, Cliente cliente) {
		
		Relatorio relatorio = new Relatorio(carro, cliente, venda);
		return relatorio;
	}
	
	//Cadastrar filial
	public static void cadastrarFilial() throws RuntimeException {
		
		if(filiais.size() > 3) {
			throw new RuntimeException("Quantidade maxima de 3 filiais");
		}
		
		String nome = View.solicitarDados("Digite o nome: ", "Filial");
		Filial filial = new Filial(nome);
		
		filiais.add(filial);	
	}
	
	//Nomes da Filiais enumerados
	public static String getNomeFiliais() throws IllegalArgumentException {
		
		String info = "";
		int i = 1;
		
		if(filiais.size() == 0) {
			throw new IllegalArgumentException("Nenhuma filial cadastrada");
		}
		
		for(Filial f : filiais) {
			info += i + " - " + f.getNome() + "\n";
			i++;
		}
		
		return info;
	}

	//Retornando filiais
	public static ArrayList<Filial> getFiliais() {
		return filiais;
	}
	
}

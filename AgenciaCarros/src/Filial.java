import java.util.ArrayList;


public class Filial {
	
	private String nome;
	private ArrayList<Carro> carros = new ArrayList<>();
	private ArrayList<Venda> vendas = new ArrayList<>();
	private ArrayList<Relatorio> relatorios = new ArrayList<>();
	private double rendaTotal;
	
	
	Filial(String nome){
		setNome(nome);
	}
	
	//Metodos acessores
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendaTotal() {
		calcularValorVendas();
		return rendaTotal;
	}
	
	public ArrayList<Carro> getCarros() {
		return carros;
	}
	
	public void setCarro(Carro carro) {
		carros.add(carro);
	}
	
	public void setVendas(Venda venda) {
		this.vendas.add(venda);
	}

	public void setRelatorios(Relatorio relatorio) {
		this.relatorios.add(relatorio);
	}

	//Calcula renda total da filial
	private void calcularValorVendas() {
		for(Venda v : vendas) {
			rendaTotal += v.getValor();
		}
	}
	
	//Apresentar carros
	public String getNomesCarros() throws IllegalArgumentException {
		
		if(carros.isEmpty()) {
			throw new IllegalArgumentException ("Nenhum carro cadastrado!");
		}
		
		String info = "";
		int i = 1;
		
		for(Carro c : this.carros) {
			if(!c.isVendido()) {
				info += i +  " - " + c.toString() + "\n"
						+ "R$ " + c.getPreco();
				i++;
			}
		}
		
		return info.toUpperCase();
		
	}
	
	//Apresentar relatorios
	public String getTodosRelatorios() throws IllegalArgumentException {
		
		if(relatorios.isEmpty()) {
			throw new IllegalArgumentException("Nenhum relatorio gerado");
		}
		
		String info = "";
		
		for(Relatorio r : relatorios) {
			info += r.toString() + "\n";
		}
		
		return info;
	}
	
}

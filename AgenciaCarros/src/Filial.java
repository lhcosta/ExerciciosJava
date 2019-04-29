import java.util.ArrayList;


public class Filial {
	
	private String nome;
	private ArrayList<Carro> carros = new ArrayList<>();
	private ArrayList<Venda> vendas = new ArrayList<>();
	private ArrayList<Relatorio> relatorios = new ArrayList<>();
	private double rendaTotal;
	
	
	Filial(String nome){
		setNome(nome);
		calcularValorVendas();
	}
	
	private void calcularValorVendas() {
		for(Venda v : vendas) {
			rendaTotal += v.getValor();
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendaTotal() {
		return rendaTotal;
	}
	
	private ArrayList<Carro> getCarros() {
		return carros;
	}

	private ArrayList<Relatorio> getRelatorios() {
		return relatorios;
	}
	
	
	//Apresentar carros
	public String getNomesCarros() {
		
		for(Carro c : this.carros) {
			
		}
		
		return "";
		
	}
	
	

	
}

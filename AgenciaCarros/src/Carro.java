import java.util.Random;

public class Carro {

	private String marca;
	private String modelo;
	private int ano;
	private boolean vendido;
	private double preco;
	
	Carro(String marca, String modelo, int ano){
		setMarca(marca);
		setModelo(modelo);
		setAno(ano);
		gerarPrecoCarro();
	}
	

	private void setMarca(String marca) {
		this.marca = marca;
	}


	private void setModelo(String modelo) {
		this.modelo = modelo;
	}


	private void setAno(int ano) {
		this.ano = ano;
	}


	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}
	
	public boolean isVendido() {
		return vendido;
	}
	
	public double getPreco() {
		return preco;
	}


	@Override
	public String toString() {
		return this.marca + " " + this.modelo + " " + this.ano;
	}
	
	//O preco do carro é gerado de forma aleatoria
	private void gerarPrecoCarro() {
		
		Random aux = new Random();
		double valorMin = 15000.00;
		double valorMax = 110000.00;
		
		this.preco = Math.round((aux.nextDouble() * (valorMax - valorMin)) + valorMin); 
	}
	
	
	
}

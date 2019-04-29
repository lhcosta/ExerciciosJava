
public class Carro {

	private String marca;
	private String modelo;
	private int ano;
	private double preco;
	private boolean vendido;
	
	
	Carro(String marca, String modelo, int ano, double preco){
		setMarca(marca);
		setModelo(modelo);
		setAno(ano);
		setPreco(preco);
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


	private void setPreco(double preco) {
		this.preco = preco;
	}


	@Override
	public String toString() {
		return this.marca + " " + this.modelo + " " + this.ano;
	}
	
	
	
	
}



public class Venda {
	
	private double valor;
	private int ano;
	private boolean creditoAprovado;
	
	
	Venda(double valor, int ano){
		setAno(ano);
		setValor(valor);
	}


	private void setValor(double valor) {
		this.valor = valor;
	}


	private void setAno(int ano) {
		this.ano = ano;
	}

	//Criar metodo para aprovacao de credito randomico de acordo com a renda do cliente
	public void aprovarCredito() {
		
	}
	
	public double getValor() {
		return valor;
	}


	
	
	
	
	

}

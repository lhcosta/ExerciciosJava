import java.util.Random;

public class Venda {
	
	private double valor;
	private boolean creditoAprovado;
	
	Venda(double valor){
		aprovarCredito();
		setValor(valor);
	}

	//Metodos acessores
	private void setValor(double valor) {
		this.valor = valor;
		
		if(creditoAprovado) {
			this.valor -= 5000;
		}
	}

	public double getValor() {
		return valor;
	}
	
	public boolean getCreditoAprovado() {
		return creditoAprovado;
	}


	//Criar metodo para aprovacao de credito randomico de acordo com a renda do cliente
	private void aprovarCredito() {
		
		Random random = new Random();
		int aux = random.nextInt(3);
		
		if(aux == 0 || aux == 1) {
			creditoAprovado = false;
		}else {
			creditoAprovado = true;
		}
	}
	
	

	

}

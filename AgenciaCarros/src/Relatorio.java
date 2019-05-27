
public class Relatorio {
	
	private Carro carro;
	private Cliente cliente;
	private Venda venda;
	
	
	Relatorio(Carro carro, Cliente cliente, Venda venda){
		setCarro(carro);
		setCliente(cliente);
		setVenda(venda);
	}

	private void setCarro(Carro carro) {
		this.carro = carro;
	}


	private void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	private void setVenda(Venda venda) {
		this.venda = venda;
	}
	
	@Override
	public String toString() {
		
		String info = "Cliente - " + cliente.getNome() + "\n"
				+ "Carro - " + carro.toString() + "\n"
				+ "Valor Venda - R$ " + venda.getValor() + "\n";
		
		return info;
	}
	
	
}

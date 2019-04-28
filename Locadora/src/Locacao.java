import java.util.ArrayList;

public class Locacao {
	
	//Atributos
	private Cliente cliente;
	private ArrayList<Filme> filmes = new ArrayList<>();
	private Funcionario funcionario;
	
	//Construtor
	Locacao (Cliente cliente, Funcionario f){
		setCliente(cliente);
		setFuncionario(f);
	}
	
	//Metodos Acessores
	private void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void setFilme(Filme filme) {
		filmes.add(filme);
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	//Retornado informacoes sobre locacao
	public String getInfo() {
		
		String info = ""; 
		
		info += "FUNCIONARIO - " + funcionario.getNome().toUpperCase() + "\n"
			  + "CLIENTE - " + cliente.getNome().toUpperCase() + "\n";
		
		for(Filme f : filmes) {
			info += "FILME - " + f.getNome().toUpperCase() + "\n"; 
		}
		
		return info;
	}
	
	
	
	
	
	
	
	

}

import java.util.ArrayList;

public class Locacao {
	
	//Atributos
	private Cliente cliente;
	private ArrayList<Filme> filmes = new ArrayList<>();
	private Funcionario funcionario;
	
	
	//Construtor
	Locacao (Cliente cliente, Filme filme){
		setCliente(cliente);
		setFilme(filme);
	}
	
	Locacao (Cliente cliente, Filme filme1, Filme filme2){
		super();
		setFilme(filme2);
	}
	
	//Metodos Acessores
	private void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void setFilme(Filme filme) {
		filmes.add(filme);
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public ArrayList<Filme> getFilmes() {
		return filmes;
	}
	
	
	
	
	
	

}

import java.util.ArrayList;

public class Filial {
	
	//Atributos
	private Funcionario[] funcionarios = new Funcionario[2];
	private ArrayList<Locacao> locacoes = new ArrayList<>();
	private String nome;
	
	Filial(String nome){
		setNome(nome);
	}
	
	//Metodos acessores
	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}
	
	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	public ArrayList<Locacao> getLocacoes() {
		return locacoes;
	}
	
	public void setLocacoes(ArrayList<Locacao> locacoes) {
		this.locacoes = locacoes;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}

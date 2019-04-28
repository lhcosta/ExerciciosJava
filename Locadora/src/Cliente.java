
public class Cliente {
	
	//Atributos
	private String nome;
	private int idade;
	private String cpf;

	//Construtor
	Cliente(String nome, String cpf){
		setNome(nome);
		setCpf(cpf);
	}
	
	//Metodos Acessores
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	private void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade)  {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	private void setCpf(String cpf) {
		this.cpf = cpf;
	}

}

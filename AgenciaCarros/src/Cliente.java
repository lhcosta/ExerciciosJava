
public class Cliente {

	//Atributos
	private String nome;
	private String idade;
	private String cpf;
	private double renda;
	
	
	//Construtor
	Cliente(String nome, String cpf){
		setNome(nome);
		setCpf(cpf);
	}
	
	//Metodos acessores
	private void setNome(String nome) {
		this.nome = nome;
	}
	
	private void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", renda=" + renda + "]";
	}
	
	
	
	
	
	
	
	
		
}

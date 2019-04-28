
public class Funcionario {
	
	//Atributos
	private String nome;
	private int idade;
	private String telefone;
	
	//Construtor 
	Funcionario (String nome, int idade){
		setNome(nome);
		setIdade(idade);
	}
	
	//Metodos Acessores
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private void setIdade(int idade) {
		this.idade = idade;
	}

}

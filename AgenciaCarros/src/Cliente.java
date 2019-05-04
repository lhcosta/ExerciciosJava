
public class Cliente {

	//Atributos
	private String nome;
	private String cpf;
	
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


}


public class Animal {
	
	private String nome;
	
	
	Animal(String nome){
		setNome(nome);
	}
	
	public String emitirSom() {
		return "O animal faz ";
	}
	
	public String descricao() {
		return "O animal " + this.nome + " é um ";
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	
	
	
}


public class Professor {
	
	//Atributos
	private String nome;
	private String cpf;
	private Turma turma;

	//Construtor
	Professor(String nome){
		setNome(nome);
	}

	//Métodos Acessores
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	
	
	
	
	
}

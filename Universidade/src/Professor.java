
public class Professor {
	
	//Atributos
	private String nome;
	private String cpf;
	//private Calendar dataNascimento = Calendar.getInstance();
	
	
	//Construtor
	Professor(String nome, String cpf){
		setNome(nome);
		setCpf(cpf);
	}

	//Métodos Acessores
	public String getNome() {
		return nome;
	}


	public String getCpf() {
		return cpf;
	}


/*	public Calendar getDataNascimento() {
		return dataNascimento;
	}
*/
	private void setNome(String nome) {
		this.nome = nome;
	}

	private void setCpf(String cpf) {
		this.cpf = cpf;
	}
/*
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
*/
	
	
	
	
	
}

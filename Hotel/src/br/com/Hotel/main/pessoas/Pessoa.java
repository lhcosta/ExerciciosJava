package br.com.Hotel.main.pessoas;

public abstract class Pessoa {
	
	protected String nome;
	protected String cpf;
	protected String telefone;
	protected char sexo;
	
	Pessoa(String nome){
		this.nome = nome;
	}
	
	public abstract String toString();

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	
	
}

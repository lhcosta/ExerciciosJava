package br.com.Hospital.main.pessoas;

public abstract class Pessoa {
	
	protected String nome;
	protected String cpf;
	protected char sexo;
	protected String tipoSanguineo;
	protected int idade;
	
	Pessoa(String nome){
		setNome(nome);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public abstract String toString();
}

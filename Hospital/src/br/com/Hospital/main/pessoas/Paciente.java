package br.com.Hospital.main.pessoas;

public class Paciente extends Pessoa {

	public Paciente(String nome, int idade) {
		super(nome);
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Paciente " + this.nome + " - " + this.idade + " anos";
	}
}

package br.com.Hotel.main.pessoas;

import br.com.Hotel.main.interfaces.Recepcao;

public class Gerente extends Funcionario implements Recepcao {
	
	private String senha;
	
	public Gerente(String nome, String senha) {
		// TODO Auto-generated constructor stub
		super(nome);
		setSenha(senha);
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Gerente - " + this.nome;
	}

	@Override
	public String acessarRecepcao() {
		// TODO Auto-generated method stub
		return "Acesso liberado para Gerente " + this.nome;
	}

}

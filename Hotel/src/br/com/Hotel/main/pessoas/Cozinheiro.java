package br.com.Hotel.main.pessoas;

import br.com.Hotel.main.interfaces.Cozinha;

public class Cozinheiro extends Funcionario implements Cozinha {
	
	public Cozinheiro(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cozinheiro - " + this.nome;
	}

	@Override
	public String acessarCozinha() {
		// TODO Auto-generated method stub
		return "Acesso liberado para Cozinheiro " + this.nome;
	}
	
	

}

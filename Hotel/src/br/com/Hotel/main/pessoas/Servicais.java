package br.com.Hotel.main.pessoas;

import br.com.Hotel.main.interfaces.Limpeza;

public class Servicais extends Funcionario implements Limpeza {
	
	private String areaLimpeza;
	
	public Servicais(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Servical - " + this.nome;
	}

	public String getAreaLimpeza() {
		return areaLimpeza;
	}

	public void setAreaLimpeza(String areaLimpeza) {
		this.areaLimpeza = areaLimpeza;
	}

	@Override
	public String acessarLimpeza() {
		// TODO Auto-generated method stub
		
		return "Acesso liberado para Servical " + this.nome;
	}
	
	

}

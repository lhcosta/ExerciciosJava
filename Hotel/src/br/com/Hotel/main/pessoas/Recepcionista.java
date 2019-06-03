package br.com.Hotel.main.pessoas;
import java.util.ArrayList;

import br.com.Hotel.main.interfaces.Recepcao;

public class Recepcionista extends Funcionario implements Recepcao {

	private ArrayList<String> diasSemana = new ArrayList<>();
	
	public Recepcionista(String nome) {
		// TODO Auto-generated constructor stub
		super(nome);
	}
	
		
	public ArrayList<String> getDiasSemana() {
		return diasSemana;
	}

	public void setDiasSemana(ArrayList<String> diasSemana) {
		this.diasSemana = diasSemana;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		String dias = "";
		
		for (String dia : diasSemana) {
			dias += dia + "\n";
		}
		
		return "Recepcionista - " + this.nome + dias;
	}

	@Override
	public String acessarRecepcao() {
		// TODO Auto-generated method stub
		return "Acesso liberado para Recepcionista " + this.nome;
	}
	
	
	

}

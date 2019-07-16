package br.com.Hotel.utils;
import java.util.ArrayList;

import br.com.Hotel.main.pessoas.*;

public class Utils {
	
	private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	private static ArrayList<Hospede> hospedes = new ArrayList<Hospede>();
	
	//Criando algum funcionario
	public static void criarFuncionario() {
		
		Funcionario funcionario = null;
		
		int index_funcionario =  View.solicitarInteiros("1 - Gerente\n"
				+ "2 - Recepcionista\n"
				+ "3 - Cozinheiro\n"
				+ "4 - Servicais\n"
				+ "5 - Porteiro\n", "Tipo funcionario",1, 5);
		
		
		String nome = View.solicitarMsg("Digite seu nome: ", "Funcionario");
		String titulo = "Funcionarios";
		
		switch (index_funcionario) {
		case 1:
			funcionario = new Gerente(nome, View.solicitarMsg("Crie sua senha: ", titulo));
			break;
		case 2:
			funcionario = new Recepcionista(nome);
			break;
		case 3:
			funcionario = new Cozinheiro(nome);
			break;
		case 4:
			funcionario = new Servicais(nome);
			break;
		case 5:
			funcionario = new Porteiro(nome);
		default:
			break;
		}
		
		funcionarios.add(funcionario);
		
	}
	
	//Criando hospede
	public static void criarHospede() {
		
		String nome = View.solicitarMsg("Digite o nome: ", "Hospedes");
		String cpf = View.solicitarMsg("Digite o CPF: ", "Hospedes");
		
		Hospede hospede = new Hospede(nome, cpf);
		
		hospedes.add(hospede);
	}

	public static ArrayList<Funcionario> getFuncionarios() throws IllegalArgumentException {
		
		if(funcionarios.size() == 0) {
			throw new IllegalArgumentException("Nenhum funcionario cadastrado");
		}
		
		return funcionarios;
	}

	public static ArrayList<Hospede> getHospedes() throws IllegalArgumentException {
		
		if(hospedes.size() == 0) {
			throw new IllegalArgumentException("Nenhum hospede cadastrado");
		}
		
		return hospedes;
	}
}

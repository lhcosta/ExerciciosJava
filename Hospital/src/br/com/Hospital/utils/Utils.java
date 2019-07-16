package br.com.Hospital.utils;
import java.util.ArrayList;

import br.com.Hospital.main.interfaces.SalaCirurgia;
import br.com.Hospital.main.pessoas.*;

public class Utils {
	
	private static ArrayList<Medico> medicos = new ArrayList<Medico>();
	private static ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
	
	public static void cadastrarMedico() {
		
		String nome = View.solicitarMsg("Digite o nome: ", "Medico");
		String crm = View.solicitarMsg("Digite o CRM: ", "Medico");
		Medico medico = null;
		
		int especialidade = View.solicitarInteiros("1 - Cirurgiao\n2 - Pediatra\n", "Especialidade", 1, 2);
		
		switch (especialidade) {
		case 1:
			medico = new Cirurgiao(nome, crm);
			break;
		case 2:
			medico = new Pediatra(nome, crm);
		default:
			break;
		}
		
		medicos.add(medico);
	}
	
	
	public static void cadastrarPaciente() {
		
		String nome = View.solicitarMsg("Digite o nome: ", "Paciente");
		int idade = View.solicitarInteiros("Digite a idade: ", "Paciente", 1, 100);
		
		Paciente paciente = new Paciente(nome, idade);
		pacientes.add(paciente);
	}


	public static ArrayList<Medico> getMedicos() {
		
		if(medicos.size() == 0) {
			throw new NullPointerException("Nenhum medico cadastrado");
		}
		
		return medicos;
	}

	public static ArrayList<Paciente> getPacientes() {
		
		if (pacientes.size() == 0) {
			throw new NullPointerException("Nenhum paciente cadastrado");
		}
		
		return pacientes;
	}
	
	public static ArrayList<SalaCirurgia> getSalaCirurgia(){
		
		ArrayList<SalaCirurgia> profissionais = new ArrayList<SalaCirurgia>();
		
		if (medicos.size() == 0) {
			throw new NullPointerException("Nenhum medico cadastrado");
		}
		
		for(Medico m : medicos) {
			if(m instanceof SalaCirurgia) {
				profissionais.add((SalaCirurgia)m);
			}
		}
		
		if(profissionais.size() == 0) {
			throw new NullPointerException("Ninguem possui acesso a Sala de Cirurgia");
		}
		
		return profissionais;
	}
	
}
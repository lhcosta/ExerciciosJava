package br.com.Hospital.utils;

import br.com.Hospital.main.interfaces.SalaCirurgia;
import br.com.Hospital.main.pessoas.*;

public class Menu {
	
	private static String nomeHospital = "Hospital UCB";
	
	//Menu Principal
	public static void principal() {
		
		int option = View.solicitarInteiros("1 - Medicos\n"
				+ "2 - Pacientes\n", nomeHospital, 1, 2);
		
		switch (option) {
		case 1:
			menuMedico();
			break;
		case 2:
			menuPaciente();
			break;
		default:
			break;
		}
	}
	
	//Menu de medicos
	private static void menuMedico() {
		
		boolean flag = false;
		
		do {
			
			try {
				
				int option = View.solicitarInteiros("1 - Cadastrar\n"
						+ "2 - Apresentar\n"
						+ "3 - Realizar Cirurgia\n", "Medicos", 1, 3);
				
				switch (option) {
				case 1:
					Utils.cadastrarMedico();
					break;
				case 2:
					
					try {
						
						String medicos = "";
						int i = 1;
						
						for(Medico m : Utils.getMedicos()) {
							medicos += i++ + " - " + m.toString() + "\n";
						}
						
						View.apresentarMsg(medicos, "Medicos");
						
					} catch (NullPointerException e) {
						// TODO: handle exception
						View.apresentarMsgErro(e.getMessage(), "Erro");
					}
					
					break;
				case 3:
					
					try {
						
						String cirurgioes = "";
						int i = 1;
						
						for(SalaCirurgia c : Utils.getSalaCirurgia()) {
							cirurgioes += i++ + " - " + c.toString();
						}
						
						int index = View.solicitarInteiros(cirurgioes, "Escolha o cirurgiao", 1, Utils.getSalaCirurgia().size());
						View.apresentarMsg(Utils.getSalaCirurgia().get(index-1).realizarCirurgia(), "Cirurgia");
						
					} catch (NullPointerException e) {
						// TODO: handle exception
						View.apresentarMsgErro(e.getLocalizedMessage(), "Erro");
					}
										
					break;
				default:
					break;
				}
				
			} catch (NullPointerException e) {
				// TODO: handle exception
				flag = true;
			}
			
		}while(!flag);
	}
	
	//Menu de pacientes
	private static void menuPaciente() {
		
		boolean flag = false;
		
		do {

			try {
				
				int option = View.solicitarInteiros("1 - Cadastrar\n"
						+ "2 - Apresentar\n","Pacientes", 1, 2);
				
				switch (option) {
				case 1:
					Utils.cadastrarPaciente();
					break;
					
				case 2:
					
					try {
						
						String pacientes = "";
						int i = 1;
						
						for(Paciente p : Utils.getPacientes()) {
							pacientes += i++ + " - " + p.toString() + "\n";
						}	
						
						View.apresentarMsg(pacientes, "Pacientes");
						
					} catch (NullPointerException e) {
						// TODO: handle exception
						View.apresentarMsgErro(e.getMessage(), "Erro");
					}
					
				default:
					break;
				}
				
			} catch (NullPointerException e) {
				// TODO: handle exception
				flag = true;
			}
			
		} while (!flag);
		
	}

}

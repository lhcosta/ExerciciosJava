package br.com.Hotel.utils;

import br.com.Hotel.main.interfaces.*;
import br.com.Hotel.main.pessoas.*;

public class Menu {
	
	private static String nomeHotel = "Hotel San Remy";
	
	//Menu Principal
	public static void principal() {
		
		boolean flag = true;
		
		View.apresentarMsg(nomeHotel, "Bem-vindo");
		
		do {
			
			try {
							
				int option = View.solicitarInteiros("1 - Funcionarios\n"
						+ "2 - Hospedes\n"
						+ "3 - Setores Hotel", nomeHotel, 1, 3);
				
				switch (option) {
				case 1:
					menuFuncionario();
					break;
				case 2:
					menuHospedes();
					break;
				case 3:
					menuSetorHotel();
					break;
				}
						
			} catch (NullPointerException e) {
				// TODO: handle exception
				flag = false;
			}
		} while (flag);
	}
	
	//Menu de Funcionarios
	private static void menuFuncionario() {
		
		
		try {
			
			int option = View.solicitarInteiros("1 - Apresentar Funcionarios\n"
					+ "2 - Cadastrar Funcionario\n", nomeHotel, 1, 2);
			
			switch (option) {
			case 1:
				
				String infoFuncionarios = "";
				int i = 1;
				
				for(Funcionario f : Utils.getFuncionarios()) {
					infoFuncionarios += i++ + " - "  + f.toString() + "\n";
				}
				
				View.apresentarMsg(infoFuncionarios, "Funcionarios");
				
				break;
			case 2:
				Utils.criarFuncionario();
				View.apresentarMsg("Funcionario criado com sucesso", nomeHotel);
				break;
			}
			
		} catch (IllegalArgumentException e) {
			View.apresentarMsgErro(e.getMessage(), "Error");
		
		} catch (NullPointerException e) {
			// TODO: handle exception
			return;
		}
	
	}
	
	//Menu de hospedes
	private static void menuHospedes() {
		
		
		try {
			
			int option = View.solicitarInteiros("1 - Apresentar hospedes\n"
					+ "2 - Cadastrar hospedes\n", nomeHotel, 1, 2);
			
			switch (option) {
			case 1:
					
				String infoHospedes = "";
				int i = 1;
				
				for(Hospede h : Utils.getHospedes()) {
					infoHospedes += i++ + " - " + h.toString() + "\n";
				}
				
				View.apresentarMsg(infoHospedes, nomeHotel);
				
				break;
			case 2:
				
				Utils.criarHospede();
				View.apresentarMsg("Hospede criado com sucesso", nomeHotel);
				break;
			}
		
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			View.apresentarMsgErro(e.getMessage(), "Error");
			
		} catch (NullPointerException e) {
			// TODO: handle exception
			
			return;
		}
	
	}
	
	//Menu areas do hotel
	//Apresentando os funcionarios que possuem accesso em cada setor
	
	private static void menuSetorHotel() {
		
		
		try {
			
			int option = View.solicitarInteiros("1 - Cozinha\n"
					+ "2 - Limpeza\n"
					+ "3 - Recepcao\n", nomeHotel, 1, 3);
			
			String info = "";
			int i = 1;
			boolean flag = true;
			
			switch (option) {
			case 1:
				
				for(Funcionario f : Utils.getFuncionarios()) {
					if (f instanceof Cozinha) {
						info += i++ + " - " + ((Cozinha) f).acessarCozinha() +  "\n";
						flag = false;
					}
					
					if(flag) {
						View.apresentarMsgErro("Nenhum funcionario com acesso a cozinha", nomeHotel);
					}else {
						View.apresentarMsg(info, nomeHotel);
					}
				}
				
				break;
			case 2:
				
				for(Funcionario f : Utils.getFuncionarios()) {
					if (f instanceof Limpeza) {
						info += i++ + " - " + ((Limpeza) f).acessarLimpeza() +  "\n";
						flag = false;
					}
					
					if(flag) {
						View.apresentarMsgErro("Nenhum funcionario com acesso a limpeza", nomeHotel);
					}else {
						View.apresentarMsg(info, nomeHotel);
					}
				}
				
				break;
			case 3:
				
				for(Funcionario f : Utils.getFuncionarios()) {
					if (f instanceof Recepcao) {
						info += i++ + " - " + ((Recepcao) f).acessarRecepcao() +  "\n";
						flag = false;
					}
					
					if(flag) {
						View.apresentarMsgErro("Nenhum funcionario com acesso a recepcao", nomeHotel);
					}else {
						View.apresentarMsg(info, nomeHotel);
					}
				}
				
				break;
			}
				
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			View.apresentarMsgErro(e.getMessage(), nomeHotel);
		} catch (NullPointerException e) {
			return;
		}
			
	}
}

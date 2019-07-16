package br.com.Hospital.main;

import br.com.Hospital.utils.Menu;

/*
 * UC17201125 - Lucas Henrique
 * 
 * Sistema consiste em auxiliar o registro de medicos e pacientes, tendo duas opcoes de especialidade
 * Cirurgiao e Pediatras, liberando a entrada de profissionais em salas de cirurgia que sao apenas
 * os cirurgioes no momento.
 */

public class Executer {
	public static void main(String[] args) {
		
		boolean flag = false;
		
		do {
			
			try {
				Menu.principal();
			} catch (NullPointerException e) {
				// TODO: handle exception
				flag = true;
			}
			
		} while (!flag);	
		
	}
}

package br.com.Hospital.main.pessoas;

import br.com.Hospital.main.interfaces.SalaCirurgia;

public class Cirurgiao extends Medico implements SalaCirurgia{

	public Cirurgiao(String nome, String CRM) {
		super(nome, CRM);
	}

	@Override
	public String toString() {
		return "Cirurgiao " + this.nome + " - CRM " + this.CRM ;
	}

	@Override
	public String realizarCirurgia() {
		// TODO Auto-generated method stud	
		return "Cirurgia realiza - Medico " + this.nome;
	}
}

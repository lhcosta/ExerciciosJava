package br.com.Hospital.main.pessoas;

public abstract class Medico extends Pessoa {
	
	protected String CRM;
	
	Medico(String nome, String CRM) {
		super(nome);
		setCRM(CRM);
	}

	public void setCRM(String CRM) {
		this.CRM = CRM;
	}
}

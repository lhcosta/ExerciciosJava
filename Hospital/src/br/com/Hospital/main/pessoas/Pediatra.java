package br.com.Hospital.main.pessoas;

public class Pediatra extends Medico {

	public Pediatra(String nome, String CRM) {
		super(nome, CRM);
	}

	@Override
	public String toString() {
		return "Pediatra " + this.nome + " - CRM " + this.CRM;
	}

}

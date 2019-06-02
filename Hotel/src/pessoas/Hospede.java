package pessoas;

public class Hospede extends Pessoa {

	public Hospede(String nome, String cpf) {
		super(nome);
		setCpf(cpf);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hospede - " + this.nome;
	}
	
	
	

}

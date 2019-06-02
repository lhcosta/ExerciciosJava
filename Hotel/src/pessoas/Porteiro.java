package pessoas;

public class Porteiro extends Funcionario{
	
	public Porteiro(String nome) {
		// TODO Auto-generated constructor stub
		super(nome);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Porteiro - " + this.nome;
	}
}


public class Reptil extends Animal {
	
	Reptil(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return super.emitirSom() + " mugindo";
	}

	@Override
	public String descricao() {
		// TODO Auto-generated method stub
		return super.descricao() + " reptil";
	}
	
	
	
}

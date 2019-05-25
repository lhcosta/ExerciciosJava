
public class Mamifero extends Animal{

	Mamifero(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return super.emitirSom() + " latido";
	}

	@Override
	public String descricao() {
		// TODO Auto-generated method stub
		return super.descricao() + " mamifero";
	}
	
	
	

}

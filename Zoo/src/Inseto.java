
public class Inseto extends Animal {

	Inseto(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return super.emitirSom() + " zunindo";
	}

	@Override
	public String descricao() {
		// TODO Auto-generated method stub
		return super.descricao() + " inseto";
	}
}

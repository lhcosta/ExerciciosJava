
public class Arquivo extends Setor {

	@Override
	public void acessar(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
		if (!(pessoa instanceof Gerente)) {
			throw new IllegalArgumentException("Apenas Gerentes tem acesso");
		}
		
	}
	

}

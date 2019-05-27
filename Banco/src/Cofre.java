
public class Cofre extends Setor {

	@Override
	public void acessar(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
		if(!(pessoa instanceof Diretor)) {
			throw new IllegalArgumentException("Apenas Diretos tem acesso");
		}
		
		
		
	}
	
	
	

}

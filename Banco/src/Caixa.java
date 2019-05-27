
public class Caixa extends Setor{

	@Override
	public void acessar(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
		
		if(!(pessoa instanceof Gerente || pessoa instanceof Funcionario)) {
			throw new IllegalArgumentException("Apenas Gerentes e Funcionarios possuem acesso ao Caixa");
		}
		
	}

}

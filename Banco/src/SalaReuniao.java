
public class SalaReuniao extends Setor {

	@Override
	public void acessar(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
		if(pessoa instanceof Cliente) {
			throw new IllegalArgumentException("Cliente nao possui acesso a sala de reuniao");
		}
		
		
		
	}

}


public class Executer {
	
	public static void main(String[] args) {
		//Pessoa p = new Pessoa(null, 0, 0);
		
		Gerente gerente = new Gerente("Lucas", 20, 1.75F);
		Porteiro porteiro = new Porteiro("Carlos", 40, 1.50F);
		
		
		Estacionamento.abrirCatraca(gerente);
	s	Estacionamento.abrirCatraca(porteiro);
		
	}

}

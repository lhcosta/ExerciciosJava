
public class Validation {

	//Criando validacao para dados em inteiro
	public static void validarInt(int valorMin, int valorMax, int valor) throws IllegalArgumentException {		
		
		if(valor < valorMin || valor > valorMax) {
			throw new IllegalArgumentException("VALOR INVALIDO");
		}
	}
	
	//Validacao de nomes
	public static void validarNome(String nome) throws IllegalArgumentException{
		if(nome.isEmpty()) {
			throw new IllegalArgumentException("NOME VAZIO");
		}
	}
	
	
	
	
	
}

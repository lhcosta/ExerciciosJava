
public class Validation {
	
	public static void validarInteiros(int valor, int valorMin, int valorMax) throws IllegalArgumentException {
		if(valor < valorMin || valor > valorMax) {
			throw new IllegalArgumentException("Valor invalido");
		}	
	}
	
	public static void validarTextos(String texto) throws IllegalArgumentException {
		if (texto.isEmpty()) {
			throw new IllegalArgumentException("Texto vazio");
		}
	}
	
}

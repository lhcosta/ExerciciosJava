import java.util.ArrayList;

public class Util {
	
	private static ArrayList<Animal> animais = new ArrayList<Animal>();
	
	public static void criarMamifero(String nome) {
		
		Mamifero m = new Mamifero(nome);
		animais.add(m);
	}
	
	public static void criarReptil(String nome) {
		
		Reptil r = new Reptil(nome);
		animais.add(r);
	}
	
	public static void criarInseto(String nome) {
		
		Inseto i = new Inseto(nome);
		animais.add(i);
	}
	

}

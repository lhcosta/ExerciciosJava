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
	
	
	public static void escolherAnimal() {
		
		int i = 1;
		int index_animal;
		String info = "";
		
		for (Animal a : animais) {
			info += i + " - " + a.getNome() + "\n";
			i++;
		}
		
		index_animal = View.solicitarDadosInteiro(info, "Escolha o animal", 1, animais.size());
		Animal animal = animais.get(index_animal-1);
		
		
		View.mensagemTexto(animal.descricao() + "\n"
				+ animal.emitirSom() + "\n", "Animal");
		
	}

}

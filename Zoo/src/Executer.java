
public class Executer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean flag = false;
		
		Util.criarMamifero("Macoy");
		Util.criarMamifero("Alazao");
		Util.criarMamifero("Miau");
		
		Util.criarReptil("Marcos");
		Util.criarReptil("Anaconda");
		Util.criarReptil("Tartaruga");
		
		Util.criarInseto("Mosca");
		Util.criarInseto("Vespa");
		Util.criarInseto("Formiga");
		
		
		do {
			
			try {
				Util.escolherAnimal();
			} catch (NullPointerException e) {
				flag = true;
			}
			
		} while (!flag);
		
		
	}

}

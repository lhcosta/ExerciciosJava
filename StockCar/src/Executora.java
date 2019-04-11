/*
 * Lucas Henrique - UC17201125
 * */

public class Executora {

	public static void main(String[] args) {
		
		Piloto massa = new Piloto("Massa", "Ferrari");
		Piloto marcos = new Piloto("Marcos", "BMW");
		Piloto carlos = new Piloto("Carlos", "Renault");
		Piloto piquet = new Piloto("Piquet", "Maclaren");
		Piloto fabio = new Piloto("Fabio", "Ferrari");
		
		Piloto[] pilotos = {massa,marcos,carlos,piquet,fabio};
		
		Campeonato f1 = new Campeonato("Stock Car - Etapa Sao Paulo");
		
		Corrida interlagos = new Corrida("Interlagos", pilotos,f1);
		Corrida italia = new Corrida("Italiani", pilotos,f1);
		Corrida alemanha = new Corrida("Alemanha", pilotos,f1);
		
		interlagos.getClassicacao();
		italia.getClassicacao();
		alemanha.getClassicacao();
	
		f1.classificacaoGeral();
		
		
		

	}

}

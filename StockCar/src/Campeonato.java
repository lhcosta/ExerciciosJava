import java.util.ArrayList;
import java.util.Collections;

public class Campeonato {
	
	//Atributos
	private String nome;
	private ArrayList<Piloto> pilotos = new ArrayList<>();
	private ArrayList<Corrida> corridas = new ArrayList<>();
	
	//Construtor -- Deve iniciar com o nome
	Campeonato(String nome){
		setNome(nome);	
	}
	

	//Get e Set
	public ArrayList<Piloto> getPilotos() {
		return pilotos;
	}

	public void setPilotos(ArrayList<Piloto> pilotos) {
		
		//Adiciona apenas quando piloto nao esta cadastrado no campeonato
		for(Piloto p : pilotos) {
			if(!this.pilotos.contains(p)) {
				this.pilotos.add(p);
			}
		}
	}
	
	public ArrayList<Corrida> getCorridas() {
		return corridas;
	}
	
	public boolean setCorridas(Corrida corrida) {
		if(corridas.size() > 3) {
			System.out.println("Campeonato apenas com 3 corridas no maximo");
			return false;
		}
		
		this.corridas.add(corrida);
		this.setPilotos(corrida.getPilotos());
		return true;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	//Apresenta classificacao do campeonato de acordo com a quantidade de vitorias dos pilotos
	public void classificacaoGeral() {
		
		//Ordenando por meio da quantidade de vitorias
		Collections.sort(this.pilotos, new Piloto(null, null));
		
		System.out.println("------Classificaçao " + this.nome + " ------\n");
		for(Piloto p : this.pilotos) {
			System.out.println("Nome -> " + p.getNome() + " --- Vitorias -> " + p.getQtdVitorias());
		}
		
	}
	
}

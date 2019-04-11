import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class Corrida {
	
	//Atributos
	private String nome;
	private ArrayList<Volta> voltas = new ArrayList<>();
	private ArrayList<Piloto> pilotos = new ArrayList<>();
	private ArrayList<Float> temposPilotos = new ArrayList<>();
	
	
	//Construtor
	Corrida(String nome, Piloto[] pilotos, Campeonato torneio){
		if(pilotos.length >= 5) {
			setNome(nome);
			setVoltas();
			setPilotos(pilotos);
			
			if(torneio.getCorridas().size() == 3) {
				System.out.println("Nao é possivel realizar mais corridas para este campeonato");
			}else {
				
				//Corrida só acontece se poder ser cadastrado no campeonato
				gerarCorrida();
				torneio.setCorridas(this);
			}
			
		}else {
			System.out.println("Minimo de 5 pilotos por corrida");
		}
	
	}

	//Get e Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Calcula a média de tempo de todas as voltas
	public float getTempoMedioVoltas() {
		float tempoTotal = 0;
		
		for(Volta v : voltas) {
			tempoTotal += v.getTempo();
		}
		
		return tempoTotal/voltas.size();
	}
	
	private void setPilotos(Piloto[] pilotos) {
		for(Piloto p : pilotos) {
			this.pilotos.add(p);
		}
	}

	public ArrayList<Piloto> getPilotos(){
		return this.pilotos;
	}
	
	// O método cria instancias de volta
	private void setVoltas() {
		int i = 0;
		
		//Setar de forma aleatoria um tempo quando instaciar as voltas
		int[] tempos = {300,550,650};
		Random valor = new Random();
		
		//Criando dez voltas
		while(i < 10) {
			int j = valor.nextInt(tempos.length);
			
			Volta v = new Volta(tempos[j]);
			voltas.add(v);
			i++;
		}
	}
	
	//Apresenta classificacao dos pilotos na corrida
	public void getClassicacao() {
		DecimalFormat num = new DecimalFormat("##.00");
		int i = 0;
		
		System.out.println("------ Corrida " + this.nome + " ------\n");
			
		for(Piloto p : this.pilotos) {
			System.out.println(i+1 + "° Lugar -> " + p.getNome() + " -> " + num.format(temposPilotos.get(i)) + " s");
			i++;
		}
		System.out.println();
	}
	
	// Gerando corrida e ordenando piloto por meio do tempo de volta
	private void gerarCorrida() {
		
		for(Piloto p : this.pilotos) {
			p.setTempoVolta(this);
			
			//Setando o tempo dos pilotos nesta corrida
			this.temposPilotos.add(p.getTempoCorrida());
		}
		
		this.pilotos.sort(null);
		this.temposPilotos.sort(null);
		
		//Atribuindo uma vitoria para o primeiro da lista
		this.pilotos.get(0).setQtdVitorias();
		
	}
	
}

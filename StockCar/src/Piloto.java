import java.util.Comparator;

public class Piloto implements Comparable<Piloto>, Comparator<Piloto>{
	
	//Atributos
	private String nome;
	private String nomeEquipe;
	private float tempoCorrida;
	private int qtdVitorias;
	
	//Construtor
	Piloto(String nome, String nomeEquipe){
		setNome(nome);
		setNomeEquipe(nomeEquipe);
	}
		
	//get e set
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNomeEquipe() {
		return nomeEquipe;
	}
	
	public void setNomeEquipe(String nomeEquipe) {
		this.nomeEquipe = nomeEquipe;
	}
	
	public float getTempoCorrida() {
		return tempoCorrida;
	}
	
	public int getQtdVitorias() {
		return this.qtdVitorias;
	}
	
	public void setQtdVitorias() {
		this.qtdVitorias++;
	}
	
	//Calcular o tempo medio de um piloto em uma corrida
	public void setTempoVolta(Corrida corrida) {
		float valorMin = corrida.getTempoMedioVoltas() - 100;
		float valorMax = corrida.getTempoMedioVoltas() + 100;
		
		//Variavel auxiliar para gerar numeros aleatorios
		float diferenca = (valorMax - valorMin);
		
		/* Math.random() gera numeros entre 0.0 e 1.0, dessa forma multiplico pela diferença
		 * entre valores min e max, somando com o menor valor possivel
		 * */
		
		this.tempoCorrida = valorMin + (float)(Math.random() * diferenca);
	}

	//Ordenando pilotos por meio do tempo de volta
	@Override
	public int compareTo(Piloto piloto) {
		return Float.compare(this.tempoCorrida, piloto.tempoCorrida);	
	}
	
	//Adicionando outra forma de ordenacao por meio de vitorias dos pilotos
	@Override
	public int compare(Piloto o1, Piloto o2) {
		return Integer.compare(o2.qtdVitorias, o1.qtdVitorias);
	}
	
	
}

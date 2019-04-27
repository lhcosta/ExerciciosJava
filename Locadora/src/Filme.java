
public class Filme {
	
	//Atributos
	private String nome;
	private int ano;
	private boolean isAlugado;
	
	//Construtor
	Filme (String nome, int ano){
		setNome(nome);
		setAno(ano);
	}
	
	//Metodos Acessores
	public boolean isAlugado() {
		return isAlugado;
	}
	
	public void setAlugado(boolean isAlugado) {
		this.isAlugado = isAlugado;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getAno() {
		return ano;
	}
	
	private void setNome(String nome) {
		this.nome = nome;
	}

	private void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
	

}

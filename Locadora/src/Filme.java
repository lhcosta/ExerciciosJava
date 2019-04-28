
public class Filme {
	
	//Atributos
	private String nome;
	private int ano;
	private int codigo = 0;
	private boolean isAlugado;
	private static int qtdFilmes = 0;
	
	//Construtor
	Filme (String nome, int ano) throws RuntimeException{
		if(qtdFilmes == 10) {
			throw new RuntimeException("NAO E POSSIVEL CADASTRAR MAIS FILMES");
		}
		
		setNome(nome);
		setAno(ano);
		this.codigo = ++qtdFilmes;
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
	
	public int getCodigo() {
		return codigo;
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

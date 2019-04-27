
public class Cliente {
	
	//Atributos
	private String nome;
	private int idade;
	private int codigo;
	private static int geradorCodigo = 0;

	//Construtor
	Cliente(String nome, int idade){
		setNome(nome);
		setIdade(idade);
		gerarCodigo();
	}
	
	//Metodos Acessores
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public int getCodigo() {
		return codigo;
	}

	private void gerarCodigo() {
		this.codigo = ++geradorCodigo;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private void setIdade(int idade) {
		this.idade = idade;
	}

}


public abstract class Pessoa {
	
	private String nome;
	private int idade;
	private float altura;
	
	Pessoa(String nome, int idade, float altura){
		setNome(nome);
		setIdade(idade);
		setAltura(altura);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
	
	
	
}

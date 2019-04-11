
public class Aluno {
	
	//Atributos
	private String nome;
	//Criar data de nascimento
	private String matricula;
	private static int geraMatricula = 0;
	
	
	
	//Construtor
	Aluno(String nome /*Falta data de nascimento*/){
		setNome(nome);
		geradorMatricula();
	}
	

	private void geradorMatricula() {
		geraMatricula++;
		this.matricula = ("UCB" + geraMatricula);
		
	}
	
	//Métodos Acessores
	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}
	
	
}

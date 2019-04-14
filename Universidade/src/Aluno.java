
public class Aluno {
	
	//Atributos
	private String nome;
	private String matricula;
	private Curso curso;
	private Turma turma;
	private static int geraMatricula = 0;
	
	
	//Construtor
	Aluno(String nome, Curso curso){
		setNome(nome);
		setCurso(curso);
		geradorMatricula();
	}
	

	private void geradorMatricula() {
		geraMatricula++;
		this.matricula = ("UCB" + geraMatricula);
		
	}
	
	//Métodos Acessores
	private void setNome(String nome) {
		this.nome = nome;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	
	//Informacoes sobre o aluno
	public String infoAluno() {
		String info = "";
		
		info += "MATRICULA -> " + this.matricula + "\n"
				+ "NOME -> " + this.nome + "\n"
				+ "CURSO -> " + this.curso.getNome() + "\n"
				+ "TURMA -> " + this.turma.getCodigoTurma() + "\n\n";
		
		return info;
	}
	
	
}

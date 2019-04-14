import java.util.ArrayList;

public class Curso {
	
	//Atributos
	private String nome;
	private ArrayList<Turma> turmas = new ArrayList<>();
	private int maxTurmas = 3;

	public Curso(String nome){
		setNome(nome);
		Util.criarTurmaCurso(this);
	}

	//Metodos Acessores
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Turma> getTurmas() {
		return turmas;
	}

	public boolean setTurmas(Turma turma) {
		if(this.turmas.size() == maxTurmas) {
			return false;
		}
		
		this.turmas.add(turma);
		return true;
	}
	
	//Realizando a inscricao de aluno em um curso e o alocando em uma turma
	public boolean inscreverAluno(Aluno aluno) {
		int qtdTurmas = this.turmas.size() - 1;
		int i = 0;
		
		//Verificando vagas nas turmas
		do {
			if(this.turmas.get(i).setAlunos(aluno)) {
				aluno.setTurma(this.turmas.get(i));
				return true;
			}else{
				i++;
			}
		}while(i < qtdTurmas);
		
		return false;
	}
	
	//Realizando desligamento de aluno
	public boolean desligarAluno(Aluno aluno) {
		
		int qtdTurmas = this.turmas.size() - 1;
		int i = 0;
		
		//Procurando aluno para desligamento
		do {
			if(this.turmas.get(i).getAlunos().contains(aluno)) {
				this.turmas.get(i).getAlunos().remove(aluno);
			}else{
				i++;
			}
		}while(i < qtdTurmas);
		
		return false;
		
		
	}
	
	//Retorna codigo das turmas de determinado curso
	public String getCodigoTurmas() {
		String info = "";
		int i = 1;
		
		for(Turma turma: this.turmas) {
			info += i + " - " + turma.getCodigoTurma() + "\n";
			i++;
		}
		
		info += "\n0 - RETORNAR\n";
		
		return info;
				
	}

	
}

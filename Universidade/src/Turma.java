import java.util.ArrayList;

public class Turma {
	private ArrayList<Aluno> alunos = new ArrayList<>();
	private Professor professor = null;
	private String codigoTurma;
	private static int geraCodigoTurma = 0;
	
	
	//Construtor
	Turma(){
		geradorCodigoTurma();
	}
	
	//Métodos Acessores
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	//Sobrecarga
	public boolean setAlunos(Aluno aluno) {
		if(this.alunos.size() == 5) {
			return false;
		}
		
		this.alunos.add(aluno);
		return true;
	}


	public Professor getProfessor() {
		return professor;
	}


	public void setProfessor(Professor teacher) {
		this.professor = teacher;
	}


	public String getCodigoTurma() {
		return codigoTurma;
	}
	
	//Setando o codigo da turma de forma automatica
	private void geradorCodigoTurma() {
		geraCodigoTurma++;
		this.codigoTurma = "TM00" + geraCodigoTurma;
	}
	
	//Informacoes da turma
	public String infoTurma() {
		
		String info = "";
		
		if(this.professor == null) {
			info += "NENHUM PROFESSOR CADASTRADO NA TURMA\n\n";
		}else {
			info += "PROFESSOR -> " + professor.getNome() + "\n\n";
		}
		
		if(this.alunos.size() == 0) {
			info += "NENHUM ALUNO CADASTRADO\n\n";
			return info;
		}
		
		for(Aluno aluno: this.alunos) {
			info += "MAT: " + aluno.getMatricula() + " --- NOME: " + aluno.getNome() + "\n";
		}
		
		return info;
	}
	
	
	
}

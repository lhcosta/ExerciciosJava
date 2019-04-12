import java.util.ArrayList;

public class Turma {
	private ArrayList<Aluno> alunos = new ArrayList<>();
	private Professor teacher;
	private String codigoTurma;
	private static int geraCodigoTurma = 0;
	
	
	Turma(Curso curso){
		geradorCodigoTurma();
		
		//Setando turma no curso
		curso.setTurmas(this);
	}

	
	//Métodos Acessores
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}


	public boolean setAlunos(Aluno[] alunos) {
		
		if(this.alunos.size() < 5 || alunos.length < 5) {
			return false;
		}
		
		for(Aluno aux : alunos) {
			this.alunos.add(aux);
		}
		
		return true;
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
		return teacher;
	}


	public void setProfessor(Professor teacher) {
		this.teacher = teacher;
	}


	public String getCodigoTurma() {
		return codigoTurma;
	}
	
	//Setando o codigo da turma de forma automatica
	private void geradorCodigoTurma() {
		geraCodigoTurma++;
		this.codigoTurma = "TM00" + geraCodigoTurma;
	}
	
	
	
	
	
}

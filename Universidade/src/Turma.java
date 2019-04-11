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


	public void setAlunos(Aluno[] alunos) {
		for(Aluno aux : alunos) {
			this.alunos.add(aux);
		}
	}
	
	//Sobrecarga
	public void setAlunos(Aluno aluno) {
		this.alunos.add(aluno);
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

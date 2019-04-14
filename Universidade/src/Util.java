import java.util.ArrayList;

public class Util {
	
	public static ArrayList<Curso> cursos = new ArrayList<>();
	
	//Transferencia de alunos
	public static boolean trasferirTurma(Aluno aluno, Turma newTurma) {
		if(newTurma.setAlunos(aluno)) {
			aluno.setTurma(newTurma);
			return true;
		}
		
		return false;
	}
	
	//Transferencia de professores
	public static void trasferirTurma(Professor professor, Turma newTurma) {
		newTurma.setProfessor(professor);
		professor.setTurma(newTurma);
	}
	
	//Criando turmas para curso
	public static boolean criarTurmaCurso(Curso curso) {
	
		Turma turma = new Turma();
		
		if(curso.setTurmas(turma)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	//Criando Curso
	public static void criarCurso(String nome) {
		
		Curso curso = new Curso(nome);
		cursos.add(curso);
	}
	
	//Retorna arraylist de cursos
	public static ArrayList<Curso> getCursos(){
		return cursos;
	}
	
	//Retorna nome do cursos em apenas uma string
	public static String getNomeCursos(){
		
		int i = 1;
		String nomesCursos = "";
		
		if(cursos.size() == 0) {
			return "0";
		}
		
		for(Curso c : cursos) {
			nomesCursos += i + " - " + c.getNome().toUpperCase() + "\n";
			i++;
			
		}
		
		nomesCursos += "\n0 - RETORNAR\n";
		
		return nomesCursos;
	}
	
	//Criando aluno
	public static boolean criarAluno(String nome, Curso curso){
		
		Aluno aluno = new Aluno(nome, curso);
		
		if(curso.inscreverAluno(aluno)) {
			return true;
		}
		
		return false;
	}
	
	//Funcao para localizar um aluno em uma turma
	public static Aluno localizarAluno (Curso curso, String matAluno) {
		
		Aluno aluno = null;
		
		for(Turma turma : curso.getTurmas()){
			for(Aluno a : turma.getAlunos()) {
				if(matAluno == a.getMatricula()) {
					aluno = a;
					break;
				}
			}
		}
		
		return aluno;
	}
	
	//Metodo para criar professor
	public static void criarProfessor(String nome, Curso curso) {
		Professor professor = new Professor(nome);
		
		for(Turma turma : curso.getTurmas()) {
			if(turma.getProfessor() == null) {
				turma.setProfessor(professor);
				professor.setTurma(turma);
				break;
			}
		}
	}
	
	//Metodo para localizar turma professor
	public static Professor localizarProfessor(String nome, Curso curso) {
		
		for(Turma turma: curso.getTurmas()) {
			if(turma.getProfessor() == null) {
				continue;
			}else if (turma.getProfessor().getNome().equalsIgnoreCase(nome)){
				return turma.getProfessor();
			}
		}
		
		return null;
		
	}
	
	
	
	
}

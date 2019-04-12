import java.util.ArrayList;

public class Curso {
	
	//Atributos
	private String nome;
	private ArrayList<Turma> turmas = new ArrayList<>();
	
	
	Curso(String nome){
		setNome(nome);
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
		if(this.turmas.size() == 3) {
			return false;
		}
		
		this.turmas.add(turma);
		return true;
	}
	
	
	
	
	
}

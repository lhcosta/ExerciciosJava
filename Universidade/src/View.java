import javax.swing.JOptionPane;

public class View {
	
	
	//Apresentar Msg
	public static void showMessage(String msg, String title) {
		JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
	}
	
	//Solicitando dados em texto
	public static String solicitarDadosTexto(String options, String title) {
		String result = JOptionPane.showInputDialog(null, options, title, JOptionPane.INFORMATION_MESSAGE); 
		return result;
	}

	//Solicitando dados em inteiro
	public static int solicitarDadosInt(String options, String title) {
		String result = JOptionPane.showInputDialog(null, options, title, JOptionPane.INFORMATION_MESSAGE); 
		return Integer.parseInt(result);
	}
	
	//Mensagem de Erro
	public static void showMessageError(String msg, String title) {
		JOptionPane.showMessageDialog(null, msg, title, JOptionPane.ERROR_MESSAGE);
	}
	
	
	
	//Menu Principal
	public static void menuPrincipal(String nomeUniversidade) {
		String options = "1 - CURSOS\n" + "2 - PROFESSORES\n" + "3 - ALUNOS\n" + "4 - ENCERRAR\n\n";
		int result;
	
		do {

			result = solicitarDadosInt(options, nomeUniversidade);
			
			switch (result) {
				case 1:
					menuCurso(nomeUniversidade);
					break;
				case 2:
					menuProfessor(nomeUniversidade);
					break;
				case 3:
					menuAlunos(nomeUniversidade);
					break;
				case 4:
					result = 0;
					break;
				
				default:
					View.showMessageError("OPCAO INVALIDA", nomeUniversidade);
					result = -1;
				}
		} while (result != 0);
	}
	
	
	//Menu Alunos
	private static void menuAlunos(String nomeUniversidade) {
		
		String options = "1 - CADASTRAR ALUNO\n" + "2 - SELECIONAR ALUNO\n" + "3 - TRANSFERIR ALUNO\n" + "4 - RETORNAR\n\n";
		int result;
		
		if(Util.getCursos().size() == 0) {
			showMessageError("NENHUM CURSO CADASTRADO, CADASTRE UM CURSO", nomeUniversidade);
			return;
		}
		
		String nomesCursos = Util.getNomeCursos(); 
		
		do {
			result = solicitarDadosInt(options, nomeUniversidade);
			
			switch (result) {
				case 1:
					String nome = solicitarDadosTexto("DIGITE SEU NOME\n", "CADASTRO ALUNO").toUpperCase();
					int indiceCurso = solicitarDadosInt(nomesCursos, "SELECIONE O CURSO");
					
					if(indiceCurso > Util.getCursos().size() || indiceCurso == 0) {
						showMessageError("OPCAO INVALIDA -> CASO O CURSO NAO ESTEJA AQUI CRIE-O", "CURSOS");
					}else {
						Util.criarAluno(nome, Util.getCursos().get(indiceCurso-1));
						showMessage("ALUNO CADASTRADO COM SUCESSO", nomeUniversidade);
					}
					
					break;
				case 2:
					String matricula = solicitarDadosTexto("DIGITE SUA MATRICULA\n", "INFO ALUNO").toUpperCase();
					int indiceCurso2 = solicitarDadosInt(nomesCursos, "SELECIONE O CURSO");
					Curso curso = Util.getCursos().get(indiceCurso2-1);
					
					if(indiceCurso2 > Util.getCursos().size() || indiceCurso2 == 0) {
						showMessageError("OPCAO INVALIDA", "CURSOS");
					}else {
						Aluno aluno = Util.localizarAluno(curso, matricula);
						
						if(aluno == null) {
							showMessageError("ALUNO NAO ENCOTRADO", nomeUniversidade);
						}else {
							showMessage(aluno.infoAluno(), "ALUNO");
						}	
					}
					break;
					
				case 3:
					String matricula3 = solicitarDadosTexto("DIGITE SUA MATRICULA\n", "TRANSFERENCIA ALUNO");
					int indiceCurso3 = solicitarDadosInt(nomesCursos, "SELECIONE O CURSO");
					
					if(indiceCurso3 > Util.getCursos().size() || indiceCurso3 == 0) {
						showMessageError("OPCAO INVALIDA", "CURSOS");
						break;
					}
					
					Curso cursoAux = Util.getCursos().get(indiceCurso3-1);
					Aluno aluno1 = Util.localizarAluno(cursoAux, matricula3);
					
					if(aluno1 == null) {
						showMessageError("ALUNO NAO ENCOTRADO", nomeUniversidade);
						break;
					}
							
					int indiceTurma = solicitarDadosInt(Util.getCursos().get(indiceCurso3-1).getCodigoTurmas() + "\n", "SELECIONE A NOVA TURMA");
					
					if(indiceTurma > cursoAux.getTurmas().size() || indiceTurma == 0) {
						showMessageError("TURMA INVALIDA", nomeUniversidade);
						break;
					}
					
					if(Util.trasferirTurma(aluno1, cursoAux.getTurmas().get(indiceTurma-1))) {
						showMessage("ALUNO TRANSFERIDO COM SUCESSO", nomeUniversidade);
					}else {
						showMessageError("ERRO NA TRANSFERENCIA", nomeUniversidade);
					}
					
					break;
				case 4:
					result = 0;
					break;
				default:
					showMessageError("OPCAO INVALIDA", nomeUniversidade);
					
				}
		} while (result!=0);
		
		
	}
	
	
	//Menu Professor
	private static void menuProfessor(String nomeUniversidade) {
		
		String options = "1 - CADASTRAR PROFESSOR\n" + "2 - TRANSFERIR PROFESSOR\n" + "3 - RETORNAR\n\n";
		int result;
		
		if(Util.getCursos().size() == 0) {
			showMessageError("NENHUM CURSO CADASTRADO, CADASTRE UM CURSO", nomeUniversidade);
			return;
		}
		
		String nomesCursos = Util.getNomeCursos(); 
		
		do {
			result = solicitarDadosInt(options, nomeUniversidade);
			
			switch (result) {
				case 1:
					String nome = solicitarDadosTexto("DIGITE SEU NOME\n", "CADASTRO PROFESSOR").toUpperCase();
					int indiceCurso = solicitarDadosInt(nomesCursos, "SELECIONE O CURSO");
					
					if(indiceCurso > Util.getCursos().size()) {
						showMessageError("OPCAO INVALIDA -> CASO O CURSO NAO ESTEJA AQUI CRIE-O", "CURSOS");
					}else if(indiceCurso == 0) {
						return;
					}else{
						Util.criarProfessor(nome,Util.getCursos().get(indiceCurso-1));
						showMessage("PROFESSOR CADASTRADO COM SUCESSO", nomeUniversidade);
					}
					
					break;
				
				case 2:
					String nomeProfessor = solicitarDadosTexto("DIGITE SEU NOME\n", "TRANSFERENCIA PROFESSOR");
					int indiceCurso3 = solicitarDadosInt(nomesCursos, "SELECIONE O CURSO");
					
					if(indiceCurso3 > Util.getCursos().size()) {
						showMessageError("OPCAO INVALIDA", "CURSOS");
					}else if(indiceCurso3 == 0) {
						return;
					}else {
						
						Curso cursoAux = Util.getCursos().get(indiceCurso3-1);
						Professor professor = Util.localizarProfessor(nomeProfessor, cursoAux);
						
						if(professor == null) {
							showMessageError("PROFESSOR NAO ENCONTRADO", nomeUniversidade);
							return;
						}
						
						int indiceNewTurma =  solicitarDadosInt(cursoAux.getCodigoTurmas(), "SELECIONE A NOVA TURMA\n");
						
						if(indiceNewTurma > cursoAux.getTurmas().size()) {
							showMessageError("OPCAO INVALIDA", "TURMAS");
						}else if(indiceNewTurma == 0) {
							return;
						}else if(cursoAux.getTurmas().get(indiceNewTurma-1).equals(professor.getTurma())) {
							showMessageError("NAO E POSSIVEL ESCOLHER A MESMA TURMA", "TURMAS");
							return;
						}else{
							Util.trasferirTurma(professor, cursoAux.getTurmas().get(indiceNewTurma-1));
							showMessage("PROFESSOR TRANSFERIDO COM SUCESSO", nomeUniversidade);
						}
					}
					
					break;
				case 3:
					result = 0;
					break;
				default:
					showMessageError("OPCAO INVALIDA", nomeUniversidade);
					break;
				}
		} while (result!=0);

	}

	//Menu curso
	private static void menuCurso(String nomeUniversidade) {

		String options = "1 - CADASTRAR CURSO\n" + "2 - APRESENTAR CURSOS\n" + "3 - RETORNAR\n\n";
		int result;
		
		do {
			
			result = View.solicitarDadosInt(options, nomeUniversidade);
			
			switch(result) { 
				case 1:
					String aux = View.solicitarDadosTexto("DIGITE O NOME DO CURSO", nomeUniversidade);
					Util.criarCurso(aux);
					break;
				case 2:
					String nomes = Util.getNomeCursos();
					int indiceCurso;
					
					if(nomes == "0") {
						View.showMessageError("NENHUM CURSO CADASTRADO", "CURSOS");
					}else {
						indiceCurso = View.solicitarDadosInt(nomes, "CURSOS");
						
						if(indiceCurso > Util.getCursos().size()) {
							showMessageError("OPCAO INVALIDA", "CURSOS");
						}else if(indiceCurso == 0) {
							result = -1;
						}else {
							menuTurma(indiceCurso-1);
						}
					}
					
					break;
				case 3:
					result = 0;
					break;
				default:
					showMessageError("OPCAO INVALIDA", nomeUniversidade);
			}
			
		}while(result != 0);
	}
	
	//Menu de turma
	private static void menuTurma(int indiceCurso) {
		
		String options = "1 - CRIAR TURMA\n" + "2 - APRESENTAR TURMAS\n" + "3 - RETORNAR\n\n";
		Curso curso = Util.getCursos().get(indiceCurso);
		
		int result;
		
		
		do {
			
			result = solicitarDadosInt(options, "TURMAS");
			
			switch(result) {
				case 1:
					if(Util.criarTurmaCurso(curso)) {
						showMessage("TURMA CRIADA COM SUCESSO", "CADASTRO TURMA");
					}else {
						showMessageError("CURSO JA ATINGIU O LIMITE DE TURMAS", "CADASTRO TURMA");
					}
					break;
				case 2:
					String turmas = curso.getCodigoTurmas();
					int indiceTurma = solicitarDadosInt(turmas, "TURMAS");
					
					
					if(indiceTurma > curso.getTurmas().size()) {
						View.showMessageError("OPCAO INVALIDA", "TURMAS");
						return;
					}else if(indiceTurma == 0) {
						result = -1;
						
					}else {
						Turma turma = curso.getTurmas().get(indiceTurma-1);
						View.showMessage(turma.infoTurma(), turma.getCodigoTurma());
					}
				
					break;
				case 3:
					result = 0;
					break;
				default:
					result = -1;
					View.showMessageError("OPCAO INVALIDA", "TURMAS");
					
			}
		}while(result != 0);	
		
	}
	
}

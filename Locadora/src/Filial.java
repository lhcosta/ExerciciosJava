import java.util.ArrayList;

public class Filial{
	
	//Atributos
	private ArrayList<Funcionario> funcionarios = new ArrayList<>();
	private ArrayList<Locacao> locacoes = new ArrayList<>();
	private String nome;
	private static int qtdFiliais = 0;
	
	Filial(String nome) throws RuntimeException{
		if(qtdFiliais == 3) { 
			throw new RuntimeException(); 
		}
		
		setNome(nome);
		qtdFiliais++;
	}
	
	//Metodos acessores
	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	
	public void setFuncionarios(Funcionario funcionario) throws RuntimeException{
		if(funcionarios.size() == 2) {
			throw new RuntimeException("NAO E POSSIVEL CADASTRAR MAIS FUNCIONARIOS");
		}
		
		funcionarios.add(funcionario);
	}
	
	public ArrayList<Locacao> getLocacoes() {
		return locacoes;
	}
	
	public void setLocacao(Locacao locacao) {
		this.locacoes.add(locacao);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Retorna nome dos funcionarios
	public String getNomesFuncionarios() throws RuntimeException{
		
		String nomes = "";
		int i = 1;
		
		if(funcionarios.size() == 0) {
			throw new RuntimeException("NENHUM FUNCIONARIO CADASTRADO! CADASTRE UM FUNCIONARIO");
		}
		
		for(Funcionario f : funcionarios) {
			nomes += "FUNCIONARIO " + i + " - " + f.getNome().toUpperCase() + "\n";
			i++;
		}
		
		return nomes;
	}
	
	//Retorna info das locacoes
	public String getInfoLocacoes() {
		
		String info = "";
	
		if(locacoes.size() == 0) {
			return "NENHUMA LOCACAO REALIZADA!";
		}
		
		for(Locacao l : locacoes) {
			info += l.getInfo() + "\n";
		}
		
		return info;
	}
	
	
}

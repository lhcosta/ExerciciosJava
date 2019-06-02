package pessoas;

public abstract class Funcionario extends Pessoa{
	
	protected double salario;
	protected int faltas;
	protected int tempoEmpresa;
	protected int cargaHoraria;
	
	Funcionario(String nome) {
		super(nome);
	}
}

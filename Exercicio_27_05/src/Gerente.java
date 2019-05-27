
public class Gerente extends Funcionario implements SabeEstacionar {
	
	private int senhaCaixa;
	
	Gerente(String nome, int idade, float altura) {
		super(nome, idade, altura);
	}

	public int getSenhaCaixa() {
		return senhaCaixa;
	}

	public void setSenhaCaixa(int senhaCaixa) {
		this.senhaCaixa = senhaCaixa;
	}

	@Override
	void passarCatraca() {
		// TODO Auto-generated method stub
		
		System.out.println("Bem-Vindo Gerente");
	}

	@Override
	public void estacionar() {
		// TODO Auto-generated method stub
		System.out.println("O gerente sabe estacionar");
		
	}
	
	
	
	
}

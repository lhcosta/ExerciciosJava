
public class ContaCorrente extends Conta {
	
	private double creditoEspecial;

	ContaCorrente(int num) {
		super(num);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return super.getSaldo() + this.creditoEspecial;
	}


	public double getCreditoEspecial() {
		return creditoEspecial;
	}


	public void setCreditoEspecial(double creditoEspecial) {
		this.creditoEspecial = creditoEspecial;
	}
	
	
	
	
	
	
}


public class Conta {
	
	private int num;
	private double saldo;
	
	Conta(int num){
		setNum(num);
	}
	
	
	public void depositar(double valor) throws IllegalArgumentException {
		
		if (valor <= 0 ) {
			throw new IllegalArgumentException("Deposite valores superiores a zero");
		}
		
		this.saldo += valor;
	}
	
	private void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
	
	
	
	
	
	
}

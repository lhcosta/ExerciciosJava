
public class Util {
	
	//Criando um cliente
	public static Cliente criarCliente(String nome, int idade) {
		
		Cliente c = new Cliente(nome, idade);
		return c;
	}
	
	//Criando um funcionario
	public static Funcionario criarFuncionario(String nome, int idade) {
		Funcionario f = new Funcionario(nome, idade);
		return f;
	}
	
	
	
}

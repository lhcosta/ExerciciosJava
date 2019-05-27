
public abstract class Pessoa {
	
	private String login;
	private int senha = 1234;
	
	
	Pessoa (String login){
		setLogin(login);
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public int getSenha() {
		return senha;
	}
	
	
	
	

}

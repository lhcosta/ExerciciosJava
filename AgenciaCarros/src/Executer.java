import javax.swing.UIManager;

public class Executer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Alterar o nome do botao cancelar para voltar
		UIManager.put("OptionPane.cancelButtonText", "VOLTAR");
		
		Menu.menuInicial();
		
	}

}

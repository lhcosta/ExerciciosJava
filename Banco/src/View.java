import javax.swing.JOptionPane;

public class View {
	
	//Solicitando dados em textos
	public static String solicitarDados(String message, String title) {
		String result = null;
		boolean flag = false;
		
	
		do {
			try {
			
				result = JOptionPane.showInputDialog(null, message.toUpperCase(), title.toUpperCase(), JOptionPane.QUESTION_MESSAGE);
				
				 //Quando for selecionado o botao cancelar
				 if(result == null) {
					 throw new NullPointerException();
				 }
				 
				Validation.validarNome(result);
				flag = true;
				
			} catch (IllegalArgumentException e) {
				mensagemErro(e.getMessage(),"ERROR");
			}
			
		}while(!flag);
		
		
		return result;
		
	}
	
	
	//Solicitando dados em inteiro
	public static int solicitarDadosInteiro(String message, String title, int valorMin, int valorMax) throws NullPointerException {
		
		String result = null;
		boolean flag = false;
		
		do {
			
			try {
				 result = JOptionPane.showInputDialog(null, message.toUpperCase(), title.toUpperCase(), JOptionPane.QUESTION_MESSAGE);
				 
				 //Quando for selecionado o botao cancelar
				 if(result == null) {
					 throw new NullPointerException();
				 }
				 
				 Validation.validarInt(valorMin, valorMax, Integer.parseInt(result));
				 flag = true;
				 
			} catch (IllegalArgumentException e) {
				mensagemErro(e.getMessage(),"ERROR");
			}
			
		} while (!flag);
		
		
		return Integer.parseInt(result);
	}
	
	//Apresentando mensagem de erro 
	public static void mensagemErro(String message, String title) {
		
		JOptionPane.showMessageDialog(null, message.toUpperCase(), title.toUpperCase() ,JOptionPane.ERROR_MESSAGE);
	}
	
	//Mensagem de texto
	public static void mensagemTexto(String message, String title) {
		
		JOptionPane.showMessageDialog(null, message.toUpperCase(), title.toUpperCase(), JOptionPane.INFORMATION_MESSAGE);
	}
		

}

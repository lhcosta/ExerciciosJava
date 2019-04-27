import javax.swing.JOptionPane;

public class View {
	
	//Solicitando dados em textos
	public static String solicitarDados(String message, String title) {
		
		String result = JOptionPane.showInputDialog(null, message, title, JOptionPane.DEFAULT_OPTION);
		
		return result;
	}
	
	//Solicitando dados em inteiro
	public static int solicitarDadosInteiro(String message, String title) {
		
		String result = JOptionPane.showInputDialog(null, message, title, JOptionPane.DEFAULT_OPTION);
		
		return Integer.parseInt(result);
	}
	
	//Apresentando mensagem de erro 
	public static void mensagemErro(String message, String title) {
		
		JOptionPane.showMessageDialog(null, message, title ,JOptionPane.ERROR_MESSAGE);
	}
	
	//Mensagem de texto
	public static void mensagemTexto(String message, String title) {
		
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
	}
	
	
}

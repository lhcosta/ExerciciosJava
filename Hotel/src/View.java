import javax.swing.JOptionPane;

public class View {
	
	//Solicitando dados em texto
	public static String solicitarMsg (String texto, String titulo) throws NullPointerException {
		
		boolean flag = true;
		String result = null;
		
		do {
			
			try {
				
				 result = JOptionPane.showInputDialog(null, texto.toUpperCase(), titulo.toUpperCase(), JOptionPane.QUESTION_MESSAGE);
				 
				 if(result == null) {
					 throw new NullPointerException();
				 }
				 
				 Validation.validarTextos(result);
				 flag = false;
				 
				 return result;
				
			} catch (IllegalArgumentException e) {
				// TODO: handle exception
				View.apresentarMsgErro(e.getMessage(), "Erro");
			} 
			
		} while (flag);
		
		 return result;
		
	}
	
	
	//Solicitando dados em inteiro
	public static int solicitarInteiros (String texto, String titulo, int valorMin, int valorMax) throws NullPointerException{
		
		String result = null;
		boolean flag = true;
		
		do {
			
			try {
				
				result = JOptionPane.showInputDialog(null, texto.toUpperCase(), titulo.toUpperCase(), JOptionPane.QUESTION_MESSAGE);
				
				if(result == null) {
					throw new NullPointerException();
				}
				
				Validation.validarInteiros(Integer.parseInt(result), valorMin, valorMax);
				flag = false;
				
			} catch (IllegalArgumentException e) {
				// TODO: handle exception
				View.apresentarMsgErro(e.getMessage(), "Erro");
			}
			
		} while (flag);
		
		return Integer.parseInt(result);
	}
	
	//Apresentado mensagem de texto
	public static void apresentarMsg(String texto, String titulo) {
		JOptionPane.showConfirmDialog(null, texto.toUpperCase(), titulo.toUpperCase(), JOptionPane.DEFAULT_OPTION);
	}
	
	//Apresentando mensagem de erro
	public static void apresentarMsgErro(String texto, String titulo) {
		JOptionPane.showConfirmDialog(null, texto.toUpperCase(), titulo.toUpperCase(), JOptionPane.ERROR_MESSAGE);
	}
	
}

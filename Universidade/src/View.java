import javax.swing.JOptionPane;

public class View {
	
	
	//Apresentar Msg
	public static void showMessage(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public static String showMenu(String[] options, String title) {
		
		String result = JOptionPane.showInputDialog(null, options, title); 
		
		return result;
	}
	
	
	
}

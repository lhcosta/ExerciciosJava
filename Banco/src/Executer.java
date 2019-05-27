
public class Executer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		boolean flag = false;
		
		do {
			
			try {
				Menu.principal();
			} catch (NullPointerException e) {
				// TODO: handle exception
				flag = true;
			}
			
		} while (!flag);
	}

}

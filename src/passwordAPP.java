import javax.swing.JOptionPane;
public class passwordAPP {

	public static void main(String[] args) {
		
		//Contrase�a correcta
		String contrase�a="bingo";
		//Variable que nos controla que cambie la condidion en caso de acierto
		
		boolean acierto=false;
		//Pedimos contrase�a
		
		String password;
		for (int i=0;i<3&&!acierto;i++) {
			password=JOptionPane.showInputDialog("Introduce la contrase�a");
			
			//Comprovamos
			if(password.equals(contrase�a)) {
				JOptionPane.showMessageDialog(null, "Enhorabuena");
				acierto=true;	
			}else {
				JOptionPane.showMessageDialog(null, "La contrase�a introducida es incorrecta");
			}
		}
	}
}

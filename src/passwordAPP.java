import javax.swing.JOptionPane;
public class passwordAPP {

	public static void main(String[] args) {
		
		//Contraseña correcta
		String contraseña="bingo";
		//Variable que nos controla que cambie la condidion en caso de acierto
		
		boolean acierto=false;
		//Pedimos contraseña
		
		String password;
		for (int i=0;i<3&&!acierto;i++) {
			password=JOptionPane.showInputDialog("Introduce la contraseña");
			
			//Comprovamos
			if(password.equals(contraseña)) {
				JOptionPane.showMessageDialog(null, "Enhorabuena");
				acierto=true;	
			}else {
				JOptionPane.showMessageDialog(null, "La contraseña introducida es incorrecta");
			}
		}
	}
}

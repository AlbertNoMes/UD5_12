import javax.swing.JOptionPane;
public class passwordAPP {

	public static void main(String[] args) {
		
		//Contraseņa correcta
		String contraseņa="bingo";
		//Variable que nos controla que cambie la condidion en caso de acierto
		
		boolean acierto=false;
		//Pedimos contraseņa
		
		String password;
		for (int i=0;i<3&&!acierto;i++) {
			password=JOptionPane.showInputDialog("Introduce la contraseņa");
			
			//Comprovamos
			if(password.equals(contraseņa)) {
				JOptionPane.showMessageDialog(null, "Enhorabuena");
				acierto=true;	
			}else {
				JOptionPane.showMessageDialog(null, "La contraseņa introducida es incorrecta");
			}
		}
	}
}

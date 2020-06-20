import javax.swing.*;
public class AccesoAplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String clave= "Sebas";
	String pass= "";
	
	while (clave.equals(pass)==false) 
	{
		
		pass= JOptionPane.showInputDialog("Introduce tu password, por favor");
		
		if (clave.contentEquals(pass)== false) 
		{
			
			System.out.println("Password incorrecto");
		}
	
		
		
	}
	
	System.out.println("Password correcto, acceso permitido");
	

	}

}

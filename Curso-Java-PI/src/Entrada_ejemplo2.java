import javax.swing.*;
public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre por favor");
		String edad = JOptionPane.showInputDialog("Intorduce la edad, por favor");
		int edad_usuario = Integer.parseInt(edad);
		System.out.println("Hola " + nombre_usuario + ". El ano que viene tendras " + (edad_usuario + 1 ) + " anos");
		
	}

}

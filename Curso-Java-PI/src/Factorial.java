import javax.swing.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Long resultado = 1L;
		int numero= Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero, por favor"));
		
		for(int i = numero; i>0; i--) {
			resultado=resultado*i;
		}
		
		System.out.println("El factorial del numero " + numero + " es igual a " + resultado );
	}                                

}

import javax.swing.*;
public class PesoIdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String genero= "";
		
		do {
			
			genero=JOptionPane.showInputDialog("Introduce tu genero, por favor.(Hombre o Mujer)");
		
			} while(genero.equalsIgnoreCase("Hombre")== false && genero.equalsIgnoreCase("Mujer")== false); 
			  
			int altura= Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
			int peso_ideal= 0;
			
			if (genero.equalsIgnoreCase("Hombre")){
				
				peso_ideal = altura - 110;
			}
			
			else if (genero.equalsIgnoreCase("Mujer")) {
				
				peso_ideal = altura - 120;
			}
			
			System.out.println("Tu peso ideal de acuerdo a tu altura es " + peso_ideal + " kg");
		
		
	}
	

}

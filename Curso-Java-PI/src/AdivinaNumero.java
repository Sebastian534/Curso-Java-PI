import java.util.*;
public class AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio= (int)(Math.random()*100);
		
		Scanner entrada= new Scanner(System.in);
		
		int numero=0;
		int intentos=0;
		
		while (aleatorio != numero) {
			
			intentos++;
			System.out.println("Introduce un numero, por favor");
			
			numero= entrada.nextInt();
			
			if(aleatorio<numero) {
				
				System.out.println("Mas bajo, por favor");
				
			}
			else if(aleatorio>numero) {
				
				System.out.println("Mas alto, por favor");
				
			}
			
		}
		System.out.println("Correcto, lo has conseguido en " + intentos + " intentos");
		

	}

}

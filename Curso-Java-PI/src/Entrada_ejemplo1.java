import java.util.*;
public class Entrada_ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe tu nombre, por favor ");
		
		String nombre_usuario = entrada.nextLine();
		System.out.println("Introduce tu edad, por favor");
		
		int edad = entrada.nextInt();
		
		System.out.println("Hola " + nombre_usuario + ". El proximo año tendras " + (edad + 1 ) + " años" );

	}

}

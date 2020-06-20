package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona[] lasPersonas = new Persona [2];
		
		lasPersonas [0] = new Empleado2 ("Luis Conde", 5000, 2009, 02, 25);
		lasPersonas [1] = new Alumno ("Ana Lopez", "Biologicas");
		
		for(Persona p: lasPersonas) {
			
			System.out.println(p.damenombre() + ", " + p.dameDescripcion());
		}
				

	}

}

abstract class Persona {
	
	
	public Persona (String nom) {
		
		nombre = nom;
	}
	
	public String damenombre() {
		
		return nombre;
	}
	
	public abstract String dameDescripcion();
			
	private String nombre;
}


class Empleado2 extends Persona {
	 
	public Empleado2(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom);
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		AltaContrato = calendario.getTime();
		++IdSiguiente;
		Id = IdSiguiente; 
		
		 
	}
			
	public String dameDescripcion() {
		
		return "Este empleado tiene un Id= " + Id +  " con un sueldo= " + sueldo;
	}
	
	public double dameSueldo() { //GETTER
		
		return sueldo;
	}
	
	public Date dameFechaContrato() { //GETTER
		
		return AltaContrato;
	}
	
	public void subeSueldo(double porcentaje) { //SETTER
		
		double aumento = sueldo * porcentaje/100; 
			
		sueldo += aumento;
	}
	
	private double sueldo;
	private Date AltaContrato;
	private static int IdSiguiente;
	private int Id;
	
}

class Alumno extends Persona {
	
	public Alumno(String nom, String car ) {
		
		super (nom);
		carrera = car;
		
	}
	
	public String dameDescripcion( ) {
		
		return "Este alumno esta estudiando la carrera de " +  carrera;
	}
	
	private String carrera;
}












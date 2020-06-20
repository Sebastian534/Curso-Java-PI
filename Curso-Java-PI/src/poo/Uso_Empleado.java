package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Jefatura jefe_RRHH = new Jefatura("Sebastian", 55000, 2006, 9, 25);
		
		jefe_RRHH.estableceIncentivo(2570);	
		
		Empleado [] misEmpleados = new Empleado [6];
		
		misEmpleados [0] = new Empleado ("Carlos", 85000, 1990, 12, 17);
		misEmpleados [1] = new Empleado ("Paquita", 95000, 1995, 6, 2);
		misEmpleados [2] = new Empleado ("Maria", 105000, 2002, 3, 2);
		misEmpleados [3] = new Empleado ("Antonio Fernandez");
		misEmpleados [4] = jefe_RRHH; //Polimorfismo en accion. Principio de susticion 
		misEmpleados [5] = new Jefatura ("Maria", 95000, 1999, 5, 26);
		
		Jefatura jefa_Finanzas = (Jefatura) misEmpleados[5];
		jefa_Finanzas.estableceIncentivo(55000);
		
		
				
		
		for(Empleado e: misEmpleados) {
			
			e.subeSueldo(5);
		}
		
		
		for(Empleado e: misEmpleados) {
			
			System.out.println("Nombre: " + e.dameNombre() + 
					", Sueldo: " + e.dameSueldo() + ", fecha de alta: " + e.dameFechaContrato()); 
		} 
		
		
	}

}

class Empleado {
	 
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		AltaContrato = calendario.getTime();
		++IdSiguiente;
		Id = IdSiguiente; 
		
		 
	}
	
	public Empleado (String nom) {
		
		this(nom, 30000, 2000,01,01);
	}
	
	
	public String dameNombre() { //GETTER
		
		return nombre + " Id: " + Id ;
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
	
	private String nombre;
	private double sueldo;
	private Date AltaContrato;
	private static int IdSiguiente;
	private int Id;
	
}


class Jefatura extends Empleado {
	
	public Jefatura (String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno, mes, dia);
	}
	
	public void estableceIncentivo (double b) {
		
		incentivo = b;
	}
	
	public double dameSueldo () {
		
		double sueldoJefe = super.dameSueldo(	);
		return sueldoJefe + incentivo;
	}
	
	private double incentivo;
	
	
}











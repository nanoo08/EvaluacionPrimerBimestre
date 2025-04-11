package evPrimerBimestreCachi;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner (System.in);
	
	char talle;
	
	System.out.println("ingrese el talle: ");
	talle = ingreso.next().charAt(0);
	
	switch (talle) {
	
	case 'S': 
	case 's': System.out.println("quedan 5 remeras");
	break;
	
	case 'M':
	case 'm': System.out.println("quedan 2 remeras");
	break;
	
	case 'L':	
	case 'l': System.out.println("no quedan remeras");
	break;
			
	default:
        System.out.println("no ingesaste ningun talle");
	break;
}
}
}

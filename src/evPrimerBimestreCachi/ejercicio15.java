package evPrimerBimestreCachi;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner (System.in);
	
	char talle;
	
	System.out.println("ingrese el talle: ");
	talle = ingreso.next().charAt(0);
	
	switch (talle) {
	
	case 'S': System.out.println("quedan 5 remeras");
	break;
	
	case 's': System.out.println("quedan 5 remeras");
	break;
	
	case 'M': System.out.println("quedan 2 remeras");
	break;
	
	case 'm': System.out.println("quedan 2 remeras");
	break;
	
	case 'L': System.out.println("no quedan remeras");
	break;
	
	case 'l': System.out.println("no quedan remeras");
	break;
}
}
}
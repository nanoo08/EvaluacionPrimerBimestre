package evPrimerBimestreCachi;

import java.util.Scanner;

public class ejericio14 {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner (System.in);
		
		boolean pagoEntrada = true;
		int edad = 18;
		
		System.out.println("ingrese su edad: ");
		edad = ingreso.nextInt();
		
		
		if (edad >= 18) {
			
		
			if (pagoEntrada) {
				System.out.println("Entrada valida");
			
			}else{
                System.out.println("Entrada no abonada. No puede ingresar.");
            }
			
		}if (edad < 18 && edad >0) {
		System.out.println("entrada no permitida");
		
	}
		
		
		
		
		
		
		
		
		
		
		
}
}
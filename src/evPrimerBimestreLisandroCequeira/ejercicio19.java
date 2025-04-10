package evPrimerBimestreLisandroCequeira;

import java.util.Scanner;

public class ejercicio19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		
		int intentos =0;
		int ingreso = 0;
		while(intentos<3) {
			System.out.println("ingrese la contraseña:");
			ingreso= entrada.nextInt();
			int contra = 2008;
		if(ingreso==contra) {
			System.out.println("contraseña correcta.");
			break;
		}
			intentos++;
			System.out.println("cantidad de intentos: "+intentos);
			System.out.println("Contraseña incorrecta.");
			
			
		}
	
		
		
		
		
	}
		
	}



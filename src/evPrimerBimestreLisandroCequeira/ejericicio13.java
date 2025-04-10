package evPrimerBimestreLisandroCequeira;

import java.util.Scanner;

public class ejericicio13 {
	
	public static void main(String[] args) {
		Scanner ingreso = new Scanner (System.in);
	
	int horaIngresada;
	int minutoIngresado;
	int segundoIngresado;
	
	System.out.println("ingrese la hora: ");
	horaIngresada = ingreso.nextInt();
	
	System.out.println("ingrese el minuto: ");
	minutoIngresado= ingreso.nextInt();
	
	System.out.println("ingrese el segundo: ");
	segundoIngresado= ingreso.nextInt();
	

	if (horaIngresada<24) {
        System.out.println("hora correcta"); 
    }
	else {
		System.out.println("el valor es incorrecto");
	}
	if(minutoIngresado<60) {
		
		System.out.println("minuto correcto"); 
	}
	else {
		System.out.println("el valor es incorrecto");
	}
	if (segundoIngresado<60) {
        System.out.println("segundo correcto"); 
    }     
	else {
		System.out.println("el valor es incorrecto");
	}   

}
}
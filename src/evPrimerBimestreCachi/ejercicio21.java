package evPrimerBimestreCachi;

public class ejercicio21 {

	public static void main(String[] args)throws InterruptedException  {
	
		int bateria = 100;
		
		
		while(bateria >= 0) {
			
			System.out.println("bateria:"+ bateria+"%");
			
			Thread.sleep(20);
			
			if(bateria==20) {
				
			System.out.println("bateria baja");
			
			Thread.sleep(1000);
				
			}
			
			bateria--;
		}
		
		System.out.println("bateria agotada");
		
		

	}

}

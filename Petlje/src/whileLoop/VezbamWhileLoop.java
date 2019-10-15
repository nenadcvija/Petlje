package whileLoop;

import java.util.Scanner;

public class VezbamWhileLoop {

	public static void main(String[] args) {
			
		/*
		 * int broj = 0;
		 * 
		 * while(broj < 7) {
		 * 
		 * if(broj == 5) { System.out.println("Evo ga broj 5!!!"); break; }else {
		 * System.out.println(broj); broj++; }
		 * 
		 * }
		 */
		
		int zbir = 0;
		
		while(true) {
			System.out.println("Unesite: ");
			System.out.println("0 - kraj");
			System.out.println("bilo koji broj - sabiranje");
			
			Scanner scanner = new Scanner(System.in);
			int unetiBroj = scanner.nextInt();
			
			if(unetiBroj != 0) {
				zbir = zbir + unetiBroj;
				System.out.println("nastavi...");
	
			}else {
				System.out.println("Krajnji zbir je: " + zbir);
				scanner.close();
				break;
			}
		}
		
		
		
		
		
		
		
		
		

	}

}

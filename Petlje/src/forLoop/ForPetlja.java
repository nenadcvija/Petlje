package forLoop;

public class ForPetlja {

	public static void main(String[] args) {
		
		
		/*
		 * for( int i = 1; i < 11 ; i++) {
		 * 
		 * if(i < 5) { int zbir = i + 6; System.out.println("Zbir je: " + zbir); }else {
		 * int proizvod = i * 9; System.out.println("Proizvod je: " + proizvod); }
		 * 
		 * }
		 */
		
		/*
		 * int pocetak = 18; int kraj = 18;
		 * 
		 * if(pocetak <= kraj) { for(int i = pocetak ; i <= kraj ; i++) {
		 * 
		 * if(i%2 == 0) { System.out.println( i + "- broj je paran"); }else {
		 * System.out.println( i + "- broj je neparan"); } } }else {
		 * System.out.println("Ne moze pocetak da bude veci od kraja!"); }
		 */
		
		for(int i = 1 ; i <= 10 ; i++) {
			for(int j = 1 ; j < 11 ; j++) {
				int proizvod = i * j;
				System.out.println( i + "*" + j + " = " + proizvod);		
			}	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		

	}

}

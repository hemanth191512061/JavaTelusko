package Learn;

enum COLOR {
	
	RED, WHITE, YELLOW
}

public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Get all enum objects into array of objects
		COLOR[] b = COLOR.values(); 
		
		//print the ordinal like 0/1/2/3 of each enum object
		for(COLOR a : b) 
		  System.out.println(a + " : " + a.ordinal()); 
		}

}

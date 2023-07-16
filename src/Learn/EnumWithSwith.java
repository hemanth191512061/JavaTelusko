package Learn;

//nested class enum in the class 
class Enumarator123 {
	enum COLOR {
		RED, WHITE, YELLOW
	}
}

public class EnumWithSwith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//object for enum class
		Enumarator123.COLOR b; 
		
		//selected Red color
		b=Enumarator123.COLOR.RED; 
		
		switch (b) {
		case RED: 
			System.out.println("selcted red color"); 
			break; 
		case WHITE: 
			System.out.println("selcted white color"); 
			break; 
		case YELLOW: 
			System.out.println("selcted yellow color"); 
		    break; 
		default: 
		    System.out.println("color is not found in case ");
		}
	}

}

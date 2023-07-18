package Learn;

public class TernoryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int result;
		
		//ternary operator is same as if else statement with ? and : 
		result = 10>20 ? 10 : 20;
		
		System.out.println(result);
		//To print largest value from 3 values
		
		int x= 0, y = 3, z= 4;
		
		int large_value;
		
		//nested ternary is same as else if statement
		large_value = x>y && x>z ? x : (y>z ? y : z) ;
		
		System.out.println(large_value);

	}

}

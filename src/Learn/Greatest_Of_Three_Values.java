package Learn;

public class Greatest_Of_Three_Values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// printing gratest value from 3 values using only if and else statement

		int a = 50, b = 30, c = 40;

		if (a > b || b > c) {

			if (a > b)
				System.out.println("Gretest value is: " + a);
			else
				System.out.println("Gretest value is: " + b);
		} 
		else
			System.out.println("Gretest value is: " + c);

	}

}

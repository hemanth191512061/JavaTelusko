package Learn;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// palindrome 143 = 341
		// System.out.println(143 % 10 + " " + 0 % 10);

		int number = 143;
		int temp = number;
		int sum = 0;
		int reminder = 0;
		int pov = 1;
		
		//while loop based on the reminder value
		while (temp % 10 != 0) {
			//n get reminder
			reminder = temp % 10;
			//summing up all the values by getting reminder
			sum = sum * pov + reminder;
			System.out.println(sum);
			pov = 10;
			temp = temp / 10;
		}
		if (sum == number) {
			System.out.println("palindrome");
		} else
			System.out.println("non-poolindrome");

	}

}

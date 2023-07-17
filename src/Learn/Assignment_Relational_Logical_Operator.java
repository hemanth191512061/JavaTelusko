package Learn;

public class Assignment_Relational_Logical_Operator {

	public static void main(String[] arg) {

		// assignment operator
		int a = 12;

		// assignment with arithmetic operator
		a = a + 1;

		a += 2; // a = a+2

		a -= 2; // a = a-2

		a /= 2; // a= a/2

		a *= 2; // a = a*2

		a %= 2; // a = a%2

		System.out.println(a);

		// assignment with increment operator
		int b = a++; // b = a and a = a+1

		System.out.println(b);

		int c = ++b; // c= b+1 and b = b+1

		System.out.println(c);

		char ch = 'A';

		char ch1 = ch++; // ch1 = ch and ch = 'A' + 1

		System.out.println("Value of ch1 is :" + ch1);

		System.out.println("Value of ch is:" + ch);

		// Relation operator returns only true or false

		int a1 = 10;

		int b1 = 20;

		int c1 = 1;

		int d1 = 2;

		boolean b21 = a1 > b1;

		System.out.println(b21);

		boolean b211 = 20 >= 20;

		System.out.println(b211);

		// logical operator returns only true or false
		// logical and
		System.out.println(a1 > b1 && d1 > c1);

		// logical or
		System.out.println(a1 > b1 || d1 > c1);

		// logical not()
		System.out.println(!false);

	}

}

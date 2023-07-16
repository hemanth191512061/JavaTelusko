package Learn;

public class ExplicitConvertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int to byte explicit type casting
		int i = 289;

		byte b = (byte) i;
		
		byte b1 = 10;
		
		byte b2 = 30;
		
		byte b3=(byte) (b1*b2);

		System.out.println(b); // b= i/256(byte length) = 33
		
		System.out.println(b3);
		// float to int casting
		float f = 5.8f;

		int d = (int) f;

		System.out.println(d);

		// double to float

		double dou = 34.89886;

		float flo = (float) dou;

		System.out.println(flo);

	}

}

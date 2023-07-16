package Learn;

enum Laptop {
	// enum object with parameter
	Lenovo(2000), Dell(3000), Mac(5000), Asus;

	private int price;

	// default is used by Asus object
	Laptop() {
		price = 1000;
	}

	// private constructor because we are creating object in the same class
	private Laptop(int price) {
		this.price = price;
	}

	// getter and setter methods to access private things public
	int getPrice() {
		return price;
	}
	/*
	 * * public void setPrice(int price) { this.price = price; }
	 */
}

public class EnumWithConstructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Laptop b[];
		// getting all Laptop objects into array
		b = Laptop.values();
		// looping through enum object array and getting price of each laptop
		for (Laptop lap : b)
			System.out.println(lap.name() + " price is " + lap.getPrice());
	}

}

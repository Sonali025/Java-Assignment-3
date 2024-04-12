package JavaAssignment3;

public class ShoppingCart {
	private int numProduct;
	private Product product[];
	private double total = 0;

	public ShoppingCart(int capacity) {
		product = new Product[capacity];
		numProduct = 0;
	}

	public void addProduct(String name, double price) {
		if (numProduct < product.length) {
			product[numProduct++] = new Product(name, price);
		} else {
			System.out.println("ShoppingCart is full...");
		}
	}

	public void calTotal() {
		for (int i = 0; i < numProduct; i++) {
			total = total + product[i].getPrice();
		}
		System.out.println("total bill is " + total + "/-");
	}

	public void display() {
		if (numProduct == 0) {
			System.out.println("ShoppingCart is empty");
		} else {
			for (int i = 0; i < numProduct; i++) {
				System.out.println("Name of product : " + product[i].getName());
				System.out.println("Price of product : " + product[i].getPrice());
			}
		}
	}

}

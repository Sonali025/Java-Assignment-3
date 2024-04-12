package JavaAssignment3;

public class TestShoppingCart {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart(3);

		cart.addProduct("Olive Oil 1l", 200);
		cart.addProduct("Cheese Slices", 50);
		cart.addProduct("Bread", 50);
		cart.addProduct("Olive Oil 1l", 200);

		cart.display();
		cart.calTotal();

	}

}

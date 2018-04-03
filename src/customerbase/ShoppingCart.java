package customerbase;

import java.util.*; 
import marketitems.*;

public class ShoppingCart {

	private ArrayList<Item> shoppingCart;

	public ShoppingCart() {
		shoppingCart = new ArrayList<Item>();
	}

	// Fulfillment of step 1
	public void addItem(Item name) {
		shoppingCart.add(name);
	}

	// Fulfillment of step 2
	public void removeItem(Item name) {
		shoppingCart.remove(name);
	}

	// Fulfillment of step 3
	public void flushCart() {
		shoppingCart.clear();
	}

	// Requirement for calculating total price
	public int shoppingCartSize() {
		return shoppingCart.size();
	}

	// Fulfillment of step 4
	public double calculateTotal() {
		double total = 0;
		for (int i = 0; i < shoppingCart.size(); i++)
			total += shoppingCart.get(i).getPrice();
		return total;
	}

	// Print items in shoppingCart; credit to my colleague from Germany!
	public String toString() {
		for (int i = 0; i < shoppingCart.size(); i++)
			System.out.println(shoppingCart.get(i).getName() + " " + shoppingCart.get(i).getDescription() + " "
					+ shoppingCart.get(i).getPrice());
		return " ";
	}
}

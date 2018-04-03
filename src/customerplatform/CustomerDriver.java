package customerplatform;

import java.text.*;
import java.util.*;
import customerbase.*;
import marketitems.*;

public class CustomerDriver {

	public static void main(String[] args) {
		int cs1 = 1;

		// Set my customer
		Customer customer = new Customer("Dale", "Yon", "dale.yon@zf.com");
		customer.setFirstName("Dale");
		customer.setLastName("Yon");
		customer.setEmailAddress("dale.yon@zf.com");

		// Create my items
		Scanner scan = new Scanner(System.in);
		NumberFormat priceFormat = NumberFormat.getCurrencyInstance();
		Item basketball = new Item("Basketball", "To Shoot and Score", 10.99);
		Item basketballGoal = new Item("Basketball Goal", "Requires Basketball", 99.99);
		Item basketballShoes = new Item("Basketball Shoes", "LeBron James - Witness II", 89.99);

		// Tried several times with do.... craziness... switched to while / switch
		// Create my opening welcome page and options
		// Several tests and then adjustments for better experience; Object Oriented
		// thinking - what would I want to see as the customer.
		while (cs1 != 0) {
			System.out.println("WELCOME TO OUR STORE!" + " " + "Please Make a Selection Below: ");
			System.out.println("Enter 0 to Exit the Store.");
			System.out.println("Enter 1 to View Your Profile.");
			System.out.println("Enter 2 to View and Purchase Merchandise.");
			System.out.println("Enter 3 to Delete Item(s) From Your Cart.");
			System.out.println("Enter 4 to View Your Cart.");
			System.out.println("Enter 5 to Trash Your Cart." + "\n");
			cs1 = scan.nextInt();
			switch (cs1) {
			case 1:
				System.out.println("First and Last Name: " + customer.getFirstName() + " " + customer.getLastName()
						+ "\n" + "Email Address: " + " " + customer.getEmailAddress() + "\n");
				break;
			case 2:
				System.out.println("\n" + "Available Store Merchandise:");
				System.out.println("Item One:" + "\n" + basketball + "\n" + "Item Two:" + "\n" + basketballGoal + "\n"
						+ "Item Three:" + basketballShoes + "\n");
				System.out.println("Please Select the Merchandise You Want to Purchase?");
				System.out.print("1- Basketball 2- Basketball Goal 3- Basketball Shoes" + "\n");
				cs1 = scan.nextInt();
				switch (cs1) {
				case 1:
					customer.getShoppingCart().addItem(basketball);
					System.out.println("\n" + "Basketball - Shoot and Score - now in Your Shopping Cart" + "\n");
					Double total1 = new Double(customer.getShoppingCart().calculateTotal());
					System.out.println("Shopping Cart Total: " + (priceFormat.format(total1) + "\n"));
					break;
				case 2:
					customer.getShoppingCart().addItem(basketballGoal);
					System.out
							.println("\n" + "Basketball Goal - Requires Basketball - now in Your Shopping Cart" + "\n");
					Double total2 = new Double(customer.getShoppingCart().calculateTotal());
					System.out.println("Shopping Cart Total: " + (priceFormat.format(total2) + "\n"));
					break;
				case 3:
					customer.getShoppingCart().addItem(basketballShoes);
					System.out.println("\n" + "Basketball Shoes - LBJ Witness II - now in Your Shopping Cart" + "\n");
					Double total3 = new Double(customer.getShoppingCart().calculateTotal());
					System.out.println("Shopping Cart Total: " + (priceFormat.format(total3) + "\n"));
					break;
				}
				break;
			case 3:
				System.out.println("\n" + "Which Merchandise Would You Like to Remove?");
				System.out.print("1: Basketball 2: Basketball Goal 3: Basketball Shoes" + "\n");
				cs1 = scan.nextInt();
				switch (cs1) {
				case 1:
					customer.getShoppingCart().removeItem(basketball);
					System.out.println("\n" + "Basketball - Deleted - Your LOSS" + "\n");
					Double total1 = new Double(customer.getShoppingCart().calculateTotal());
					System.out.println("Shopping Cart Total: " + (priceFormat.format(total1) + "\n"));
					break;
				case 2:
					customer.getShoppingCart().removeItem(basketballGoal);
					System.out.println("\n" + "Basketball Goal - Deleted - Your LOSS" + "\n");
					Double total2 = new Double(customer.getShoppingCart().calculateTotal());
					System.out.println("Shopping Cart Total: " + (priceFormat.format(total2) + "\n"));
					break;
				case 3:
					customer.getShoppingCart().removeItem(basketballShoes);
					System.out.println("\n" + "Basketball Shoes - Deleted - Your LOSS" + "\n");
					Double total3 = new Double(customer.getShoppingCart().calculateTotal());
					System.out.println("Shopping Cart Total: " + (priceFormat.format(total3) + "\n"));
					break;
				}
				break;
			case 4:
				System.out.println("\n" + "Your Shopping Cart Contents:");
				System.out.println(customer.getShoppingCart());
				Double total = new Double(customer.getShoppingCart().calculateTotal());
				System.out.println("Shopping Cart Total: " + (priceFormat.format(total) + "\n"));
				break;
			case 5:
				customer.getShoppingCart().flushCart();
				System.out.println("<---- Shopping Cart Cleared ---->");
				System.out.println(customer.getShoppingCart());
				break;
			}

		}
		scan.close();
	}
}

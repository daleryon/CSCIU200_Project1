package marketitems;

import java.text.*;

public class Item {
	private String name;
	private String description;
	private double price;
	private NumberFormat formatter;

	// Fulfillment of Item Class requirements
	public Item(String name, String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
		formatter = NumberFormat.getCurrencyInstance();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return (name + "\n" + description + "\n" + formatter.format(price));
	}
}
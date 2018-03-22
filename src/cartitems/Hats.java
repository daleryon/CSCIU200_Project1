package cartitems;

public class Hats {
	private int id;
	private String name;
	private double cost;
	private int quantity;
	private double tax;

	public Hats(int itemID, String itemName, double itemCost, int itemQuantity, double itemTax) {
		setId(itemID);
		setName(itemName);
		setCost(itemCost);
		setQuantity(itemQuantity);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

}

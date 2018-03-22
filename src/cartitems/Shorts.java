package cartitems;

public class Shorts {
	private int id;
	private String name;
	private double cost;
	private int quantity;

	public Shorts(int itemID, String itemName, double itemCost, int itemQuantity) {
		this.id = itemID;
		this.name = itemName;
		this.cost = itemCost;
		this.quantity = itemQuantity;
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

	public String toString() {
		return id + " " + name + " " + cost + " " + quantity;

	}
}

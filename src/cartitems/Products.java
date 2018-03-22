package cartitems;

public class Products {
	private String name1;
	private double cost1;
	private int quantity1;
	private String name2;
	private double cost2;
	private int quantity2;
	private String name3;
	private double cost3;
	private int quantity3;

	public Products(String itemName1, String itemName2, String itemName3, double itemCost1, double itemCost2,
			double itemCost3, int itemQuantity1, int itemQuantity2, int itemQuantity3) {
		this.setName1(itemName1);
		this.setCost1(itemCost1);
		this.setQuantity1(itemQuantity1);
		this.setName2(itemName2);
		this.setCost2(itemCost2);
		this.setQuantity2(itemQuantity2);
		this.setName3(itemName3);
		this.setCost3(itemCost3);
		this.setQuantity3(itemQuantity3);
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public double getCost1() {
		return cost1;
	}

	public void setCost1(double cost1) {
		this.cost1 = cost1;
	}

	public int getQuantity1() {
		return quantity1;
	}

	public void setQuantity1(int quantity1) {
		this.quantity1 = quantity1;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public double getCost2() {
		return cost2;
	}

	public void setCost2(double cost2) {
		this.cost2 = cost2;
	}

	public int getQuantity2() {
		return quantity2;
	}

	public void setQuantity2(int quantity2) {
		this.quantity2 = quantity2;
	}

	public String getName3() {
		return name3;
	}

	public void setName3(String name3) {
		this.name3 = name3;
	}

	public double getCost3() {
		return cost3;
	}

	public void setCost3(double cost3) {
		this.cost3 = cost3;
	}

	public int getQuantity3() {
		return quantity3;
	}

	public void setQuantity3(int quantity3) {
		this.quantity3 = quantity3;
	}
}

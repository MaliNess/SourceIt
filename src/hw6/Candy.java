package hw6;

public class Candy extends Sweet {
	Candy() {
		super.setType("candy");
	}

	public Candy(String name, double weight, double sugarAmount, double price, String material) {
		super(name, weight, sugarAmount, price, material);
		super.setType("candy");
	}
}

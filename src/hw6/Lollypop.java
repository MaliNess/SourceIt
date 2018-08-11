package hw6;

public class Lollypop extends Candy {
	public Lollypop() {
	}

	public Lollypop(String name, double weight, double sugarAmount, double price, String material) {
		super(name, weight, sugarAmount, price, material);
		super.setType("lollypop");
	}
}

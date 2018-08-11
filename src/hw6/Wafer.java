package hw6;

public class Wafer extends Sweet {
	private String element;

	public Wafer() {
	}

	public Wafer(String name, double weight, double sugarAmount, double price, String material, String element) {
		super(name, weight, sugarAmount, price, "Wafer");
		this.setElement(element);
		super.setType("wafer");
	}

	public Wafer(String name, double weight, double sugarAmount, double price, String element) {
		super(name, weight, sugarAmount, price, "Wafer");
		this.setElement(element);
		super.setType("wafer");
	}

	@Override
	public String getElement() {
		return element;
	}

	protected void setElement(String element) {
		this.element = element;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString() + "\tElement: " + element + "\n");
		return sb.toString();
	}
}

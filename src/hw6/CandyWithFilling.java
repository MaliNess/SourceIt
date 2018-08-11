package hw6;

public class CandyWithFilling extends Candy {
	private String filling;

	public CandyWithFilling() {
	}

	public CandyWithFilling(String name, double weight, double sugarAmount, double price, String material,
			String filling) {
		super(name, weight, sugarAmount, price, material);
		this.setFilling(filling);
		super.setType("candy with filling");
	}

	@Override
	public String getFilling() {
		return filling;
	}

	protected void setFilling(String filling) {
		this.filling = filling;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString() + "\tFilling: " + filling + "\n");
		return sb.toString();
	}
}

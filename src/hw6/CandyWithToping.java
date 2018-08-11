package hw6;

public class CandyWithToping extends Candy {
	private String toping;

	public CandyWithToping() {
	}

	public CandyWithToping(String name, double weight, double sugarAmount, double price, String material,
			String toping) {
		super(name, weight, sugarAmount, price, material);
		this.setToping(toping);
		super.setType("candy with toping");
	}

	@Override
	public String getToping() {
		return toping;
	}

	protected void setToping(String toping) {
		this.toping = toping;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString() + "\tToping: " + toping + "\n");
		return sb.toString();
	}
}

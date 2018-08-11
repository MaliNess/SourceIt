package hw6;

public class Sweet {

	private String name;
	private double weight;
	private double sugarAmount;
	private double price;
	private String material;
	private String type;

	public Sweet() {
		this.setType("sweet");
	}

	public Sweet(String name, double weight, double sugarAmount, double price) {
		this.setName(name);
		this.setWeight(weight);
		this.setSugarAmount(sugarAmount);
		this.setPrice(price);
		this.setType("sweet");
	}

	public Sweet(String name, double weight, double sugarAmount, double price, String material) {
		this.setName(name);
		this.setWeight(weight);
		this.setSugarAmount(sugarAmount);
		this.setPrice(price);
		this.setMaterial(material);
		this.setType("sweet");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getSugarAmount() {
		return sugarAmount;
	}

	public void setSugarAmount(double sugarAmount) {
		this.sugarAmount = sugarAmount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getElement() {
		return "none";
	}

	public String getToping() {
		return "none";
	}

	public String getFilling() {
		return "none";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("\n\tName: " + name + "\n\tWeight: " + weight + "\n\tSugar amount: "
				+ sugarAmount + "\n\tPrice: " + price + "\n\tMateial: " + material + "\n\tType: " + type + "\n");
		return sb.toString();
	}
}

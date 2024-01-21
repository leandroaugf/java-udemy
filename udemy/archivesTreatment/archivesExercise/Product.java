package archivesExercise;

public class Product {
	private String name;
	private int quantity;
	private double price;
	
	
	public Product() {
	}
	public Product(String name, int quantity, double price) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double subtotal() {
		return this.price * this.quantity;
	}
}

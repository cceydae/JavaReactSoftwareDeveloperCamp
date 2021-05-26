package day43;

public class Game {

	private int id;
	private String name;
	private double price;
	private double discount;
	
	public Game() {
		
	}

	public Game(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getPriceafterdiscount() {
		return this.price-(this.price * this.discount / 100);
	}
	
	
}

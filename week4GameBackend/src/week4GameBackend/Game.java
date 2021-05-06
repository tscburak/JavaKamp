package week4GameBackend;

public class Game {
	private int id;
	private String name;
	private String company;
	private String type;
	private double price;
	private int discount;
	
	
	public Game(int id, String name, String company, String type, double price, int discount) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.type = type;
		this.price = price;
		this.discount = discount;
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public double getNewPrice() {
		return this.price-(this.price*this.discount/100);
	}

	
	

}
	
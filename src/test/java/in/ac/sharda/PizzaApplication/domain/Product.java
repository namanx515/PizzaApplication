package in.ac.sharda.PizzaApplication.domain;

public class Product {
   
	public Product(int price, int id, String description, String name) {
		super();
		this.price = price;
		this.name = name;
		this.description = description;
		this.id = id;
	}

	private int price;
	private String name, description;
	private int id;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Product)
			return((Product)obj).getId()==id;
		return false;
	}
	
	

	
}

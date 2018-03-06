package application.entities;

public class dministratation {
	private String product_name;
	private double price_range; 
	private String category;
	
	public dministratation() {
		product_name ="";
		price_range = 0;
		category ="";
		
	}
	public dministratation(String product_name, double price_range, String category) {
		super();
		this.product_name = product_name;
		this.price_range = price_range;
		this.category = category;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getPrice_range() {
		return price_range;
	}
	public void setPrice_range(double price_range) {
		this.price_range = price_range;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	

}

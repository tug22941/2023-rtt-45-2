package coffee;

//This is a POJO: Plain O'l Java Object
//This class can also be called a 'Bean' or 'Entity'
public class MenuItem {

	private String name;
	private double price;
	
	
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
	
	

}

package coffee;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {
	//create private list to hold menu items
	private List<MenuItem> menuItems = new ArrayList<>();
	
	//instantiate menu items; set name and price; add item to list
	public void initialize() {
		MenuItem item1 = new MenuItem();
		item1.setName("Small Coffee");
		item1.setPrice(4.30);
		item1.setStock(4);
		menuItems.add(item1);
		
		MenuItem item2 = new MenuItem();
		item2.setName("Large Coffee");
		item2.setPrice(5.99);
		item2.setStock(3);
		menuItems.add(item2);
		
		MenuItem item3 = new MenuItem();
		item3.setName("Glazed Donut");
		item3.setPrice(9.99);
		item3.setStock(1);
		menuItems.add(item3);
		
		//directly adding item to the list through initialization
		menuItems.add(new MenuItem("Oatmeal Cookie", 7.25, 3));

		
		
		}
	
	public void printMenuItems() {
		System.out.println("Name\t\tPrice \tQuantity In Stock");
		System.out.println("------------------------------------");
		DecimalFormat decForm = new DecimalFormat("$###.00");
		for(MenuItem item: menuItems) {
			System.out.println(item.getName() + "\t" + decForm.format(item.getPrice()) + "\t" + item.getStock());
		}
		
	}
}

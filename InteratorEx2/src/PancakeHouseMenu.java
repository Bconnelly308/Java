import java.util.ArrayList;

public class PancakeHouseMenu implements Menu2 {
	ArrayList<MenuItem> menuItems;
 
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
    
		addItem("Chicken Alfredo", 
			"Fetucine Pasta, fried chicken, and alfredo sauce", 
			true,
			2.99);
 
		addItem("Shrimp Alfredo", 
			"Fetucine Pasta, sauteed shrimp, and alfredo sauce", 
			false,
			2.99);
 
		addItem("Chicken and Shrimp Alfredo",
			"Fetucine Pasta, fried chicken, sauteed shrimp, and alfredo sauce",
			true,
			3.49);
 
	}

	public void addItem(String name, String description,
	                    boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
 
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
  
	public Iterator createIterator() {
		return new PancakeHouseMenuIterator(menuItems);
	}
  
	public String toString() {
		return "Objectville Pancake House Menu";
	}

}
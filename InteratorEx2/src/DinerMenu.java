public class DinerMenu implements Menu2 {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
  
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
 
		addItem("Chocolate Cake",
			"Moist chocolate cake, fudge frosting, and vanilla ice cream", true, 2.99);
		addItem("Tiramisu",
			"Coffe flavored cake", false, 2.99);
		addItem("Canolli",
			"Fried pastry filled with sweet cream", false, 3.29);
		
	}
  
	public void addItem(String name, String description, 
	                     boolean vegetarian, double price) 
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
 
	public MenuItem[] getMenuItems() {
		return menuItems;
	}
  
	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
		// To test Alternating menu items, comment out above line,
		// and uncomment the line below.
		//return new AlternatingDinerMenuIterator(menuItems);
	}
 
	// other menu methods here
}
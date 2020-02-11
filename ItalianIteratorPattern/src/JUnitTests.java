import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

class JUnitTests {

	@Test
	void test() {
		//just initializing, nothing to test
		DessertMenu dessertMenu = new DessertMenu();
		EntreeMenu entreeMenu = new EntreeMenu();
		AppetizerMenu appetizerMenu = new AppetizerMenu();
 
		//testing properties
		WaitStaff waitStaff = new WaitStaff(appetizerMenu, entreeMenu, dessertMenu);
		assertTrue(waitStaff.appetizerMenu!=null);
		assertTrue(waitStaff.entreeMenu!=null);
		assertTrue(waitStaff.dessertMenu!=null);
 
		waitStaff.printMenu();
//		assertTrue(((ItalianMenuIterator)waitStaff.appetizerIterator).position>0);
		waitStaff.printVegetarianMenu();
		waitStaff.printGlutenfreeMenu();

		System.out.println("\nWait Staff asks, what would you like to order today?");
		System.out.println("\nCustomer 1 asks, is the Fish of the Day Gluten Free?");
		System.out.print("Waitress says: ");
		
		
		int countApp = waitStaff.countGlutenfreeMenu(appetizerMenu.createIterator());
		int countEnt = waitStaff.countGlutenfreeMenu(entreeMenu.createIterator());
		int countDes = waitStaff.countGlutenfreeMenu(dessertMenu.createIterator());
		assertTrue(countApp == 2);
		assertFalse(countApp == 3);
				
		if (waitStaff.isItemGlutenfree("Fish of the Day")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println("\nCustomer 2 asks, is the Baked Ziti Vegetarian?");
		System.out.print("Waitress says: ");
		if (waitStaff.isItemVegetarian("Baked Ziti")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println("\nCustomer 3 asks, is the Funghi Pizza Gluten Free and Vegetarian?");
		System.out.print("Waitress says: ");
		if (waitStaff.isItemVegetarian("Funghi Pizza") && waitStaff.isItemGlutenfree("Funghi Pizza")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}



				
	}

}

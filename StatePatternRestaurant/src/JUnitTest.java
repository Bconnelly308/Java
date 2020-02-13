import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

class JUnitTests {

	@Test
	void test() {
			Restaurant restaurant = new Restaurant(5);
			
			System.out.println(restaurant);
			restaurant.seatSearch();
			restaurant.chooseSeat();		
			
			System.out.println(restaurant);
			restaurant.seatSearch();
			restaurant.chooseSeat();
			
			System.out.println(restaurant);
			restaurant.seatSearch();
			restaurant.rejectCustomer();
			
			System.out.println(restaurant);
			restaurant.seatSearch();
			restaurant.chooseSeat();
			
			System.out.println(restaurant);
			restaurant.seatSearch();
			restaurant.chooseSeat();
			
			System.out.println(restaurant);
			restaurant.seatSearch();
			restaurant.chooseSeat();
			
			System.out.println(restaurant);
			restaurant.seatSearch();
			restaurant.chooseSeat();
			
		}
	}

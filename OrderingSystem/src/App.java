//this project uses JSwing for button clicks, scroll bars, customer components, toolbars, communication

import java.awt.Frame;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import org.omg.CORBA.PUBLIC_MEMBER;

public class App {
	
/*	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {			
			public void run() {
				new MainFrame();

			}
		});
	}
	public void main(String[] args) {
	    displayMenu();
	}	
*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First Name");
		String firstName = scanner.nextLine();
		System.out.println("Enter Last Name");
		String lastName = scanner.nextLine();
		System.out.println("Enter Payment Method");
		String paymentMethod = scanner.nextLine();
		Customer human = new Customer(firstName, lastName, paymentMethod);
		System.out.println(human.firstName + " " +  human.lastName + ", " + "Please start your order.");
		System.out.println("Order ID: " + Order.setOrderID());
		
		System.out.println("Choose Item: chicken alfredo, shrimp alfredo, chicken and shrimp alfredo ...");
		String item = scanner.nextLine();
		Menu food = new Menu(item);
		
								
		if (food.item.equalsIgnoreCase("chicken alfredo")) {
			Pasta pasta1 = new Chicken(new Alfredo());
			System.out.println("You ordered: " + food.item);
			System.out.println("Ingredients: " + pasta1.getDescription());
			System.out.println("Dish Price: $" + pasta1.getCost());
			System.out.println("Dish Calories: " + pasta1.getCalories());
			double itemTotal = pasta1.getCost();
			Payment payment1 = new Payment(itemTotal);
			System.out.println(payment1.itemTotal);
			
		}
		
		else if (food.item.equalsIgnoreCase("shrimp alfredo")) {
			
			Pasta pasta1 = new Shrimp(new Alfredo());
			System.out.println("You ordered: " + food.item);

			System.out.println("Ingredients: " + pasta1.getDescription());
			
			System.out.println("Dish Price: $" + pasta1.getCost());
			
			System.out.println("Dish Calories: " + pasta1.getCalories());
			double itemTotal = pasta1.getCost();
			Payment payment1 = new Payment(itemTotal);
			System.out.println(payment1.itemTotal);
			
		}
		
		else if (food.item.equalsIgnoreCase("chicken and shrimp alfredo")) {
			
			Pasta pasta1 = new Chicken(new Shrimp(new Alfredo()));
			System.out.println("You ordered: " + food.item);

			System.out.println("Ingredients: " + pasta1.getDescription());
			
			System.out.println("Dish Price: $" + pasta1.getCost());
			
			System.out.println("Dish Calories: " + pasta1.getCalories());
			double itemTotal = pasta1.getCost();
			Payment payment1 = new Payment(itemTotal);
			System.out.println(payment1.itemTotal);
			
		}
		
		else {			
			System.out.println("Sorry, that item is not available");
			double itemTotal = 0;
			Payment payment1 = new Payment(itemTotal);
			System.out.println(payment1.itemTotal);
		}
		
		SimpleReceiptFactory factory = new SimpleReceiptFactory();
		Checkout checkout = new Checkout(factory);
		System.out.println(human.paymentMethod);

		Receipt receipt = checkout.orderReceipt(human.paymentMethod);
		System.out.println("Thank you for your payment method: " + receipt.getName() + "\n");
		System.out.println(receipt);
			
/*		System.out.println("Items chosen: " + item);
		

		System.out.println("Choose Order Date");
		String orderDate = scanner.nextLine();
		System.out.println("Order Date: " + orderDate);
		
		System.out.println("Enter Quantity in Integer");
		int quantity = scanner.nextInt();
		System.out.println("Quantity Ordered: " + quantity);
		
		//need method that outputs order total based on items input and quantity input
	    //System.out.println(Menu.displayMenu());
	    System.out.println(Customer.placeOrder());
	    System.out.println(Customer.providePayment());
	    System.out.println(Order.setOrderDate());
	    System.out.println(Payment.calcTotal());
*/
	}
}

import javax.swing.JOptionPane;

public class App {
	
	public static void main(String[] args) {

		String firstName =JOptionPane.showInputDialog("Enter your first name.");
		String lastName = JOptionPane.showInputDialog("Enter your last name.");
		String[] possiblePayValues = {"Credit", "Debit", "Cash"};
		String paymentMethod = (String) JOptionPane.showInputDialog(null, "Choose your payment method.", "Input", JOptionPane.INFORMATION_MESSAGE,  null, possiblePayValues ,  possiblePayValues[0]);
		Customer human = new Customer(firstName, lastName, paymentMethod);
		JOptionPane.showMessageDialog(null, human.firstName + " " + human.lastName + ", please start your order.");
		JOptionPane.showMessageDialog(null, "Order ID: " + Order.setOrderID());
		String[] possibleFoodValues = {"Chicken Alfredo", "Shrimp Alfredo", "Chicken and Shrimp Alfredo"};
		String item = (String) JOptionPane.showInputDialog(null, "Choose your food item.", "Input", JOptionPane.INFORMATION_MESSAGE,  null, possibleFoodValues ,  possibleFoodValues[0]);
		Menu food = new Menu(item);
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Stovetop stovetop = new Stovetop();
		StoveBoilCommand stoveBoil = new StoveBoilCommand(stovetop);
		StoveSauteCommand stoveSaute = new StoveSauteCommand(stovetop);
		StoveWarmCommand stoveWarm = new StoveWarmCommand(stovetop);
		StoveFryCommand stoveFry = new StoveFryCommand(stovetop);
		double itemTotal = 0;
		
		if (food.item.equalsIgnoreCase("chicken alfredo")) {
			Pasta pasta1 = new Chicken(new Alfredo());
			JOptionPane.showMessageDialog(null, "You ordered: " + food.item + "\nIngredients: " + pasta1.getDescription() + "\nDish Calories: " + pasta1.getCalories());
			//below, can i put the message outputted in the console in a pretty java swing box?
			remote.setCommand(stoveBoil);
			remote.buttonWasPressed();
			remote.setCommand(stoveFry);
			remote.buttonWasPressed();
			remote.setCommand(stoveWarm);
			remote.buttonWasPressed();
			itemTotal = pasta1.getCost();
			
		}
		
		else if (food.item.equalsIgnoreCase("shrimp alfredo")) {
			Pasta pasta1 = new Shrimp(new Alfredo());
			JOptionPane.showMessageDialog(null, "You ordered: " + food.item + "\nIngredients: " + pasta1.getDescription() + "\nDish Calories: " + pasta1.getCalories());
			remote.setCommand(stoveBoil);
			remote.buttonWasPressed();
			remote.setCommand(stoveSaute);
			remote.buttonWasPressed();
			remote.setCommand(stoveWarm);
			remote.buttonWasPressed();
			itemTotal = pasta1.getCost();
			
		}
		
		else if (food.item.equalsIgnoreCase("chicken and shrimp alfredo")) {
			Pasta pasta1 = new Chicken(new Shrimp(new Alfredo()));
			JOptionPane.showMessageDialog(null, "You ordered: " + food.item + "\nIngredients: " + pasta1.getDescription() + "\nDish Calories: " + pasta1.getCalories());
			remote.setCommand(stoveBoil);
			remote.buttonWasPressed();
			remote.setCommand(stoveFry);
			remote.buttonWasPressed();
			remote.setCommand(stoveSaute);
			remote.buttonWasPressed();
			remote.setCommand(stoveWarm);
			remote.buttonWasPressed();
			itemTotal = pasta1.getCost();
			
		}
		
		else {			
			System.out.println("Sorry, that item is not available");
			itemTotal = 0;
		}
		
		if (itemTotal != 0) {
			
			JOptionPane.showMessageDialog(null, "Subtotal: $" + itemTotal + "\nTotal: $" + Math.round((itemTotal + .0775) * 100.00) / 100.00);
			JOptionPane.showMessageDialog(null, "Payment method chosen: " + human.paymentMethod);
			SimpleReceiptFactory factory = new SimpleReceiptFactory();
			Checkout checkout = new Checkout(factory);
			//Can i output the console stuff in a pretty java swing screen here too?
			Receipt receipt = checkout.orderReceipt(human.paymentMethod);
			System.out.println("Thank you for your payment method: " + receipt.getName() + "\n");
			
		}
		
		else {
			System.out.println("Please Reorder");
		}
	}
}

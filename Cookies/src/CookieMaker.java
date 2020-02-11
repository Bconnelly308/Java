public class CookieMaker {
	
	public static void main(String[] args) {
		
		Cookies Cookie1 = new Chocolate(new PeanutButter(new PlainCookie()));
		
		System.out.println("- Peanut Butter & Chocolate Cookie -");

		System.out.println("Ingredients: " + Cookie1.getDescription());
		
		System.out.println("Total Price: $" + Cookie1.getCost());
		
		
		Cookies Cookie2 = new Chocolate(new Strawberry(new PlainCookie()));
		
		System.out.println("\n- Chocolate Covered Strawberry Cookie -");

		System.out.println("Ingredients: " + Cookie2.getDescription());
		
		System.out.println("Total Price: $" + Cookie2.getCost());
		
		
		Cookies Cookie3 = new Chocolate(new Pecans(new PlainCookie()));
		
		System.out.println("\n- Turtle Cookie -");

		System.out.println("Ingredients: " + Cookie3.getDescription());
		
		System.out.println("Total Price: $" + Cookie3.getCost());
		
		
		Cookies Cookie4 = new Chocolate(new Peppermint(new PlainCookie()));
		
		System.out.println("\n- Mint Chocolate Cookie -");

		System.out.println("Ingredients: " + Cookie4.getDescription());
		
		System.out.println("Total Price: $" + Cookie4.getCost());
	}

}
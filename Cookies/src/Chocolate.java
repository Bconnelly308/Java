public class Chocolate extends AdditionDecorator {

	public Chocolate(Cookies newCookies) {
		super(newCookies);
		
	}
	
	public String getDescription() {
		
		return tempCookies.getDescription() + ", Chocolate Drizzle";
	}
	
	public double getCost() {
		
		return tempCookies.getCost() + .50;
		
	}

}

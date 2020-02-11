public class Strawberry extends AdditionDecorator {

	public Strawberry(Cookies newCookies) {
		super(newCookies);

	}
	
	public String getDescription() {
		
		return tempCookies.getDescription() + ", Strawberries";
	}
	
	public double getCost() {
		
		return tempCookies.getCost() + 1.50;
		
	}
	
}
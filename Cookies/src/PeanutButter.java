public class PeanutButter extends AdditionDecorator {

	public PeanutButter(Cookies newCookies) {
		super(newCookies);

	}
	
	public String getDescription() {
		
		return tempCookies.getDescription() + ", Peanut Butter Spread";
	}
	
	public double getCost() {
		
		return tempCookies.getCost() + 1.25;
		
	}
	
}
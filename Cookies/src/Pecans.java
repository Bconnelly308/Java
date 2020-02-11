public class Pecans extends AdditionDecorator {

	public Pecans(Cookies newCookies) {
		super(newCookies);
		
	}
	
	public String getDescription() {
		
		return tempCookies.getDescription() + ", Pecans";
	}
	
	public double getCost() {
		
		return tempCookies.getCost() + .75;
		
	}

}

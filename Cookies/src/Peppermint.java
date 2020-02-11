public class Peppermint extends AdditionDecorator {

	public Peppermint(Cookies newCookies) {
		super(newCookies);
		
	}
	
	public String getDescription() {
		
		return tempCookies.getDescription() + ", Peppermint Icing";
	}
	
	public double getCost() {
		
		return tempCookies.getCost() + .75;
		
	}

}

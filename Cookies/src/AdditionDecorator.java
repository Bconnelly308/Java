abstract class AdditionDecorator implements Cookies {
	
	protected Cookies tempCookies;
	
	public AdditionDecorator(Cookies newCookies) {
		
		tempCookies = newCookies;
	}
	
	public String getDescription() {
		
		return tempCookies.getDescription();
	}
	
	public double getCost() {
		
		return tempCookies.getCost();
	
	}

}

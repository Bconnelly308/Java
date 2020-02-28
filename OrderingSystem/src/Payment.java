
public class Payment {
	double itemTotal;
	double tax = .0775;
	
	public Payment(Double itemTotal) {
		this.itemTotal = itemTotal;
	}

	public static double calcTotal() {
		double total = Math.round((itemTotal + tax) * 100.00) / 100.00;
		return total;
		
	}

}
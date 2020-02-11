public class Ordered implements Command {
	Customer customer;
	
	public Ordered(Customer customer) {
		this.customer = customer;
	}
	
	public void execute() {
		customer.ordered();
	}
}
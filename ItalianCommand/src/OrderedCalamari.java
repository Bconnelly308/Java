public class OrderedCalamari implements Command {
	Customer customer;
	
	public OrderedCalamari(Customer customer) {
		this.customer = customer;
	}
	
	public void execute() {
		customer.orderedCalamari();
	}
}
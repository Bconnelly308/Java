public class OrderedCapreseSkewers implements Command {
	Customer customer;
	
	public OrderedCapreseSkewers(Customer customer) {
		this.customer = customer;
	}
	
	public void execute() {
		customer.orderedCapreseSkewers();
	}
}
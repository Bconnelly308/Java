public class Order {
	Command slot;
	
	public Order() {}
		
	public void setCommand(Command command) {
		slot = command;	
	}
	public void orderWasPlaced() {
		slot.execute();
	}
	
	public void orderWasReceived() {
		slot.execute();
	}

	public void orderWasPrepared() {
		slot.execute();
	}
}
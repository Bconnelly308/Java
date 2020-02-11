public class TookOrder implements Command {
	Waitress waitress;
	
	public TookOrder(Waitress waitress) {
		this.waitress = waitress;
	}
	
	public void execute() {
		waitress.tookOrder();
	}
}
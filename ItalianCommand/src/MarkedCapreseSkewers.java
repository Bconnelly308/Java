public class MarkedCapreseSkewers implements Command {
	Waitress waitress;
	
	public MarkedCapreseSkewers(Waitress waitress) {
		this.waitress = waitress;
	}
	
	public void execute() {
		waitress.markedCapreseSkewers();
	}
}
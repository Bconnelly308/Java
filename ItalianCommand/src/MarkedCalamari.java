public class MarkedCalamari implements Command {
	Waitress waitress;
	
	public MarkedCalamari(Waitress waitress) {
		this.waitress = waitress;
	}
	
	public void execute() {
		waitress.markedCalamari();
	}
}
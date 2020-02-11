public class PrepareCapreseSkewers implements Command {
	Chef chef;
	
	public PrepareCapreseSkewers(Chef chef) {
		this.chef = chef;
	}
	
	public void execute() {
		chef.makeCapreseSkewers();
	}
}
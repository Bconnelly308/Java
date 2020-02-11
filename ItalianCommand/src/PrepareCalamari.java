public class PrepareCalamari implements Command {
	Chef chef;
	
	public PrepareCalamari(Chef chef) {
		this.chef = chef;
	}
	
	public void execute() {
		chef.makeCalamari();
	}
}
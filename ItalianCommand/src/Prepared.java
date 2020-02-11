public class Prepared implements Command {
	Chef chef;
	
	public Prepared(Chef chef) {
		this.chef = chef;
	}
	
	public void execute() {
		chef.prepared();
	}
}
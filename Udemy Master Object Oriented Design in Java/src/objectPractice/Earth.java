package objectPractice;

public class Earth {
	public static void main(String args[]) {
	
		//Human 1/2/3/.. is just instance variable(s), object(s) are created when program is ran
		Human human1 = new Human("Tom", 25, 76, "Blue");
		Human human2 = new Human("Joe", 15, 60, "Brown");
		
		human1.speak();
		human2.speak();

	}

}

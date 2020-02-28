package objectPracticeHW;

public class Sparrow extends Bird implements Flyable{

	public Sparrow(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void flying() {
		System.out.println("Sparrow flying high...");
	}

}

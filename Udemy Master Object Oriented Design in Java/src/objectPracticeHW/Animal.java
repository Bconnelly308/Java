package objectPracticeHW;

public abstract class Animal {

	int age;
	String gender;
	int weightInLbs;

	
	public Animal(int age, String gender, int weightInLbs) {
		super();
		this.age = age;
		this.gender = gender;
		this.weightInLbs = weightInLbs;
	}
	
	public void speak() {
		System.out.println("I am " + age + " years old");
		System.out.println("My gender is " + gender);
		System.out.println("My weight is " + weightInLbs + " Lbs");
	}

	public void sleeping() {
		System.out.println("sleeping...");
	}
	
	public void eating() {
		System.out.println("eating...");
	}
	
	public abstract void move();
	
}

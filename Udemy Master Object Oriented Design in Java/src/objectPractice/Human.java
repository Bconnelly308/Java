package objectPractice;
//humans can only do what is specified in this class. if you want them to swim, you have to create that
// objects, constructor, methods
public class Human {
	
	String name;
	int age;
	int heightInInches;
	String eyeColor;
	
	
	//below is constructor, always have same name as class.
	//used to instantiate objects from that class
	//below constructor created auto via.. right click, source, generate constructor using fields
	//below "this" points to the current instance
	public Human(String name, int age, int heightInInches, String eyeColor) {
		super();
		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyeColor = eyeColor;
	}	
	
//methods below specify how the humans will behave	
	public void speak() {
		System.out.println("Hello, my name is " + name);
		System.out.println("I am " + heightInInches + " inches tall");
		System.out.println("I am " + age + " years old");
		System.out.println("My eye color is " + eyeColor);		
		
	}

	//SHORTCUT sysout + enter
	public void eat() {
		System.out.println("eating...");
		
	}
	
	public void walk() {
		System.out.println("walking...");
		
	}

	public void work() {
		System.out.println("working...");
		
	}
	
}

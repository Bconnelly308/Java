package objectPracticeHW;

public class Zoo {
	public static void main(String args[]) {
		
		Flyable flyingBird = new Sparrow(1, "M", 3);
		flyingBird.flying();
	
/*		The below doesn't work since animal in an abstract class
		Animal animal1 = new Animal(12, "F", 23);
		animal1.eating();
		animal1.sleeping();
*/
		Bird bird1 = new Bird(3, "M", 10);
		bird1.eating();
		bird1.sleeping();
		
		Animal fish1 = new Fish(1, "F", 1);
		fish1.eating();
		fish1.sleeping();
		fish1.move();
		
		Fish fish2 = new Fish(1, "F", 1);
		fish2.swim();
		fish2.eating();
		fish2.sleeping();
		fish2.move();
		
		Chicken chick1 = new Chicken(1, "M", 5);
		chick1.eating();
		chick1.sleeping();
		chick1.move();
		
		Animal sparrow1 = new Sparrow(2, "M", 7);
		sparrow1.move();
		
		Sparrow sparrow2 = new Sparrow(2, "M", 7);
		sparrow2.flying();
		sparrow2.move();
		
		//the below is better then having all above individually move
		moveAnimal(fish1);
		moveAnimal(sparrow1);
		
	}
	//the below is better then having all above individually move
	public static void moveAnimal(Animal animal) {
		animal.move();
		
	}
	
}

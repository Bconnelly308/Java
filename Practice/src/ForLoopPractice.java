//When you know exactly how many times you want to loop through a block of code,
//use the for loop instead of a while loop:
/*for (statement 1; statement 2; statement 3)
Statement 1 is executed (one time) before the execution of the code block.
Statement 2 defines the condition for executing the code block.
Statement 3 is executed (every time) after the code block has been executed.*/
public class ForLoopPractice {
	public static void main(String[] args) {
		//example 1
		for (int i = 0; i < 5; i++) {
			  System.out.println(i);
			}
		//example 2
		for (int a = 0; a <= 10; a = a + 2) {
			  System.out.println(a);
			}
		
//For each loop: There is also a "for-each" loop, which is used exclusively to loop through elements in an array:
//for (type variableName : arrayName)
		//example 1
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String b : cars) {
		  System.out.println(b);
		}
	}
}

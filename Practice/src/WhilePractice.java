/*Loops
Loops can execute a block of code as long as a specified condition is reached.
Loops are handy because they save time, reduce errors, and they make code more readable.
*/
public class WhilePractice {
	public static void main(String[] args) {
		//example 1 Java While Loop
		//The while loop loops through a block of code as long as a specified condition is true:
		int i = 0;
		while (i < 5) {
		  System.out.println(i);
		  i++;
		}
		
		//example 2
		//The Do/While Loop
		//The do/while loop is a variant of the while loop. This loop will execute the code block once, 
		//before checking if the condition is true, then it will repeat the loop as long as the condition is true.
		int a = 0;
		do {
		  System.out.println(a);
		  a++;
		}
		while (a < 5);
	}
}

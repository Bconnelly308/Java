public class IfElsePractice {
	public static void main(String[] args) {
		//example 1
		if (20 > 18) {
			  System.out.println("20 is greater than 18");
			}
		//example 2
		int x = 20;
		int y = 18;
		if (x > y) {
		  System.out.println("x is greater than y");
		}
		//example 3
		int time = 20;
		if (time < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		} // Outputs "Good evening."
		//example 4
		int time2 = 22;
		if (time2 < 10) {
		  System.out.println("Good morning.");
		} else if (time2 < 20) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}// Outputs "Good evening."
		//example 5 using: variable = (condition) ? expressionTrue :  expressionFalse;
		int time3 = 20;
		String result = (time3 < 18) ? "Good day." : "Good evening.";
		System.out.println(result);
	}
}

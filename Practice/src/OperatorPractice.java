public class OperatorPractice {

	public static void main(String[] args) {
		// Arithmetic Operators
		int x = 2, y = 3, z = 4;
		int ans1 = x * z;
		int ans2 = x + y;
		int ans3 = x - z;
		int ans4 = z / x;
		int ans5 = x % y; // returns the division remainder
		int ans6 = ++z; // increases values  by 1
		int ans7 = --x; // decreases value by 1
		
		System.out.println("Multiply all: " + ans1);
		System.out.println("Add all: " + ans2);
		System.out.println("Subtract all: " + ans3);
		System.out.println("Division all: " + ans4);
		System.out.println("Modulus all: " + ans5);
		System.out.println("Increment all: " + ans6);
		System.out.println("Decrement all: " + ans7);
		
		int a = 10;
		int b = 20;
		int c = a + b; // z will be 30 (an integer/number)
		System.out.println(c);
		
		String d = "10";
		String e = "20";
		String f = d + e;   // z will be 1020 (a String)
		System.out.println(f);		
		
		String g = "10";
		int h = 20;
		String i = g + h;   // z will be 1020 (a String)
		System.out.println(i);	
	}
}
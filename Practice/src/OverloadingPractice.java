//With method overloading, multiple methods can have the same name with different parameters
public class OverloadingPractice {
	public static int overloadPractice(int x, int y) {
		return x + y;
	}
	public static double overloadPractice(double x, double y) {
		return x + y;		
	}
	
	public static void main(String[] args) {
		int mynum1 = overloadPractice(2, 3);
		double mynum2 = overloadPractice(4.2, 3.2);
		System.out.println("int: " + mynum1);
		System.out.println("int: " + mynum2);
	}
}

public class MethodReturnPractice {
	static int returnPractice(int x, int y) {
		return x + y;
	}
	public static void main(String[]args) {
		System.out.println(returnPractice(20, 5));
		//You can also store the result in a variable (recommended, as it is easier to read and maintain)
		int z = returnPractice(10, 2);
		System.out.println(z);
	}
}
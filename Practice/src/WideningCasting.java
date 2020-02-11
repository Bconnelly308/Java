/* Widening Casting is converting a smaller type to a larger type size
	byte -> short -> char -> int -> long -> float -> double */
public class WideningCasting {
	public static void main(String[] args) {
		int smallInt = 4;
		float bigFloat = smallInt; //Auto casting my 'smallInt' to a float
		
		System.out.println("Integer labeled 'smallInt' is " + smallInt);
		System.out.println("Integer auto converted to float is " + bigFloat);
	}
}

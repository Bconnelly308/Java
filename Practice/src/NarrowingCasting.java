/* Narrowing Casting is converting a larger type to a smaller size type
	double -> float -> long -> int -> char -> short -> byte */
public class NarrowingCasting {
	public static void main(String[] args) {
	    double myDouble = 15.89;
	    int myInt = (int) myDouble; //rounds down

	    System.out.println(myDouble);
	    System.out.println(myInt); 
	}
}
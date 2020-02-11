//The break statement can also be used to jump out of a loop.
//The continue statement breaks one iteration (in the loop), 
//if a specified condition occurs, and continues with the next iteration in the loop.
public class BreakandContinue {
	public static void main(String[] args) {
		//example1
				for (int i = 0; i < 10; i++) {
					  if (i == 4) {
					    break;
					  }
					  System.out.println(i);
					}
				
				//example 2
				for (int a = 0; a < 10; a++) {
					  if (a == 4) {
					    continue;
					  }
					  System.out.println(a);
					}
				
				//example 3
				int b = 0;
				while (b < 10) {
				  System.out.println(b);
				  b++;
				  if (b == 4) {
				    break;
				  }
				}
				
				//example 4
				int c = 0;
				while (c < 10) {
				  if (c == 4) {
				    c++;
				    continue;
				  }
				  System.out.println(c);
				  c++;
				}
	}
}

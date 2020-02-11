//Use the switch statement to select one of many code blocks to be executed.
/* 
 *switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}*/
public class SwitchPractice {
	public static void main(String[] args) {
		//example 1
		int day = 4;
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		}// Outputs "Thursday" (day 4)
		
		//example 2
		int day2 = 4;
		switch (day2) {
		  case 6:
		    System.out.println("Today is Saturday");
		    break;
		  case 7:
		    System.out.println("Today is Sunday");
		    break;
		  default: //default is if there is no match
		    System.out.println("Looking forward to the Weekend");
		}// Outputs "Looking forward to the Weekend"
	}

}

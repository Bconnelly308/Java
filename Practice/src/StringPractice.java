
public class StringPractice {

	public static void main(String[] args) {
		String firstName = "Brittney";
		String lastName = "Connelly";
		String fullName = firstName + " " + lastName; //This is called concatenation
		System.out.println(fullName);
		System.out.println(firstName.concat(lastName)); //can you concat instead of above
		
		String text = "Hello, how are you?";
		System.out.println("The length of the text string is: " + text.length());
		System.out.println(text.toUpperCase());  // Outputs with Caps
		System.out.println(text.toLowerCase());  // Outputs with lower case
		
		String text2 = "Please locate where 'locate' occurs!";
		System.out.println(text2.indexOf("locate")); // Outputs 7
		/*Java counts positions from zero.
		0 is the first position in a string, 1 is the second, 2 is the third ... */
		
		String text3 = "We are the so-called \"Vikings\" from the north.";
		System.out.println(text3);
		
		String text4 = "It\'s alright.";
		System.out.println(text4);
		
		String text5 = "The character \\ is called backslash.";
		System.out.println(text5); 
		
		String text6 = "Hello\nWorld!"; //adds line
	    System.out.println(text6);
	    
	    String txt = "Hello\rWorld!"; //Carriage Return
	    System.out.println(txt);
	    
	    String txt2 = "Hello\tWorld!"; //tab
	    System.out.println(txt2);
	    
	    String txt3 = "Hel\blo World!"; //backspace
	    System.out.println(txt3);
	}

}

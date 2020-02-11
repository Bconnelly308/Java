//Arrays are used to store multiple values in a single variable, 
//instead of declaring separate variables for each value.
//To declare an array, define the variable type with square brackets.
public class ArraysPractice {
	public static void main(String[] args) {
		//example 1
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars[0]); 
		//Array indexes start with 0: [0] is the first element. [1] is the second element, etc.
		// to change a car in an array
		//example 2
		cars[0] = "Opel";
		System.out.println(cars[0]); 
		//example 3
		int[] myNum = {10, 20, 30, 40};				
		//example 4
		String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars2.length);
		//example 5 outputs all elements in the colors array
		String[] colors = {"Blue", "Orange", "Red", "White"};
		for (int i = 0; i < colors.length; i++) {
		  System.out.println(colors[i]);
		}
		//example 6 outputs all elements in the cars array
		String[] cars3 = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars3) {
		  System.out.println(i);
		}
		
		//multidimensional arrays
		//example 7
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		int x = myNumbers[1][2];// 1 means look at the 2nd array because 0,1,. and 2 means looks the 3rd # because 0,1,2,..
		System.out.println(x); // Outputs 7
		
		//example 8
		int[][] myNumbers2 = { {1, 2, 3, 4}, {5, 6, 7} };
	    for (int i = 0; i < myNumbers2.length; ++i) {
	      for(int j = 0; j < myNumbers2[i].length; ++j) {
	        System.out.println(myNumbers2
	        		[i][j]);
	      }
	    }
	}
}
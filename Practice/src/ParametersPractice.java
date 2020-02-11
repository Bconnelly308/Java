//Information can be passed to methods as parameter. Parameters act as variables inside the method.
//Parameters are specified after the method name, inside the parentheses. 
//You can add as many parameters as you want, just separate them with a comma.
public class ParametersPractice {
	public static void parameterPractice(String fname) { //method that takes a String called fname as parameter.
		System.out.println(fname + " Meyer"); // uses this method for output of full name
	}
	public static void main(String[] args) {
		parameterPractice("Hannah");
		parameterPractice("Jennifer");
		parameterPractice("Dennis");
		parameterPractice("Jake");
	}
}
//When a parameter is passed to the method, it is called an argument. 
//So, from the example above: fname is a parameter, while Hannah, Jennifer, Dennis, and Jake are arguments.
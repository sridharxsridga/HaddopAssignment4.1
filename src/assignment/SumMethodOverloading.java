/*
 * Program consisting method sum() and demonstrate the concept of method  overloading using this method.
 * 
 */


package assignment;

public class SumMethodOverloading {

	public static void main(String[] args) {
		System.out.println(sum(10,20)); //Calling sum method to add two values
		System.out.println(sum("Sridhar " , "kumar") ); //Calling sum method to concatenate  two strings
		 
	}

	
	//sum method to concatenate two strings
	private static String sum(String string1, String string2) {
		
		return string1 + string2;
	}

	//orveloading sum method to add two integers 
	private static int sum(int value1, int value2) {
	
		return value1+value2;
	}


}

/*Can you overload a method with same return type.? Explain your answer with proper logic.

Return type of method is not part of method signature, so just changing the return type will not overload a method in Java. 

In fact, just changing the return type will result in compile time error as "Duplicate method sum(int, int) in type problemStatement7.
*/

package assignment;

public class problemStatement7 {

	public static void main(String[] args) {
		System.out.println(sum(10,20)); //Calling sum method to add two values
		System.out.println(sum("Sridhar " , "kumar") ); //Calling sum method to concatenate  two strings
		 
	}

	
	//sum method to concatenate two strings
	private static String sum(int string1, int string2) {
		
		return string1 + string2;
	}

	//orveloading sum method to add two integers 
	private static int sum(int value1, int value2) {
	
		return value1+value2;
	}
}

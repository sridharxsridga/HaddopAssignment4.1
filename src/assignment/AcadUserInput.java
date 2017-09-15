/*
 * Rewriting the  code of acad class, where, inputs are provided by the user at runtime and the output is
   printed.
 * 
 */

package assignment;

import java.util.Scanner;

public class AcadUserInput {

	public static void main(String[] args) {
		// Construct a new Scanner that produces values scanned from the specified input stream.
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Enter first number ");
		
		//Scans the next token of the input as an int and pass to firstValue  
		int firstValue = scanner.nextInt();
		System.out.print("Enter second number ");
		
		//Scans the next token of the input as an int and pass to secondValue  
		int secondValue =  scanner.nextInt();
		
		System.out.println("First number is: "+ firstValue);
		System.out.println("Second number is: "+ secondValue);
		System.out.println("Sum is: "+ (firstValue + secondValue));//Printing the sum of two values

	}

}

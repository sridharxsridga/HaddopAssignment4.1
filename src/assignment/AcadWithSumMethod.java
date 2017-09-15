/*
 *  program with method name sum() that accepts two parameters from user and print
    the sum of two numbers.
 * 
 */

package assignment;

import java.util.Scanner;

public class AcadWithSumMethod {

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
				
				//Calling method sum which prints the sum of two numbers
				sum(firstValue , secondValue);

				

	}

	//method  sum() that accepts two parameters  and prints the sum of two numbers.
	
	private static void sum(int firstValue, int secondValue ) {
		
		System.out.println("Sum is: "+ (firstValue + secondValue));	}

}

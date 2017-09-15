/*
 * Program to find the “first 10 multiples” of the number entered from stdin 
 */
package assignment;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		// Construct a new Scanner that produces values scanned from the specified input stream.
		Scanner scanner = new Scanner(System.in); 
				
		System.out.print("Enter first number ");
				
		//Scans the next token of the input as an int and pass to firstValue  
		int number = scanner.nextInt();
		
		//To print first 10 multiple
		for(int value = 1 ; value <= 10 ; value++ ){
			System.out.println(number + " * " + value + " = " + (number * value));
		}
		

	}

}

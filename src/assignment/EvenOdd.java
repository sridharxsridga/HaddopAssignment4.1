/*
 *  program to accepts two numbers from stdin and find all the odd as well as even
    numbers present in between them.
 * 
 */

package assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// Construct a new Scanner that produces values scanned from the specified input stream.
		Scanner scanner = new Scanner(System.in); 
		
		//Using list to store even numbers , since the size of even numbers is unknown
		
		List<Integer> evenArraylist =  new ArrayList<Integer>();
		
		//Using list to store odd numbers , since the size of even numbers is unknown
		
		List<Integer> oddArraylist =  new ArrayList<Integer>();
		
		System.out.print("Enter first number ");
		
		//Scans the next token of the input as an int and pass to firstValue  
		int firstValue = scanner.nextInt();
		System.out.print("Enter second number ");
		
		//Scans the next token of the input as an int and pass to secondValue  
		int secondValue =  scanner.nextInt();
		
		scanner.close(); //closing the scanner
		
		System.out.println("First number is: "+ firstValue);
		System.out.println("Second number is: "+ secondValue);
		
		
		// Iterate from first number till second number and check if the numbers between them are even or odd , if even add to evenArrayList else to oddArrayList
		for(Integer value = firstValue ; value <= secondValue ; value++ ){
			if (value % 2 == 0)
				evenArraylist.add(value);
			else
				oddArraylist.add(value);
		}
		
		//Iterator to iterate through the evenArraylist array list 
		Iterator iterator = evenArraylist.iterator();
		
		
		System.out.println("Even Number between two numbers are :");
		//till iterator has values print numbers
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		//Iterator to iterate through the oddArraylist array list 
		iterator = oddArraylist.iterator();
		
		System.out.println("Odd Number between two numbers are :");
		//till iterator has values print numbers
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}

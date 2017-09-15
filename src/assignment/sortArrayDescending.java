/*
 * Program in java using Arrays, that sorts the element in descending order.
 * 
 */

package assignment;

public class sortArrayDescending {

	public static void main(String[] args) {
		
		int[] intArray = {3,7,2,5,7,9,23,67,34,77,89} ;  // integer array with values in an unsorted order
		
		
		int high = 0; // this variable will to used to compare the numbers present integer array 
		int temp;  // Variable used for swapping values
		/*
		 * Here we will compare the first value of array with all the numbers present in  the array
		 * if the first number is greater than the elements in array, swap them , so the numbers present at 0 index is compared with rest of the elements
		 * and finally we will store the highest element at zero index
		 * 
		 * This number , (high)  will be incremented , after all the elements are compared. so the next time all the elements are compared with the second element in the array and 
		 * if any number is greater than this will be swapped . and 
		 * 
		 */
		while(high < intArray.length ){  // to compare from element at 0 till  last element
		for(int sortValue = 0 ; sortValue < intArray.length ; sortValue++ ){ // Iterate through the elements in array 
				
		if(intArray[high] > intArray[sortValue]){// If number at 0 position is greater than the elements in the array , swap them
			temp = intArray[sortValue];
			intArray[sortValue] = intArray[high];
			intArray[high]= temp;
		}
						
		}
		high++; //incremeting the index position to be considered for comparing
	}
		
		//Printing the values pressent in the array
		for(int value : intArray){
			System.out.println(value);
		}
		
		
		
		
		
/*		
		int sortedOrder[] = new int[intArray.length];
		int highest = intArray[0]; 
		for(int sortValue = 0 ; sortValue < sortedOrder.length ; sortValue++ ){
			
		
		for(int values = 0 ; values < intArray.length ; values++){
			if (values > highest)
			intArray[values]
		}
		*/
		}

	}



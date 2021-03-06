import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

/*Topics Common Array Algorithms...
 * *- Enhanced For Loop
 * - The length of an array
 * - Finding the max. and min. of an array
 * - finding the sum of the elements of an array
 * - computing the average of the elements of an array
 */
public class AlgorithmArrays {

	public static void main(String args[]) {

		/*
		 * Array of 10 numbers (integers) Looping through an array and printing
		 * the numbers 2 methods
		 */

		int[] array = { 2, 3, 4, 5, 7, 6, 4, 10, 3, 20 };

		for (int index = 0; index < 10; ++index) {
			System.out.println(array[index]);
		}

		for (int index = 0; index < array.length; ++index) {
			System.out.println(array[index]);
		}

		/*
		 * Printing the array in reverse order the index counter is set to 9
		 * elements 9 elements after the 0 position of the array 9 is greater
		 * than or equal to 0
		 */

		for (int index = array.length - 1; index >= 0; index--) {
			System.out.println(array[index]);
		}

		Scanner k = new Scanner(System.in);
		int[] arrayTwo = new int[5];
		// int data = 0;

		/*
		 * Input the data the user inputs, into the array.. Note: think of the
		 * data variable as a dummy variable utilized only to briefly store the
		 * user input b4 it is thrown inside the array...
		 */
		for (int index = 0; index < arrayTwo.length; index++) {
			System.out.println("Enter an integer");
			// data = k.nextInt();
			arrayTwo[index] = k.nextInt();
		}

		for (int index = 0; index < arrayTwo.length; index++) {
			System.out.println("Number in array position" + " " + index + " "
					+ "is" + " " + arrayTwo[index]);
		}

		/*
		 * The user is asking for the size of the array Prompt the user to input
		 * an integer as a length for then array Scan through the array and
		 * insert the number inside the array
		 */
		System.out.println("What is the size of the array?");
		for (int index = 0; index < arrayTwo.length; ++index) {
			arrayTwo[index] = k.nextInt();
			System.out
					.println("The number you chose and placed inside the Array now is"
							+ " " + arrayTwo[index]);

		}

		/*
		 * Finding the max and min inside of an array with numbers
		 */

		int[] arrayThree = { 10, 10, 30, 2, 3, 4, -22 };
		int max;

		// Initialize Current Maximum
		max = arrayThree[0];

		// Scan the array
		for (int index = 0; index < arrayThree.length; index++) {
			// Examine the current element
			if (arrayThree[index] > max)
				// If it is the largest so far, change max
				max = arrayThree[index];
		}
		System.out.println("The maximum of the array is" + " " + max);

		/*
		 * Finding the minimum of a variable
		 */
		//Setup temp. variable
		//The way this Algorithm Works 
		//Compare the first element of the array with the rest of the elements
		//If the first element is greater than the second, replace the temp variable with
		//that number smaller than the first element, keep looping through the array.....
		int min = arrayThree[0];
		for (int index = 1; index < arrayThree.length; ++index){
			if ( min > arrayThree[index] ){
				min = arrayThree[index];
			}
		}
		System.out.println("The Minumum Number In The Array Is" + " " + min);
	}

}

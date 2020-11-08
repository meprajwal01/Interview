package com.interview.tricky;

/*
 * Algorithm: segregateEvenOdd()
 * 	1. Initialize two index variables leftIndex and rightIndex:  
       leftIndex = 0,  rightIndex = myArray.length -1 
 	2. Keep incrementing leftIndex until we see an odd number.
	3. Keep decrementing right index until we see an even number.
	4. Swap myArray[leftIndex] and myArray[rightIndex]
 */
public class SegregateOddEven {

	public static void main(String[] args) {

		int[] myArray = { 1, 12, 34, 45, 9, 8, 90, 30, 10, 3 };

		int leftIndex = 0, rightIndex = myArray.length - 1;

		while (leftIndex < rightIndex) {

			while (myArray[leftIndex] % 2 == 0) {
				leftIndex++;
			}
			while (myArray[rightIndex] % 2 == 1) {
				rightIndex--;
			}

			if (leftIndex < rightIndex) {
				int temp = myArray[leftIndex];
				myArray[leftIndex] = myArray[rightIndex];
				myArray[rightIndex] = temp;

				leftIndex++;
				rightIndex--;
			}

		}
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}
	}
}

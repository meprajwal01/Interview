package com.interview.tricky;

/*
 * 1) If we divide a number between 2 to half of that number and remainder is 0, means thats not prime number.
 * 2) 0 and 1 are not prime number
 */
public class PrimeNumber {

	public static void main(String[] args) {

		// start and end are the range given to us to check prime number between
		// them
		int start = 2, end = 100;

		for (int i = start; i <= end; i++) {

			// 0 and 1 are not prime number hence we are skipping them
			if (start == 0 || start == 1)
				continue;

			boolean isPrime = true;
			for (int j = 2; j < i / 2; j++) {

				// If remainder/mod is 0, means it is not prime
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				System.out.print(" " + i);
		}

	}
}

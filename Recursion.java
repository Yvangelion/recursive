package compare;

import java.util.Scanner;

public class Recursion {

	/*
	 * Computer Science 2 Fall Lab 2 Recursive vs Iterative func
	 *
	 * This lab uses the Fibonacci series to compare recursion and iteration in
	 * order to find which is faster. The program first asks the user to input a
	 * number which will be used to display a Fibonacci position for that number.
	 * These tests are then timed in order to find the best approach for calculating
	 * the number's position in the Fibonacci series . The numbers Fibonacci series
	 * is then printed.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the value of n: ");

		int n = input.nextInt();

		System.out.println(" ");

		System.out.println("Fibonacci using recursion:");

		long start = System.currentTimeMillis();

		start = System.currentTimeMillis();

		//System.out.printf("Element at index %d = %d \n", n, Recursion(n));
		
		System.out.print("Element at index: " + n + " = " + Recursion(n) + "\n");
		
		System.out.printf("Time taken: %d ms\n", System.currentTimeMillis() - start);
		int loopcounttwo = 0, counttwo;

		for (counttwo = 1; counttwo <= n; counttwo++) {

			System.out.printf("%d : %d\n", Recursion(loopcounttwo), counttwo);

			loopcounttwo++;
			input.close();
		}
	}

	static int Recursion(int n) {

		if ((n == 1) || (n == 0)) {

			return n;
		}

		return Recursion(n - 1) + Recursion(n - 2);

	}
}

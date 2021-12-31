package com.greatlearning.transaction;

import java.util.Scanner;

public class Transactions {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// get the size
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();

		// allocate array
		int[] arr = new int[size];
		// iterate through the loop
		System.out.println("Enter the values of array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// get the no of targets
		System.out.println("Enter the total no of targets that needs to be achieved");
		int numtargets = sc.nextInt();

		// loop as many items as we get the no of targets
		for (int i = 0; i < numtargets; i++) {
			// get the target

			System.out.println("Enter the target");
			int target = sc.nextInt();
			// again start a loop to calculate the sum
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				sum = sum + arr[j];
				if (sum >= target) {
					System.out.println("Target achieved after " + (j + 1) + " transactions\n");

					break;
				}
				if (j == arr.length - 1 && sum < target) {
					System.out.println("Given target is not achieved ");
				}
			}
		}
		sc.close();
	}
}
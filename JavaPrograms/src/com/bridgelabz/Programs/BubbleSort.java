package com.bridgelabz.Programs;

import java.util.*;

import com.bridgelabz.Util.Utility;
import com.bridgelabz.Util.Utility;
import com.bridgelabz.Util.Utility;
import com.bridgelabz.Util.Utility;

class BubbleSort {
	public static void main(String[] args) {

		Utility utility = new Utility();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number");
		int number = scanner.nextInt();

		int array[] = new int[number];

		System.out.println("enter the numbers for sorting");

		for (int i = 0; i < number; i++) {
			array[i] = scanner.nextInt();
		}
		
		System.out.println();
		System.out.println("before sorting");

		utility.bubbleSort(array, number);

	}
}

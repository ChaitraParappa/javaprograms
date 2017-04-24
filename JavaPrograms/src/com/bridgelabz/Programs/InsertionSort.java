package com.bridgelabz.Programs;

import java.util.*;
import com.bridgelabz.Util.Utility;

class InsertionSort {
	public static void main(String[] args) {

		Utility utility = new Utility();

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the no of strings");
		int number = scanner.nextInt();

		String array[] = new String[number];
		System.out.println("Enter the strings to sort");

		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.next();
		}

		System.out.println("Before sorting");
		array = utility.array(array);

		array = utility.list(array);

		System.out.println("after sorting");
		utility.array(array);

	}
}

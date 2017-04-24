package com.bridgelabz.Programs;

import java.util.Scanner;

import com.bridgelabz.Util.Utility;

class UtilEx {
	public static void main(String[] args) {

		Utility utility = new Utility();

		int array[] = { 6, 8, 3, 1, 8, 9, 5, 4 };
		String array1[] = { "mango", "apple", "orange", "grapes", "pineapple" };

		System.out.println("The integer numbers");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println();
		System.out.println("The Strings ");

		utility.array(array1);

		utility.binSrch4Int(array, 8);
		System.out.println();

		int index = utility.binSrch4Strng(array1, "apple");
		System.out.println("key found at " + index);
		System.out.println();

		utility.intertSrtn4Int(array);
		System.out.println();

		utility.intertSrt4Strng(array1);
		System.out.println();

		utility.bubble4Int(array);
		System.out.println();

		utility.bubble4Strng(array1);
		System.out.println();

	}
}

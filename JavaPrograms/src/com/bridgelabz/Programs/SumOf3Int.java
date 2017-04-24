package com.bridgelabz.Programs;

import java.util.Scanner;
import com.bridgelabz.Util.Utility;

class SumOf3Int {
	public static void main(String[] args) {

		Utility utility = new Utility();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the array size ");
		int number = scanner.nextInt();

		int array[] = new int[number];

		System.out.println("Enter the elements ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.println("The array is");

		utility.disp(array);
		utility.sum(array);

	}

}

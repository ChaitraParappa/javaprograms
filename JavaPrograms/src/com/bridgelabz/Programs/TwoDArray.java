package com.bridgelabz.Programs;

import java.util.*;
import com.bridgelabz.Util.Utility;

class TwoDArray {
	public static void main(String[] args) {

		Utility utility = new Utility();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of rows");
		int row = scanner.nextInt();

		System.out.println("Enter the number of columns");
		int column = scanner.nextInt();

		int array[][] = new int[row][column];

		array = utility.input(array);

		utility.display(array);

	}

}

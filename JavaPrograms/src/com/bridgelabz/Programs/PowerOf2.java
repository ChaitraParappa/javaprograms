package com.bridgelabz.Programs;

import java.util.*;
import com.bridgelabz.Util.Utility;

class PowerOf2 {
	public static void main(String[] args) {

		Utility utility = new Utility();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number ");
		int number = scanner.nextInt();

		utility.power(number);

	}
}

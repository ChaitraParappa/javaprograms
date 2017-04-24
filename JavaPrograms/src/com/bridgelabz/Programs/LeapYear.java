package com.bridgelabz.Programs;

import java.util.Scanner;
import com.bridgelabz.Util.Utility;

class LeapYear {
	public static void main(String[] args) {
		Utility utility = new Utility();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the year to check it is leap year  ");
		int year = scanner.nextInt();

		utility.isLeapYear(year);

	}

}

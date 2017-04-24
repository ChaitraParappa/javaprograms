package com.bridgelabz.Programs;

import java.util.Scanner;

import com.bridgelabz.Util.Utility;

class RegexEx {
	public static void main(String[] args) {

		Utility utility = new Utility();

		Scanner scanner = new Scanner(System.in);
		Scanner scanner1 = new Scanner(System.in);

		String st = "Hello <<name>>, We have your full name as <<full name>> in our system."
				+ " your contact number is 91-xxxxxxxxxx."
				+ "Please,let us know in case of any clarification "
				+ "Thank you BridgeLabz 01/01/2016";

		System.out.println("Enter the name");
		String name = scanner.next();

		System.out.println("Enter your fullname");
		String fullname = scanner1.nextLine();

		System.out.println("Enter your mobile number");
		String mobilenumber = scanner.next();

		System.out.println("Enter the date");
		String date = scanner.next();

		utility.replacing(st, name, fullname, mobilenumber, date);
	}
}

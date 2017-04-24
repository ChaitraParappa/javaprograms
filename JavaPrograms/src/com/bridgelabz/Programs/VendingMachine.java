package com.bridgelabz.Programs;

import java.util.Scanner;

import com.bridgelabz.Util.Utility;

class VendingMachine {
	public static void main(String[] args) {

		Utility utility = new Utility();

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the amount ");
		int amount = scanner.nextInt();

		utility.calculate(amount);

	}

}

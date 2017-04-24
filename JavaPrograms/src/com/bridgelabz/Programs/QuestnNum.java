package com.bridgelabz.Programs;

import java.util.Scanner;

import com.bridgelabz.Util.Utility;

class QuestnNum {
	public static void main(String[] args) {

		Utility utility = new Utility();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number  ");
		int number = scanner.nextInt();

		number = utility.powerOf2(number);

		int number1 = utility.binary(0, number - 1);

		System.out.println("the number is " + number1);

	}
}

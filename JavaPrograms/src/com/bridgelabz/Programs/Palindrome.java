package com.bridgelabz.Programs;

import java.util.Scanner;

import com.bridgelabz.Util.Utility;

class Palindrome {
	public static void main(String[] args) {

		Utility utility = new Utility();

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the string");
		String string = scanner.next();

		utility.isPalindrome(string);
	}

}

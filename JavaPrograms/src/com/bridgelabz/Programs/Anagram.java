package com.bridgelabz.Programs;

import java.util.*;
import com.bridgelabz.Util.Utility;

class Anagram {
	public static void main(String[] args) {

		Utility utility = new Utility();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the  first string  ");
		String string = scanner.nextLine();

		System.out.println("Enter the  second string  ");
		String string1 = scanner.nextLine();

		if (utility.isAnagram(string, string1))
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");

	}

}

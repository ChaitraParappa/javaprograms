package com.bridgelabz.Programs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.Util.Utility;

class UnOrderedList {
	public static void main(String[] args) throws Exception {

		Utility utility = new Utility();
		ArrayList<String> arraylist = new ArrayList<String>();

		String filename = "/home/bridgelabz6/javaprograms/JavaPrograms/src/com/bridgelabz/Programs/f1.txt";

		Scanner scanner = new Scanner(new File(filename));
		String string = scanner.nextLine();

		String array[] = string.split(" ");

		for (int i = 0; i < array.length; i++) {
			arraylist.add(array[i]);
		}

		System.out.println(arraylist);

		System.out.println("Enter the word to search");
		scanner = new Scanner(System.in);
		String string1 = scanner.next();

		utility.searchingForWords(string1, arraylist);

	}

}

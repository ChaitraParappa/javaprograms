package com.bridgelabz.Programs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.Util.Utility;

class OrderedList {
	public static void main(String[] args) throws IOException {

		Utility utility = new Utility();
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		BufferedReader bufferedreader = null;
		FileReader filereader = null;
		Scanner scanner = new Scanner(System.in);

		String filename = "/home/bridgelabz6/javaprograms/JavaPrograms/src/com/bridgelabz/Programs/f2.txt";
		String string = null;

		filereader = new FileReader(filename);
		bufferedreader = new BufferedReader(filereader);

		String array[] = null;

		while ((string = bufferedreader.readLine()) != null) {
			array = string.split(" ");
		}

		int array1[] = new int[array.length];

		array1 = utility.sorting(array, array1);

		for (int i = 0; i < array1.length; i++) {
			arraylist.add(array1[i]);
		}

		System.out.println("Enter number to search");
		int number = scanner.nextInt();

		utility.searchNum(number, arraylist, array1);

	}
}

package com.bridgelabz.Programs;

import com.bridgelabz.Util.Utility;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class WordList {
	public static void main(String[] args) throws IOException {
		Utility utility = new Utility();

		Scanner scanner = new Scanner(System.in);

		String filename = "/home/bridgelabz6/javaprograms/JavaPrograms/src/com/bridgelabz/Programs/word.txt";

		String array[] = utility.readingFile(filename);

		Arrays.sort(array);

		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}

		System.out.println();
		System.out.println("Enter the key");
		String key = scanner.next();

		int index = utility.binarySearch(array, key);

		if (index == -1)
			System.out.println("key not found");
		else
			System.out.println("key found at index " + (index - 1));

	}

}

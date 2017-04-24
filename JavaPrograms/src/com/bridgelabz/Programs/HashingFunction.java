package com.bridgelabz.Programs;

import java.io.*;
import java.util.*;

import com.bridgelabz.Util.Utility;

class HashingFunction {
	public static void main(String[] args) throws IOException {

		Utility utility = new Utility();

		Scanner scanner = new Scanner(System.in);
		int array[] = new int[11];
		int i = 0;

		scanner = new Scanner(
				new File(
						"/home/bridgelabz6/javaprograms/javaprograms/src/programs/f3.txt"));
		scanner.useDelimiter(",");

		while (scanner.hasNext()) {
			int id = scanner.nextInt();
			array[i] = id;
			i++;
		}

		HashMap hashmap = utility.addingHash(array);

		System.out.println("Enter the number to search");
		scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		utility.searchhash(hashmap, number, array);

	}

}

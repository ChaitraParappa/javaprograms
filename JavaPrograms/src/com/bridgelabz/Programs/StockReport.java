package com.bridgelabz.Programs;

import java.util.*;
import com.bridgelabz.Util.Utility;

class StockReport {
	public static void main(String[] args) {

		Utility utility = new Utility();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of stocks");
		int number = scanner.nextInt();

		int array[] = new int[number];
		String array1[] = new String[number];
		int k = 0;

		for (int i = 1; i <= number; i++) {
			System.out.println("Enter the stock " + i + " name");
			String name = scanner.next();
			array1[k] = name;

			System.out.println("enter the no of share");
			int numberofshare = scanner.nextInt();

			System.out.println("Enter the share price");
			int shareprice = scanner.nextInt();

			int total = numberofshare * shareprice;
			array[k] = total;
			k++;
		}
		System.out.println();
		for (int i = 0; i < number; i++) {
			System.out.println("The " + array1[i] + " total value of stock is "
					+ array[i]);
		}
		System.out.println();

		utility.stockReport(array);

	}

}

package com.bridgelabz.Programs;

import java.util.Scanner;

import com.bridgelabz.Util.*;

class BankingCashCounter {
	public static void main(String[] args) {

		Utility utility = new Utility();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number person is in queue ");
		int number = scanner.nextInt();

		Queue queue = new Queue(number);

		System.out.println("Customer details");

		for (int i = 1; i <= number; i++) {
			System.out.println("Customer " + i + " name  ");
			String name = scanner.next();
			queue.enque(name);
		}

		System.out.println();

		for (int j = 0; j < number; j++) {
			utility.bankOperation(queue);
		}

		System.out.println("Queue empty");

	}

}

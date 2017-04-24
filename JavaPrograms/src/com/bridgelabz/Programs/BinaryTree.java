package com.bridgelabz.Programs;

import java.util.Scanner;

import com.bridgelabz.Util.Utility;

class BinaryTree {
	public static void main(String[] args) {
		Utility utility = new Utility();
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of nodes");
		int number = scanner.nextInt();

		int result = utility.findingTrees(number);
		System.out.println("the tress are " + result);
	}

}

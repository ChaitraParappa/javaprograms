package com.bridgelabz.Programs;

import java.util.*;
import com.bridgelabz.Util.Utility;

class Replace {
	public static void main(String[] args) {

		Utility utility = new Utility();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your name ");
		String name = scanner.nextLine();

		name = utility.replace(name);

		System.out.println(name);
	}

}

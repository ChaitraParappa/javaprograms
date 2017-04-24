package com.bridgelabz.Programs;

import java.util.*;
import com.bridgelabz.Util.Utility;

class FilpCoin {
	public static void main(String[] args) {

		Utility utility = new Utility();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of times to flip the coin ");
		int number = scanner.nextInt();

		utility.filpCoin(number);

	}

}

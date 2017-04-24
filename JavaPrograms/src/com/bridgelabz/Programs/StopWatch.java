package com.bridgelabz.Programs;

import java.util.*;

import com.bridgelabz.Util.Utility;

class StopWatch {
	public static void main(String[] args) {

		Utility utility = new Utility();
		long starttime = 0, stoptime = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Press 0 to start time and 1 to stop time");
		int choice = scanner.nextInt();

		if (choice == 0)
			starttime = utility.startTime();

		int choice1 = scanner.nextInt();

		if (choice1 == 1)
			stoptime = utility.stopTime();

		utility.ellapseTime(starttime, stoptime);

	}

}

package com.bridgelabz.Util;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * methods of for all Programs
 * 
 * @author
 * 
 */
public class Utility {
	static ArrayList arraylist = new ArrayList();
	Scanner scanner = new Scanner(System.in);
	FileWriter filewriter = null;
	BufferedWriter bufferwriter = null;

	/**
	 * the method to replace the user name in string
	 * 
	 * @param string
	 *            the string
	 * @return returns the replaced string
	 */
	public String replace(String string) {

		if (string.length() > 3)
			string = "HELLO " + string + " , HOW ARE YOU?";

		return string;
	}

	/**
	 * the method to calculate the percentage of head and tail
	 * 
	 * @param number
	 *            number of filps
	 */
	public void filpCoin(int number) {
		float headcount = 0, tailcount = 0, headper = 0, tailper = 0;

		for (int i = 0; i < number; i++) {
			double number1 = Math.random();

			if (number1 < 0.500000000000000000000) {
				headcount++;
			} else {

				tailcount++;
			}
		}

		headper = ((headcount / number) * 100);
		tailper = ((tailcount / number) * 100);

		System.out.println("The percentage of head count is " + headper);
		System.out.println("The percentage of tail count is " + tailper);

	}

	/**
	 * the method to find the year is leap year or not
	 * 
	 * @param year
	 *            year
	 */
	public void isLeapYear(int year) {

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is  not a leap year");
		}

	}

	/**
	 * the method to calculate the power of 2
	 * 
	 * @param number
	 *            the power
	 */
	public void power(int number) {
		int power = 2;

		for (int i = 0; i < number; i++) {
			System.out.println(power);
			power = power * 2;
		}

	}

	/**
	 * the method to calculate the nth harmonic number
	 * 
	 * @param n
	 *            the number
	 */
	public void number(int number) {
		double sum = 0;

		for (double i = 1; i <= number; i++) {
			System.out.print("1/" + i + " +");
			sum = sum + (1 / i);

		}
		System.out.println();
		System.out.println("The nth Harmonic num is " + sum);

	}

	/**
	 * the method to calculate the factorization of number
	 * 
	 * @param num
	 *            the number
	 */
	public void factorization(int number) {

		for (int j = 2; j <= number; j++) {

			if (isPrime(j)) {

				if (number % j == 0)
					System.out.println(j);
			}

		}
	}

	/**
	 * the method to find the number is prime or not
	 * 
	 * @param num
	 * 
	 *            the number
	 * @return true if it is prime otherwise false
	 */
	private boolean isPrime(int number) {
		int i = 2;

		while (i <= number / 2) {
			if (number % i == 0)
				return false;
			i++;
		}

		return true;

	}

	/**
	 * the method to calculate the gambler game win and loss
	 * 
	 * @param stake
	 *            the investment
	 * @param goal
	 *            the goal to win
	 * @param number
	 *            number of plays
	 */
	public void playGambler(int stake, int goal, int number) {
		double win = 0, loss = 0;
		double winper = 0, lossper = 0;

		for (int i = 1; i <= number; i++) {

			if (stake > 0 && stake < goal) {
				double number1 = Math.random();

				System.out.println("random " + number1);
				if (number1 < 0.50000) {
					stake--;
					loss++;
				} else {
					stake++;
					win++;
				}
			}
		}
		if (stake == goal)
			win++;

		System.out.println("The number of wins are " + win);
		System.out.println("The number of loss are " + loss);

		winper = ((win / number) * 100);
		lossper = ((loss / number) * 100);

		System.out.println("Win percentage " + winper);
		System.out.println("Loss percentage " + lossper);
	}

	/**
	 * the method to calculate distinct coupon number
	 * 
	 * @param num
	 *            the number
	 */
	public void coupNumber(int number) {
		int count = 0;
		int array[] = new int[number];

		for (int i = 0; i < array.length; i++) {
			Random random = new Random();
			int number1 = (random.nextInt(number) + 1);
			count++;
			array[i] = number1;

			for (int j = 0; j < i; j++) {
				if (array[j] == number1) {
					i--;
					break;
				}
			}
		}

		for (int k = 0; k < array.length; k++) {
			System.out.print(array[k] + " ");
		}

		System.out.println();
		System.out.println("Count " + count);
	}

	/**
	 * the method to display the 2-D array
	 * 
	 * @param array
	 *            the 2-d array
	 */
	public void display(int[][] array) {
		System.out.println("The 2D Array");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * the method to display single dimentional array
	 * 
	 * @param array
	 *            the array
	 */
	public void disp(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	/**
	 * the method to calculate the sum of 3 integer
	 * 
	 * @param array
	 *            the array
	 */
	public void sum(int[] array) {
		int count = 0;

		for (int i = 0; i < array.length - 2; i++) {
			for (int j = i + 1; j < array.length; j++) {
				for (int k = j + 1; k < array.length; k++) {
					if (array[i] + array[j] + array[k] == 0) {
						count++;
						System.out.println("The triplets " + array[i] + " "
								+ array[j] + " " + array[k]);

					}
				}
			}
		}
		System.out.println("Count " + count);
	}

	/**
	 * the method to find the strings are anagram or not
	 * 
	 * @param string
	 *            the string
	 * @param string1
	 *            another string to compare
	 * @return true if it is anagram otherwise false
	 */
	public boolean isAnagram(String string, String string1) {
		string = removeSpace(string);
		string1 = removeSpace(string1);

		if (string.length() != string1.length())
			return false;
		else {
			string = lowerCase(string);
			string1 = lowerCase(string1);
		}

		boolean balance = check(string, string1);

		return balance;

	}

	/**
	 * the method to check the two strings are equal or not
	 * 
	 * @param string
	 *            (string1)
	 * @param string1
	 *            (string2)
	 * @return (false if two strings are not equal or true if equal)
	 */
	private boolean check(String string, String string1) {
		char array1[] = string.toCharArray();
		char array2[] = string1.toCharArray();

		array1 = sort(array1);
		array2 = sort(array2);

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i])
				return false;
		}
		return true;
	}

	/**
	 * the method to sort the characters
	 * 
	 * @param array
	 *            (characters)
	 * @return array (sorted character list)
	 */
	static char[] sort(char array[]) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					char temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	/**
	 * this method convert characters into lowercase
	 * 
	 * @param string
	 *            (string)
	 * @return string (string in lowercase)
	 */
	private String lowerCase(String string) {
		char array[] = string.toCharArray();
		string = "";

		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 'A' && array[i] <= 'Z') {
				string = string + (char) (array[i] + 32);
			} else
				string = string + array[i];
		}
		return string;
	}

	/**
	 * the method removespace form the string
	 * 
	 * @param string
	 *            (string with space)
	 * @return string (string without space)
	 */
	private String removeSpace(String string) {
		char array[] = string.toCharArray();
		string = "";

		for (int i = 0; i < array.length; i++) {

			if ((i == 0 && array[i] != ' ') || array[i] != ' ') {
				string = string + array[i];
			}
		}
		return string;
	}

	/**
	 * the method to calculate total value of each Stock and the total value of
	 * Stock.
	 * 
	 * @param array
	 *            array of each total value of each Stock and the total value of
	 *            Stock.
	 */
	public void stockReport(int[] array) {
		int sum = 0;

		for (int j = 0; j < array.length; j++) {
			sum = sum + array[j];
		}
		System.out.println("The total stock report is " + sum);
	}

	/**
	 * this method return the start current time in millisecond
	 * 
	 * @return starttime(milisecond)
	 */
	public long startTime() {
		long starttime = 0;

		starttime = System.currentTimeMillis();
		return starttime;
	}

	/**
	 * this method return the start current time in millisecond
	 * 
	 * @return stoptime(millisecond)
	 */
	public long stopTime() {
		long stoptime = 0;

		stoptime = System.currentTimeMillis();
		return stoptime;
	}

	/**
	 * the method calculate the ellapsetime
	 * 
	 * @param st
	 *            (starttime)
	 * @param stoptime
	 *            (stoptime)
	 */
	public void ellapseTime(long starttime, long stoptime) {
		long time = 0;

		System.out.println("Time duration between start and stop");

		time = (stoptime - starttime) / 1000;

		System.out.println(time + "  seconds");

	}

	/**
	 * the method to find power of 2
	 * 
	 * @param num
	 *            the number
	 * @return power of 2
	 */
	public int powerOf2(int number) {
		int pow = 2;

		for (int i = 0; i < number; i++) {
			pow = pow * 2;
		}
		number = pow;
		return number;

	}

	/**
	 * the method to for binary search
	 * 
	 * @param low
	 *            starting index
	 * @param high
	 *            last index
	 * @return the key
	 */
	public int binary(int low, int high) {
		Scanner scanner = new Scanner(System.in);

		if (high - low == 1)
			return high;

		int mid = (low + high) / 2;

		System.out.println("Is your number less than " + mid
				+ " press true if less otherwise false");

		boolean check = scanner.nextBoolean();

		if (check)
			return binary(low, mid);
		else
			return binary(mid, high);

	}

	/**
	 * the method to read the contents from file
	 * 
	 * @param filename
	 *            the filename
	 * @return the string
	 */
	public String[] readingFile(String filename) {

		Scanner scanner = new Scanner(System.in);
		String array[] = new String[7];
		int count = 0;

		try {
			scanner = new Scanner(new File(filename));
			scanner.useDelimiter(",");
		} catch (Exception e) {
			System.out.println("Could not find file");
		}

		while (scanner.hasNext()) {
			String id = scanner.next();
			array[count] = id;
			count++;
		}
		return array;
	}

	/**
	 * the method to sort the strings
	 * 
	 * @param string
	 *            unsorted string
	 * @param key
	 *            the key to search
	 * @return index of key
	 */
	public int binarySearch(String[] array, String key) {

		return search(key, array, 0, array.length);
	}

	/**
	 * the method of binary search
	 * 
	 * @param key
	 *            the key to find
	 * @param array
	 *            the string
	 * @param low
	 *            the index
	 * @param high
	 *            the index
	 * @return the key index
	 */
	private int search(String key, String[] array, int low, int high) {
		if (high <= low)
			return -1;

		int mid = low + (high - low) / 2;

		int number = array[mid].compareTo(key);

		if (number > 0)
			return search(key, array, low, mid);
		else if (number < 0)
			return search(key, array, mid + 1, high);
		else
			return mid;
	}

	/**
	 * the method to display the strings
	 * 
	 * @param array
	 *            the string
	 * @return the displayed string
	 */
	public String[] array(String[] array) {
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
		System.out.println();
		return array;
	}

	/**
	 * the method to sorting the strings
	 * 
	 * @param array
	 *            the array of strings
	 * @return the sorted strings
	 */
	public String[] list(String[] array) {
		for (int i = 1; i < array.length; i++)

		{
			String item = array[i];
			int j = i;

			while (j > 0 && item.compareTo(array[j - 1]) < 0) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = item;
		}
		return array;
	}

	/**
	 * the method to sorting the numbers using bubblesort
	 * 
	 * @param array
	 *            the array of numbers
	 * @param num
	 *            the key to find
	 */
	public void bubbleSort(int[] array, int number) {
		for (int j = 0; j < number; j++) {
			System.out.print(array[j] + " ");
		}

		int number1 = array.length;
		int temp = 0;

		for (int i = 0; i < number1; i++) {
			for (int j = 1; j < (number1 - i); j++) {
				if (array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("after sorting");

		for (int k = 0; k < number1; k++) {
			System.out.print(array[k] + " ");
		}

	}

	/**
	 * the method to sorting the numbers using binary search
	 * 
	 * @param array
	 *            the array of numbers
	 * @param key
	 *            the key to find
	 */
	public void binSrch4Int(int[] array, int key) {
		System.out.println("binary search for integer ");
		int number = 8;
		int first = 0;
		int last = number - 1;
		int middle = (first + last) / 2;

		while (first <= last) {
			if (array[middle] < key)
				first = middle + 1;
			else if (array[middle] == key) {
				System.out.println(key + " found at location " + (middle + 1)
						+ ".");
				break;
			} else
				last = middle - 1;
			middle = (first + last) / 2;
		}

		if (first > last)
			System.out.println(key + " is not present in the list.\n");
	}

	/**
	 * the method to find the key using binarysearch
	 * 
	 * @param array
	 *            the array of strings
	 * @param key
	 *            the key to search
	 * @return returns the index
	 */
	public int binSrch4Strng(String[] array, String key) {

		System.out.println("binary search for strings ");
		return search(key, array, 0, array.length);
	}

	/**
	 * the method to sorting the numbers using insertion sort
	 * 
	 * @param array
	 *            array of numbers
	 */
	public void intertSrtn4Int(int[] array) {
		System.out.println("insertion sort for integers");
		int length = array.length;

		for (int j = 1; j < length; j++) {
			int key = array[j];
			int i = j - 1;

			while ((i > -1) && (array[i] > key)) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}
		System.out.print("After sorted ");

		for (int k = 0; k < array.length; k++) {
			System.out.print(array[k] + " ");
		}
		System.out.println();
	}

	/**
	 * the method to sorting the strings using insertion sort
	 * 
	 * @param string
	 *            the array of strings
	 */
	public void intertSrt4Strng(String[] array) {
		System.out.println("insertion sort for strings");
		for (int i = 1; i < array.length; i++) {
			String item = array[i];
			int j = i;

			while (j > 0 && item.compareTo(array[j - 1]) < 0) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = item;
		}
		System.out.print("After sorted ");

		for (int k = 0; k < array.length; k++) {
			System.out.print(array[k] + " ");
		}
		System.out.println();
	}

	/**
	 * the method to sorting the numbers using bubblesort
	 * 
	 * @param array
	 *            of numbers
	 */
	public void bubble4Int(int[] array) {
		System.out.println("bubble sort for integers");
		int length = array.length;
		int temp = 0;

		for (int i = 0; i < length; i++) {
			for (int j = 1; j < (length - i); j++) {
				if (array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.print("After sorted ");
		for (int k = 0; k < array.length; k++) {
			System.out.print(array[k] + " ");
		}
		System.out.println();
	}

	/**
	 * the method to sorting the strings using bubblesort
	 * 
	 * @param array
	 *            the array of strings
	 */
	public void bubble4Strng(String[] array) {
		System.out.println("bubble sort for strings");
		String temp;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}

			}
		}

		System.out.print("After sorted ");
		for (int k = 0; k < array.length; k++) {
			System.out.print(array[k] + " ");
		}
		System.out.println();
	}

	Node head = null;

	/**
	 * the method to search the element in the list
	 * 
	 * @param ob
	 *            the element to search
	 * @return true if find otherwise false
	 */
	public boolean search(String object) {
		Node temp = head;

		while (temp != null) {
			if (((String) temp.data).equalsIgnoreCase(object)) {
				return true;
			}
			temp = temp.link;

		}
		return false;

	}

	/**
	 * the method to remove the node from list
	 * 
	 * @param object
	 *            the object to remove
	 */
	public void remove(String object) {
		Node temp = head;
		Node prev = null;

		if (((String) temp.data).equals(object)) {
			head = head.link;
		}
		while (temp != null && !((String) temp.data).equalsIgnoreCase(object)) {
			prev = temp;
			temp = temp.link;
		}
		prev.link = temp.link;
	}

	/**
	 * the method to add the string into the arraylist
	 * 
	 * @param array
	 *            the array of strings
	 */
	public void add(String[] array) {
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
			arraylist.add(array[j]);
		}
	}

	/**
	 * the method to to search the key in list
	 * 
	 * @param n
	 *            the key
	 * @param l
	 *            the list
	 * @param string
	 *            the string
	 */
	public void searchList(int number, ArrayList arraylist, String[] array) {
		for (int i = 0; i < array.length; i++) {
			int temp = Integer.parseInt(array[i]);

			if (temp == number) {
				System.out.println("found");
				arraylist.remove(array[i]);

				for (int k = 0; k < arraylist.size(); k++) {
					System.out.print(arraylist.get(k) + " ");
				}
				break;
			}
			if (i == array.length - 1) {
				int b[] = new int[array.length + 1];

				Integer myInt = Integer.valueOf(number);
				Object myObject = myInt;

				System.out.println("not found");
				arraylist.add(myObject);
				for (int k = 0; k < arraylist.size(); k++) {
					System.out.print(arraylist.get(k) + " ");
				}

			}

		}
	}

	/**
	 * the method to find the paranthesis is balanced or not
	 * 
	 * @param string
	 *            the string
	 * @return true if balenced otherwise false
	 */
	public boolean isBalanced(String string) {
		Stack stack = new Stack(string.length());
		char array[] = string.toCharArray();

		for (int i = 0; i < array.length; i++) {
			if (array[i] == '(') {
				stack.push(array[i]);
			} else {
				switch (array[i]) {
				case ')':
					if (stack.pop() != '(')

						break;
				default:
					break;
				}
			}
		}
		return stack.isEmpty();

	}

	/**
	 * the method to perform the bankoperation
	 * 
	 * @param queue
	 *            the queue
	 */
	public void bankOperation(Queue queue) {
		Object object = queue.deque();

		System.out.println("The customer name is " + object);
		System.out
				.println("Please enter the account number if u have otherwise enter 0  ");
		int accountnumber = scanner.nextInt();

		if (accountnumber > 0) {
			int balance = accountInformation(accountnumber);

			if (balance > 0) {
				System.out.println("Bank operation");
				System.out.println("Press 1 - withdraw ");
				System.out.println("Press 2 - deposit ");
				System.out.println("Press 3 - balance enquery  ");
				int choice = scanner.nextInt();

				if (choice == 1) {
					System.out.println("Enter the amount to withdraw  ");
					int withdraw = scanner.nextInt();

					if (withdraw < balance) {
						balance = balance - withdraw;
						System.out.println("Operation Successfull");
						System.out.println("Your remaining balance is "
								+ balance);
					} else {
						System.out.println("You don't have suffieient balance");
					}

				} else if (choice == 2) {
					System.out.println("Enter the amount to deposit  ");
					int deposit = scanner.nextInt();

					balance = balance + deposit;
					System.out.println("Operation Successfull");
					System.out.println("Your balance is " + balance);
				} else if (choice == 3) {
					System.out.println("Your balence is " + balance);
				}

			} else {
				System.out
						.println("You dont have account in the bank please open the account");
			}
		} else {
			System.out
					.println("You dont have account in the bank please open the account");
			return;
		}

	}

	/**
	 * the method to storing the account information
	 * 
	 * @param no
	 *            the account number
	 * @return
	 */
	static int accountInformation(int accountnumber) {
		int balance;

		switch (accountnumber) {
		case 111:
			balance = 10000;
			return balance;

		case 112:
			balance = 11000;
			return balance;

		case 113:
			balance = 15000;
			return balance;

		case 114:
			balance = 20000;
			return balance;

		case 115:
			balance = 25000;
			return balance;

		case 116:
			balance = 30000;
			return balance;

		case 117:
			balance = 9000;
			return balance;

		case 118:
			balance = 22000;
			return balance;

		case 119:
			balance = 27000;
			return balance;

		case 120:
			balance = 40000;
			return balance;

		default:
			return 0;
		}
	}

	/**
	 * the method to check the string is palindrome or not
	 * 
	 * @param string
	 *            the string
	 */
	public void isPalindrome(String string) {
		int i;

		if (string.length() % 2 == 0) {
			char array[] = string.toCharArray();
			int j = array.length - 1;
			int mid = array.length / 2 - 1;

			System.out.println("length" + mid);

			for (i = 0; i <= mid; i++) {
				if (array[i] != array[j]) {
					System.out.println("not palindrome");
					break;
				}
				j--;
			}

			if (i == mid + 1)
				System.out.println("palindrome");

		} else {
			char array[] = string.toCharArray();
			int j = array.length - 1;
			int mid = array.length / 2;

			for (i = 0; i < mid; i++) {
				if (array[i] != array[j]) {
					System.out.println("not palindrome");
					break;
				}
				j--;
			}
			if (i == mid)
				System.out.println("palindrome");

		}
	}

	/**
	 * the method to find the number of notes requried to given amount
	 * 
	 * @param n
	 *            the amount
	 */
	public void calculate(int amount) {
		int array[] = { 1, 2, 5, 10, 50, 100, 500, 1000 };
		int sum = amount, temp = 0, total = 0;
		int length = array.length - 1;

		while (sum > 0 && length >= 0) {
			int c = 0;
			temp = sum;
			sum = sum % array[length];

			if (temp != sum) {
				c = temp / array[length];
				total = total + c;
				System.out.println("The " + array[length]
						+ " rupee notes require is " + c);
			}
			length--;
		}
		System.out
				.println("Total " + total + " notes requires for the amount.");
	}

	/**
	 * the method for adding the key into hashmap
	 * 
	 * @param number3
	 *            the strings to add to map
	 * @return returns hashmap
	 */
	public HashMap addingHash(int[] array) {
		// ArrayList arraylist = new ArrayList();
		HashMap hashmap = new HashMap();
		ArrayList arraylist = null;

		for (int j = 0; j < array.length + 1; j++) {
			Integer number = Integer.valueOf(j);
			Object number1 = number;

			hashmap.put(number1, new ArrayList());
		}

		for (int k = 0; k < array.length; k++) {
			int temp = array[k] % (array.length + 1);

			Integer number = Integer.valueOf(temp);
			Object number1 = number;

			arraylist = (ArrayList) hashmap.get(number1);

			Integer number2 = Integer.valueOf(array[k]);
			Object number3 = number2;

			arraylist.add(number3);

		}
		System.out.println(hashmap);
		return hashmap;
	}

	/**
	 * the method to search the key if key found then the key is removing from
	 * hashmap if not found adding into hash map
	 * 
	 * @param hashmap
	 *            hashmap
	 * @param number
	 *            the key to search
	 * @param array
	 *            the string
	 */
	public void searchhash(HashMap hashmap, int number, int[] array) {
		ArrayList arraylist = null;
		boolean flag = false;

		Integer number1 = Integer.valueOf(number);
		Object object = number1;

		for (int j = 0; j < array.length + 1; j++) {

			Integer k = Integer.valueOf(j);
			Object ob = k;
			ArrayList list = (ArrayList) hashmap.get(ob);
			if (list.contains(object)) {
				flag = true;
				list.remove(object);
			}
		}
		if (!flag) {

			int temp = number % (array.length + 1);

			Integer j1 = Integer.valueOf(temp);
			Object ob1 = j1;

			arraylist = (ArrayList) hashmap.get(ob1);

			arraylist.add(object);

		}
		System.out.println(hashmap);

	}

	/**
	 * the method to replace the main string with user input
	 * 
	 * @param st
	 *            main string
	 * @param name
	 *            user name
	 * @param fullname
	 *            user fullname
	 * @param mn
	 *            user mobile number
	 * @param date
	 *            current date
	 */
	public void replacing(String string, String name, String fullname,
			String mobilenumber, String date) {
		String name1 = "<<name>>";
		String fullname1 = "<<full name>>";
		String mobilenum1 = "xxxxxxxxxx";
		String date1 = "01/01/2016";

		Pattern p;
		Matcher m;
		p = Pattern.compile(name1);
		m = p.matcher(string);
		string = m.replaceAll(name);

		p = Pattern.compile(fullname1);
		m = p.matcher(string);
		string = m.replaceAll(fullname);

		p = Pattern.compile(mobilenum1);
		m = p.matcher(string);
		string = m.replaceAll(mobilenumber);

		p = Pattern.compile(date1);
		m = p.matcher(string);
		string = m.replaceAll(date);

		System.out.println(string);

	}

	/**
	 * the method to find the binary trees
	 * 
	 * @param number
	 *            takes the number of nodes
	 * @return number of binary trees
	 */
	public int findingTrees(int number) {
		int sum = 0;
		if (number == 0)
			return 1;
		else if (number == 1)
			return 1;
		else if (number == 2)
			return 2;
		else {
			for (int i = 0; i < number; i++) {
				sum = sum + findingTrees(i) * findingTrees(number - i - 1);
			}
			return sum;
		}

	}

	/**
	 * the method
	 * 
	 * @param string1
	 * @param l
	 * @throws Exception
	 */
	public void searchingForWords(String string, ArrayList<String> arraylist)
			throws Exception {
		int index = arraylist.indexOf(string);
		System.out.println("index " + index);
		if (index >= 0) {
			arraylist.remove(index);
			filewriter = new FileWriter(
					"/home/bridgelabz6/javaprograms/JavaPrograms/src/com/bridgelabz/Programs/f1.txt");
			bufferwriter = new BufferedWriter(filewriter);
			String string1 = "";
			for (String string2 : arraylist) {
				string1 = string2 + " ";
				bufferwriter.write(string1);
			}
			bufferwriter.flush();
		} else {
			arraylist.add(string);

			filewriter = new FileWriter(
					"/home/bridgelabz6/javaprograms/JavaPrograms/src/com/bridgelabz/Programs/f1.txt");
			bufferwriter = new BufferedWriter(filewriter);
			String string1 = "";
			for (String string2 : arraylist) {
				string1 = string2 + " ";
				bufferwriter.write(string1);
			}
			bufferwriter.flush();
		}
		System.out.println();
	}

	/**
	 * the method to search the number is in list
	 * 
	 * @param num
	 *            the number to search
	 * @param arraylist
	 *            the arraylist
	 * @param array
	 *            the array of numbers
	 * @throws IOException
	 */
	public void searchNum(int number1, ArrayList<Integer> arraylist,
			int array[]) throws IOException {
		int index = arraylist.indexOf(number1);
		if (index >= 0) {
			System.out.println("number found  removed from list");
			arraylist.remove(index);
			filewriter = new FileWriter(
					"/home/bridgelabz6/javaprograms/JavaPrograms/src/com/bridgelabz/Programs/f2.txt");
			bufferwriter = new BufferedWriter(filewriter);
			String string2 = "";
			for (int number : arraylist) {
				string2 = number + " ";
				bufferwriter.write(string2);
			}
			bufferwriter.flush();
			System.out.println(arraylist);
		} else {
			System.out.println("not founded added into list");
			int array1[] = new int[array.length + 1];

			for (int i = 0; i < array1.length; i++) {
				if (i < array.length) {
					array1[i] = array[i];
				} else {
					array1[i] = number1;
				}
			}
			Arrays.sort(array1);
			arraylist.add(number1);
			System.out.print("[");
			for (int i = 0; i < array1.length; i++) {
				System.out.print(array1[i] + ", ");
			}
			System.out.print("]");
			filewriter = new FileWriter(
					"/home/bridgelabz6/javaprograms/JavaPrograms/src/com/bridgelabz/Programs/f2.txt");
			bufferwriter = new BufferedWriter(filewriter);
			String string2 = "";
			for (int string3 : arraylist) {
				string2 = string3 + " ";
				bufferwriter.write(string2);

				bufferwriter.flush();
			}

		}

	}

	/**
	 * the method to sort the numbers in arrays
	 * 
	 * @param string1
	 *            the string array
	 * @param array
	 *            the array
	 * @return the integer array
	 */
	public int[] sorting(String[] string1, int[] array) {
		for (int i = 0; i < string1.length; i++) {
			array[i] = Integer.parseInt(string1[i]);
		}
		Arrays.sort(array);
		return array;
	}

	/**
	 * the method to take input from the user
	 * @param array the 2-D array
	 * @return 2-D array
	 */
	public int[][] input(int[][] array) {
		System.out.println("Enter the elements");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		return array;
	}

}

/**
 * Node creation
 * 
 * @author bridgelabz6
 * 
 */
class Node {
	Object data;
	Node link;

	Node(Object data) {
		this.data = data;
		this.link = null;
	}

}

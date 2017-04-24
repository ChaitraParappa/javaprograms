package com.bridgelabz.Util;

import java.io.FileWriter;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonExample {
	Scanner scanner = new Scanner(System.in);
	int number;
	JSONObject jsonobject = new JSONObject();
	JSONArray rice = new JSONArray();
	JSONArray pulses = new JSONArray();
	JSONArray wheat = new JSONArray();
	JSONObject jsonobject1 = new JSONObject();

	public void addingrice() {
		System.out.println("Enter the number of entries");
		number = scanner.nextInt();
		for (int i = 0; i < number; i++) {
			System.out.println("Enter the name");
			jsonobject1.put("name", scanner.next());

			System.out.println("Enter the weight");
			jsonobject1.put("weight", scanner.next());

			System.out.println("Enter the price");
			jsonobject1.put("price", scanner.next());

			rice.add(jsonobject1);

			jsonobject.put("Rice", rice);

		}
		
		try {
			FileWriter filewriter = new FileWriter(
					"/home/bridgelabz6/javaprograms/JavaPrograms/src/com/bridgelabz/Programs/file1.json");
			;
			filewriter.write(jsonobject.toJSONString());
			filewriter.flush();
			System.out.println(jsonobject);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void addingpulses() {
		System.out.println("Enter the number of entries");
		number = scanner.nextInt();
		for (int i = 0; i < number; i++) {
			System.out.println("Enter the name");
			jsonobject1.put("name", scanner.next());

			System.out.println("Enter the weight");
			jsonobject1.put("weight", scanner.next());

			System.out.println("Enter the price");
			jsonobject1.put("price", scanner.next());

			pulses.add(jsonobject1);

			jsonobject.put("pulses", pulses);
		}
		try {
			FileWriter filewriter = new FileWriter(
					"/home/bridgelabz6/javaprograms/JavaPrograms/src/com/bridgelabz/Programs/file1.json");
			;
			filewriter.write(jsonobject.toJSONString());
			filewriter.flush();
			System.out.println(jsonobject);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void addingwheat() {
		System.out.println("Enter the number of entries");
		number = scanner.nextInt();
		for (int i = 0; i < number; i++) {
			System.out.println("Enter the name");
			jsonobject1.put("name", scanner.next());

			System.out.println("Enter the weight");
			jsonobject1.put("weight", scanner.next());

			System.out.println("Enter the price");
			jsonobject1.put("price", scanner.next());

			wheat.add(jsonobject1);

			jsonobject.put("Wheat", wheat);
	}
		try {
			FileWriter filewriter = new FileWriter(
					"/home/bridgelabz6/javaprograms/JavaPrograms/src/com/bridgelabz/Programs/file1.json");
			;
			filewriter.write(jsonobject.toJSONString());
			filewriter.flush();
			System.out.println(jsonobject);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

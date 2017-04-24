package com.bridgelabz.Programs;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import org.json.simple.parser.JSONParser;

import com.bridgelabz.Util.JsonExample;



class Json {

	public static void main(String[] args) {
		int number;
		JsonExample jsonexample=new JsonExample();
		Scanner scanner=new Scanner(System.in);
	do{
		System.out.println("Press 1-for rice");
		System.out.println("Press 2-for pulses");
		System.out.println("Press 3-for wheat");
		System.out.println("Press 4-exit");
		number=scanner.nextInt();
		
		switch(number)
		{
		case 1:jsonexample.addingrice();
		break;
		case 2:jsonexample.addingpulses();
		break;
		case 3:jsonexample.addingwheat();
		break;
		}
		
	}while(number<4);
		
	}

}

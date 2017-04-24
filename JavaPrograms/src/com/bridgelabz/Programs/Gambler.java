package com.bridgelabz.Programs;
import java.util.*;
import com.bridgelabz.Util.Utility;

class Gambler {
	public static void main(String[] args){
		
		Utility utility=new Utility();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the stake value ");
        int stake=scanner.nextInt();
        
        System.out.println("Enter the Goal value ");
        int goal=scanner.nextInt();
        
        System.out.println("Enter the Number of times to play ");
        int number=scanner.nextInt();
        
        utility.playGambler(stake,goal,number);
		
	}

}

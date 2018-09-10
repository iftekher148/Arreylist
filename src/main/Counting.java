package main;

import java.util.Scanner;

public class Counting {
	
	public static void main(String[] args) {
		 
		Scanner in = new Scanner (System.in);
		
		System.out.println("enter the random number:");
		double largest = in.nextDouble();
		
		while(in.hasNextDouble()){
			
			double input = in.nextDouble();
			
			if(input>largest) {
				
				largest = input;
			}
		}
				
				
		System.out.println(largest);		
				
	}
}	
				
				
				 
				
				
				
				
				
				
				
				
				
				
	



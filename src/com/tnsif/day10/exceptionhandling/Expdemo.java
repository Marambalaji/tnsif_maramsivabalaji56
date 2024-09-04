package com.tnsif.day10.exceptionhandling;

import java.util.Scanner;
public class Expdemo {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
	try {
		System.out.println("Enter the number:");
		int number=scanner.nextInt();
//		if(number%2==0)
//		{
//			System.out.println(number+" is a even");
//		}
//		else 
//		{
//			System.out.println(number+" is a odd");
//		}
		
		System.out.println(number%2==0?number+  "is even":number+ "is odd");
		}
	
	catch(Exception e) 
	{
		System.err.println("Invalid input...");
	}
	finally 
	{
		System.out.println("Is finally....");
		//scanner.close();
	}	
	}
}


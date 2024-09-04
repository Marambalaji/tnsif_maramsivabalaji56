package com.tnsif.day9.Interfaces.wrapperclassesr;


public class Wrapperclass {
	public static void main(String[] args) {

		
		//unboxing - converting explicitly
		Integer i =new Integer(10);
		System.out.println(i);
		int b=i.intValue();//it is a pre-defined function
		System.out.println(b);
		//without int value function
		int c=i;
		System.out.println(c);
		
		
		
		//AutoBoxing - converting Implicitly
		int a=100;
		Integer i1=a;
		System.out.println(i1);
	}
}

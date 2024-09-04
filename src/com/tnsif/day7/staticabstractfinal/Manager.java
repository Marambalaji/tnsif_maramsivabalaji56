package com.tnsif.day7.staticabstractfinal;

class Manager { //final class
	//final String name="archanaa"; //final variable
	final void show() {  //final method
		System.out.println("final statement");
	}
}
class dance extends Manager{
	void pick() {
		System.out.println("write");
	}
}
class Play extends dance{
	void dance() {
		System.out.println("print");
	}

public class Manager {

	public static void main(String[] args) {
		Play obj=new Play();
		obj.pick();
		obj.dance();
		obj.show();
	}
}
}


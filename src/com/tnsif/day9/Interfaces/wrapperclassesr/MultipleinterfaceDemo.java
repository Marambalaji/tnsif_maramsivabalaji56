package com.tnsif.day9.Interfaces.wrapperclassesr;

interface parent1{
	public void show();
}
interface parent2{
	public void disp();
	
}

class myclass{
	public void dispaly() {
		System.out.println("Method in class");
	}
}

class child extends myclass implements parent1,parent2{
	@Override
	public void disp() {
		System.out.println("hello this is balaji");
	}

	@Override
	public void show() {
		System.out.println("welcome");
		
	}
	
}


public class MultipleinterfaceDemo {
	public static void main(String[] args) {
		
		child obj=new child();
		obj.disp();
		obj.show();
		obj.dispaly();
	}

}

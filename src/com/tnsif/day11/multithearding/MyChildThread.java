package com.tnsif.day11.multithearding;

public class MyChildThread extends Thread {

	public void run() {
		System.out.println("In side run() Thread is alive"+ "or not"+this.isAlive());
		int no=0;
		while(no<4) {
			no++;
			System.out.println("number="+no);
			try {
				sleep(500); 
			}catch(Exception e) {
				System.err.println("Thread interputed");
			}
		}
	}

}

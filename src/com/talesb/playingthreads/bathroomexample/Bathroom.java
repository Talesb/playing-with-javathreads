package com.talesb.playingthreads.bathroomexample;

public class Bathroom {

 
	
	
	
	public void doTheNumber1() {

		String name = Thread.currentThread().getName();

 		synchronized (this) {
			System.out.println(name + " entering the bathroom");
			System.out.println(name + " doing something fast");

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(name + " flushing");
			System.out.println(name + " washing hands");
			System.out.println(name + " leaving bathroom");
 		}

	}

	public void doTheNumber2() {

		String name = Thread.currentThread().getName();

 		synchronized (this) {

			System.out.println(name + " entering the bathroom");
			System.out.println(name + " doing something slow");

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(name + " flushing");
			System.out.println(name + " washing hands");
			System.out.println(name + " leaving bathroom");
		}
 	}

}

package com.talesb.playingthreads.bathroomexample;

public class Main {

	public static void main(String[] args) {

		Bathroom bathroom = new Bathroom();

		Thread ghest1 = new Thread(() -> bathroom.doTheNumber1(), "Mike");
		Thread ghest2 = new Thread(() -> bathroom.doTheNumber2(), "Carl");
		Thread ghest3 = new Thread(() -> bathroom.doTheNumber1(), "John");
		Thread ghest4 = new Thread(() -> bathroom.doTheNumber2(), "Peter");
		
		ghest1.start();
		ghest2.start();
		ghest3.start();
		ghest4.start();
		
	}
}

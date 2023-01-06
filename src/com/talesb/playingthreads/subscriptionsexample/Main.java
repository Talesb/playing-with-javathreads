package com.talesb.playingthreads.subscriptionsexample;

public class Main {
	
	
	public static void main(String[] args) {
		
		String nameToSearch = "Dan";
		Thread authorsThread = new Thread(new SearchNameTask("autores.txt",nameToSearch ));
		Thread subscriptionsThread = new Thread(new SearchNameTask("assinaturas1.txt",nameToSearch ));
		Thread subscriptionsThread2 = new Thread(new SearchNameTask("assinaturas2.txt",nameToSearch ));
		
		authorsThread.start();
		subscriptionsThread.start();
		subscriptionsThread2.start();
		
	}

}

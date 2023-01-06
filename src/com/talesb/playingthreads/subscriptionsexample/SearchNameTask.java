package com.talesb.playingthreads.subscriptionsexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchNameTask implements Runnable {

	private String fileName;
	private String name;

	public SearchNameTask(String fileName, String name) {
		this.fileName = fileName;
		this.name = name;
	}

	@Override
	public void run() {

		try {

			Scanner scanner = new Scanner(new File(fileName));
			int lineNumber = 1;

			while (scanner.hasNext()) {

				String line = scanner.next();

				if (line.toLowerCase().contains(name.toLowerCase())) {
					System.out.println(fileName + " - " + lineNumber + " - " + line);

				}
				lineNumber++;

			}

			scanner.close();

		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}

	}

}

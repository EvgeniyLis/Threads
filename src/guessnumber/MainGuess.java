package guessnumber;

import java.util.Scanner;

public class MainGuess {

	public static void main(String[] args) {
		final int COUNTOFPLAYERS = 3;
		System.out.println("Enter the number");
		int goalNumber = new Scanner(System.in).nextInt();
		GuessThread[] guessThreads = new GuessThread[COUNTOFPLAYERS];
		for (int i = 0; i < guessThreads.length; i++) {
			guessThreads[i] = new GuessThread(new PlayerNum("Player "+(i+1), goalNumber));
		}
		System.out.println("Competition starts");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < guessThreads.length; i++) {
			guessThreads[i].start();
		}
		for (int i = 0; i < guessThreads.length; i++) {
			try {
				guessThreads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	}

}

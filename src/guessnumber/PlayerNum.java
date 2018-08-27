package guessnumber;

import java.util.Random;

public class PlayerNum {
	
	private String name;
	private String currentMessage;
	private int currentNumber;
	private int goalNumber;
	private int delta=5;
	private Random rnd = new Random();
	final int MINSLEEP = 300;
	final int MAXSLEEP = 1000;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCurrentMessage() {
		return currentMessage;
	}

	public void setCurrentMessage(String currentMessage) {
		this.currentMessage = currentMessage;
	}

	public int getCurrentNumber() {
		return currentNumber;
	}

	public void setCurrentNumber(int currentNumber) {
		this.currentNumber = currentNumber;
	}

	
	public int getGoalNumber() {
		return goalNumber;
	}

	public void setGoalNumber(int goalNumber) {
		this.goalNumber = goalNumber;
	}

	public PlayerNum(String name, int goalNumber) {
		super();
		this.name = name;
		//this.currentNumber = currentNumber;
		this.goalNumber = goalNumber;
		currentMessage = name +" calls ";
	}
	
	public int callNumber() {
		return rnd.nextInt((goalNumber+delta)-(goalNumber-delta))+(goalNumber-delta);
	}
	
	public int setSleepInterval() {
		return rnd.nextInt(MAXSLEEP-MINSLEEP)+MINSLEEP;
		
	}

	@Override
	public String toString() {
		return name + " ";
	}
	
	
	
	
	
	



}

package com.LockedMe;

public class Main {

	public static void main(String[] args) throws Exception {
		//instanciate class in main method
		LockedMe obj = new LockedMe();
		obj.startDisplay();
		
		String dir = null;

		System.out.println("Working dir: " + dir);
		obj.mainMenu();

	}}



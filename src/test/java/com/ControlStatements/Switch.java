package com.ControlStatements;

public class Switch {
	public static void main(String[] args) {
		
		//The switch statement is used when you want to compare a variable against many possible values.
		//It’s cleaner than using multiple else-if conditions.
		
		
		int empID=123;
		switch (empID) {
		case 1:
			System.out.println("One is invalid ID");
			break;
		case 2:
		System.out.println("Two is invalid ID");
		break;
		
		default:
			System.out.println("Need the valid empID");
			break;
		}
		
	}

}

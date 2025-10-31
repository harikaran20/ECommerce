package com.ControlStatements;

public class IF {
	public static void main(String[] args) {
		
		//The if statement is used to check a condition.
		//If the condition is true, the block of code inside if runs.
		//If it’s false, that block is skipped.
		
		// if-else statement provides two possible paths —
		//one runs when the condition is true,
		//and the other runs when it’s false.
		
		
		
		int empId = 190;
		
		if (empId == 189) {
			System.out.println("The employee ID is pass");
			
		} else {
			System.out.println("NEW Employee ID");

		}
		
		
		//////////////
		
		int ComID = 789;
		if (ComID ==1) {
			System.out.println("yes");
			
		}
		if (ComID == 9) {
			System.out.println("yesss");
			
		}
		if (ComID==789) {
			System.out.println("Valid Company ID");
			
		}
		
		////////////Ladder IF
		//The else-if ladder is used when there are multiple conditions to test.
		//The program checks each condition in order, and runs the block of the first true condition.
		
		int userID = 123;
		if (userID == 1) {
			System.out.println("userID is one");
			
		}
		else if (userID == 123) {
			System.out.println("UserID is two");
			
		}
		else if (userID==3) {
			System.out.println("UserID is three");
			
		}
		else {
			System.out.println("UserID Is Ready");
		}

		
		
	}
		

	

}

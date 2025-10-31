package com.ControlStatements;

public class DoWhiles {
	public static void main(String[] args) {
		
		//A do-while loop is similar to a while loop,
	//	but the key difference is:
		//	👉 The code runs at least once, even if the condition is false.

			//That’s because the condition is checked after executing the loop body.
		int empID=100;
		do {
			System.out.println(empID);
			empID= empID+1;
			
		} while (empID <=1000);
		System.out.println(empID);
		
		
	}

}

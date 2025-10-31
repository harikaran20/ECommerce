package com.ControlStatements;

public class NesterIF {
	public static void main(String[] args) {
		
		
		
		//A nested if means an if statement inside another if.
		//It’s used when one condition depends on another —
		//i.e., the inner condition will be checked only if the outer condition is true.
		int empID=123;
		int empSalary=789870;
		
		if (empID==123) {
			if (empSalary ==789000) {
				System.out.println("The salary is differ");
			}
			else {
				System.out.println("Employee ID is correct,But He needs the high salary");
			}
			
		}else {
			System.out.println("Need the new empID");
		}
		
	}
	
	

}

package com.baseClass;

public class One {
	private int empId = 123;
	
	public void empID() {
		// print the employee id (keeps existing behavior)
		System.out.println(empId);

	}
	
	public void empName() {
		System.out.println("EMP");
		

	}

	// New method: returns the employee id as an int
	public int getEmpID() {
		return empId;
	}

}
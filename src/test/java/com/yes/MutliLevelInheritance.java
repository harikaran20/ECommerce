package com.yes;

public class MutliLevelInheritance extends SI{
	private void own() {
		System.out.println("WIN");

	}
	
	public static void main(String[] args) {
		MutliLevelInheritance mli = new MutliLevelInheritance();
		mli.own();
		mli.userID();
		mli.userName();
		mli.userSalary();
		
		
		
	}
	

}

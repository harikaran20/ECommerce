package com.abstarction;

public  class AXIS extends ICICI {
	 @Override
	public void deposit() {
		System.out.println("10000000");
	}
	 
	 @Override
	public void savings() {
		System.out.println("The savings is 7800000");
		
	}
	 
	 @Override
	public void loan() {
		 System.out.println("You done the loan");
		
	}
	 
	 public static void main(String[] args) {
		AXIS a = new AXIS();
		a.deposit();
		a.savings();
		a.loan();
		
	}
	
}

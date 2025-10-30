package com.abstarction;

public class FullyAbsBank implements FullyAbstraction {

	@Override
	public void saving() {
		System.out.println("1");
	}

	@Override
	public void deposit() {
		System.out.println("2");
		
	}

	@Override
	public void loan() {
		System.out.println("3");
		
	}
	
	public static void main(String[] args) {
		FullyAbsBank flb = new FullyAbsBank();
		flb.saving();
		flb.deposit();
		flb.loan();
	}

}

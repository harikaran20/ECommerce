package com.yes;

public class MethodOverRiding extends MethodOverLoading{
	private void icicibank() {
		System.out.println("7 per Interest");

	}
	@Override
	public void empDetails() {
		System.out.println("10 per interest");
	}
	public static void main(String[] args) {
		MethodOverRiding mor = new MethodOverRiding();
		mor.icicibank();
		mor.empDetails();
		
		
		
		
	}
	
	

}

package com.baseClass;

public class Two {
	public void compID() {
		System.out.println("COMPANY");

	}
	public void main(String[] args) {
		One one = new One();
		one.empID();
		one.empName();
		 Two two = new Two();
		 two.compID();
	}
}

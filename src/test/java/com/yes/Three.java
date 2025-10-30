package com.yes;

import com.baseClass.*;

public class Three {
	private void clientID() {
		System.out.println("90909090909090");

	}
	public static void main(String[] args) {
		Three three = new Three();
	    three.clientID();
		
		One one = new One();
		Two two = new Two();
		one.empID();
		one.empName();
		two.compID();
		
		
	}

}

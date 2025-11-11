package com.ControlStatements;

import org.apache.poi.ss.formula.functions.Count;

public class FOR {
	public static void main(String[] args) {
		int n=1;
		for(int cou=1;cou<=5;cou =cou+1) {
			System.out.println("*");
		}
		
		
		for(n=1;n<=20;n++) {
			//System.out.println(n);
			if (n%2==0) {
				System.out.println("Even number is " +n);
				
			}
			
		}
	
	
	}
}

//2 *
//3 *
//4 *
//5 *
//6 *